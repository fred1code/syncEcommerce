

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author www.zydor.pl
 * <h1>  PSWebServiceClient </h1>
 * <p>
 * class used  from ecommerce insert data in ecommerce
 * 
 * </p>
 * 
 * 
 */
public class PSWebServiceClient {

    protected String url;
    protected String key;
    protected boolean debug;

    private final CloseableHttpClient httpclient;
    private CloseableHttpResponse response;
    private HashMap<String, Object> responseReturns;

    public PSWebServiceClient(String url, String key, boolean debug) {
        this.url = url;
        this.key = key;
        this.debug = debug;

        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(
                AuthScope.ANY,
                new UsernamePasswordCredentials(key, ""));

        this.httpclient = HttpClients.custom()
                .setDefaultCredentialsProvider(credsProvider)
                .build();
    }

    protected void checkStatusCode(int status_code) throws PrestaShopWebserviceException {

        String error_label = "This call to PrestaShop Web Services failed and returned an HTTP status of %d. That means: %s.";
        switch (status_code) {
            case 200:
            case 201:
                break;
            case 204:
                throw new PrestaShopWebserviceException(String.format(error_label, status_code, "No content"), this);
            case 400:
                throw new PrestaShopWebserviceException(String.format(error_label, status_code, "Bad Request"), this);
            case 401:
                throw new PrestaShopWebserviceException(String.format(error_label, status_code, "Unauthorized"), this);
            case 404:
                throw new PrestaShopWebserviceException(String.format(error_label, status_code, "Not Found"), this);
            case 405:
                throw new PrestaShopWebserviceException(String.format(error_label, status_code, "Method Not Allowed"), this);
            case 500:
                throw new PrestaShopWebserviceException(String.format(error_label, status_code, "Internal Server Error"), this);
            default:
                throw new PrestaShopWebserviceException("This call to PrestaShop Web Services returned an unexpected HTTP status of:" + status_code);
        }
    }

    protected String getResponseContent() {
        try {
            return readInputStreamAsString((InputStream) this.responseReturns.get("response"));
        } catch (IOException ex) {
            return "";
        }
    }

    protected HashMap<String, Object> executeRequest(HttpUriRequest request) throws PrestaShopWebserviceException {

        HashMap<String, Object> returns = new HashMap<>();

        try {
            response = httpclient.execute(request);
            Header[] headers = response.getAllHeaders();
            HttpEntity entity = response.getEntity();

            if (this.debug) {
                System.out.println("Status:  " + response.getStatusLine());
                System.out.println("====================Header======================");
                for (Header h : headers) {
                    System.out.println(h.getName() + " : " + h.getValue());
                }

            }

            returns.put("status_code", response.getStatusLine().getStatusCode());
            returns.put("response", entity.getContent());
            returns.put("header", headers);

            this.responseReturns = returns;

        } catch (IOException ex) {
            throw new PrestaShopWebserviceException("Bad HTTP response : " + ex.toString());
        }

        return returns;
    }

    protected Document parseXML(InputStream responseBody) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        //System.out.println(responseBody);
        return docBuilder.parse(responseBody);
    }

    public Document add(Map<String, Object> opt) throws PrestaShopWebserviceException {
        if ((opt.containsKey("resource") && opt.containsKey("postXml")) || (opt.containsKey("url") && opt.containsKey("postXml"))) {
            String completeUrl;
            completeUrl = (opt.containsKey("resource") ? this.url + "/api/" + (String) opt.get("resource") : (String) opt.get("url"));
            String xml = (String) opt.get("postXml");
            if (opt.containsKey("id_shop")) {
                completeUrl += "&id_shop=" + (String) opt.get("id_shop");
            }
            if (opt.containsKey("id_group_shop")) {
                completeUrl += "&id_group_shop=" + (String) opt.get("id_group_shop");
            }

            StringEntity entity = new StringEntity(xml, ContentType.create("text/xml", Consts.UTF_8));

            HttpPost httppost = new HttpPost(completeUrl);
            httppost.setEntity(entity);

            HashMap<String, Object> resoult = this.executeRequest(httppost);
            this.checkStatusCode((Integer) resoult.get("status_code"));

            try {
                Document doc = this.parseXML((InputStream) resoult.get("response"));
                response.close();
                return doc;
            } catch (ParserConfigurationException | SAXException | IOException ex) {
                throw new PrestaShopWebserviceException("Response XML Parse exception");
            }

        } else {
            throw new PrestaShopWebserviceException("Bad parameters given");
        }

    }

    public Document get(Map<String, Object> opt) throws PrestaShopWebserviceException {
        String completeUrl;
        if (opt.containsKey("url")) {
            completeUrl = (String) opt.get("url");
        } else if (opt.containsKey("resource")) {
            completeUrl = this.url + "/api/" + opt.get("resource");
            if (opt.containsKey("id")) {
                completeUrl += "/" + opt.get("id");
            }

            String[] params = new String[]{"filter", "display", "sort", "limit", "id_shop", "id_group_shop"};
            for (String p : params) {
                if (opt.containsKey("p")) {
                    try {
                        completeUrl += "?" + p + "=" + URLEncoder.encode((String) opt.get(p), "UTF-8") + "&";
                    } catch (UnsupportedEncodingException ex) {
                        throw new PrestaShopWebserviceException("URI encodin excepton: " + ex.toString());
                    }
                }
            }

        } else {
            throw new PrestaShopWebserviceException("Bad parameters given");
        }

        HttpGet httpget = new HttpGet(completeUrl);
        HashMap<String, Object> resoult = this.executeRequest(httpget);

        this.checkStatusCode((int) resoult.get("status_code"));// check the response validity

        try {
            Document doc = this.parseXML((InputStream) resoult.get("response"));
            response.close();
            return doc;
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            throw new PrestaShopWebserviceException("Response XML Parse exception: " + ex.toString());
        }

    }

    public Map<String, String> head(Map<String, Object> opt) throws PrestaShopWebserviceException {
        String completeUrl;
        if (opt.containsKey("url")) {
            completeUrl = (String) opt.get("url");
        } else if (opt.containsKey("resource")) {
            completeUrl = this.url + "/api/" + opt.get("resource");
            if (opt.containsKey("id")) {
                completeUrl += "/" + opt.get("id");
            }

            String[] params = new String[]{"filter", "display", "sort", "limit"};
            for (String p : params) {
                if (opt.containsKey("p")) {
                    try {
                        completeUrl += "?" + p + "=" + URLEncoder.encode((String) opt.get(p), "UTF-8") + "&";
                    } catch (UnsupportedEncodingException ex) {
                        throw new PrestaShopWebserviceException("URI encodin excepton: " + ex.toString());
                    }
                }
            }

        } else {
            throw new PrestaShopWebserviceException("Bad parameters given");
        }

        HttpHead httphead = new HttpHead(completeUrl);
        HashMap<String, Object> resoult = this.executeRequest(httphead);
        this.checkStatusCode((int) resoult.get("status_code"));// check the response validity

        HashMap<String, String> headers = new HashMap();
        for (Header h : (Header[]) resoult.get("header")) {
            headers.put(h.getName(), h.getValue());
        }
        return headers;
    }

    public Document edit(Map<String, Object> opt) throws PrestaShopWebserviceException {

        String xml = "";
        String completeUrl;
        if (opt.containsKey("url")) {
            completeUrl = (String) opt.get("url");
        } else if (((opt.containsKey("resource") && opt.containsKey("id")) || opt.containsKey("url")) && opt.containsKey("putXml")) {
            completeUrl = (opt.containsKey("url")) ? (String) opt.get("url") : this.url + "/api/" + opt.get("resource") + "/" + opt.get("id");
            xml = (String) opt.get("putXml");
            if (opt.containsKey("id_shop")) {
                completeUrl += "&id_shop=" + opt.get("id_shop");
            }
            if (opt.containsKey("id_group_shop")) {
                completeUrl += "&id_group_shop=" + opt.get("id_group_shop");
            }
        } else {
            throw new PrestaShopWebserviceException("Bad parameters given");
        }

        StringEntity entity = new StringEntity(xml, ContentType.create("text/xml", Consts.UTF_8));

        HttpPut httpput = new HttpPut(completeUrl);
        httpput.setEntity(entity);
        HashMap<String, Object> resoult = this.executeRequest(httpput);
        this.checkStatusCode((int) resoult.get("status_code"));// check the response validity

        try {
            Document doc = this.parseXML((InputStream) resoult.get("response"));
            response.close();
            return doc;
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            throw new PrestaShopWebserviceException("Response XML Parse exception: " + ex.toString());
        }
    }

    public boolean delete(Map<String, Object> opt) throws PrestaShopWebserviceException {
        String completeUrl = "";
        if (opt.containsKey("url")) {
            completeUrl = (String) opt.get("url");
        } else if (opt.containsKey("resource") && opt.containsKey("id"))
        {
            completeUrl = this.url + "/api/" + opt.get("resource") + "/" + opt.get("id");
        }

        if (opt.containsKey("id_shop")) {
            completeUrl += "&id_shop=" + opt.get("id_shop");
        }
        if (opt.containsKey("id_group_shop")) {
            completeUrl += "&id_group_shop=" + opt.get("id_group_shop");
        }

        HttpDelete httpdelete = new HttpDelete(completeUrl);
        HashMap<String, Object> resoult = this.executeRequest(httpdelete);

        this.checkStatusCode((int) resoult.get("status_code"));// check the response validity    

        return true;
    }

    public Document addImg(byte[] img, Integer productId) throws PrestaShopWebserviceException, MalformedURLException, IOException {
        String completeUrl = this.url + "/api/images/products/" + String.valueOf(productId);
        HttpPost httppost = new HttpPost(completeUrl);

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
        builder.addPart("image", new ByteArrayBody(img, "upload.jpg"));

        HttpEntity entity = builder.build();
        httppost.setEntity(entity);

        HashMap<String, Object> resoult = this.executeRequest(httppost);
        this.checkStatusCode((Integer) resoult.get("status_code"));

        try {
            Document doc = this.parseXML((InputStream) resoult.get("response"));
            response.close();
            return doc;
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            throw new PrestaShopWebserviceException("Response XML Parse exception");
        }
    }

    private String readInputStreamAsString(InputStream in)
            throws IOException {

        BufferedInputStream bis = new BufferedInputStream(in);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        int result = bis.read();
        while (result != -1) {
            byte b = (byte) result;
            buf.write(b);
            result = bis.read();
        }

        String returns = buf.toString();
        return returns;
    }

    public String DocumentToString(Document doc) throws TransformerException {
        TransformerFactory transfac = TransformerFactory.newInstance();
        Transformer trans = transfac.newTransformer();
        trans.setOutputProperty(OutputKeys.METHOD, "xml");
        trans.setOutputProperty(OutputKeys.INDENT, "yes");
        trans.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", Integer.toString(2));

        StringWriter sw = new StringWriter();
        StreamResult result = new StreamResult(sw);
        DOMSource source = new DOMSource(doc.getDocumentElement());

        trans.transform(source, result);
        String xmlString = sw.toString();

        return xmlString;
    }

    
}
