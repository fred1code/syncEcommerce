
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * @author fredy
 * <h1>prestashop library </h1>
 * <p>
 * This class has methods that e-commerce includes adding or ordering
 * 
 * </p>
 * 
 * 
 */
public class PSWebServiceWrapper {

    private final String shopUrl;
    private final String key;
    private final boolean debug;
    private PSWebServiceClient ws;

    /*
    public PSWebServiceWrapper() {
        this.ws = new PSWebServiceClient(shopUrl, key, debug);
    }*/

    public PSWebServiceWrapper(String shopUrl, String key, boolean debug) {
        this.shopUrl = shopUrl;
        this.key = key;
        this.debug = debug;
        this.ws = new PSWebServiceClient(shopUrl, key, debug);
    }

    public ProductResponse addProduct(ar articulo, String cat) throws PrestaShopWebserviceException, TransformerException, IOException {

        HashMap<String, Object> getSchemaOpt = new HashMap();
        getSchemaOpt.put("url", shopUrl + "/api/products?schema=blank");
        Document schema = ws.get(getSchemaOpt);

        schema.getElementsByTagName("id_category_default").item(0).setTextContent("2");
        schema.getElementsByTagName("reference").item(0).setTextContent(articulo.getArticulo().getCategoria().getDepartamento().getNombre());
        schema.getElementsByTagName("supplier_reference").item(0).setTextContent("");
        schema.getElementsByTagName("location").item(0).setTextContent("");
        schema.getElementsByTagName("quantity").item(0).setTextContent("300");
        schema.getElementsByTagName("additional_delivery_times").item(0).setTextContent("1");
        schema.getElementsByTagName("redirect_type").item(0).setTextContent("301-category");
        schema.getElementsByTagName("state").item(0).setTextContent("1");
        schema.getElementsByTagName("pack_stock_type").item(0).setTextContent("3");
        schema.getElementsByTagName("id_tax_rules_group").item(0).setTextContent("1");
        schema.getElementsByTagName("price").item(0).setTextContent(articulo.getPrecio1().toString());
        schema.getElementsByTagName("active").item(0).setTextContent("1");
        schema.getElementsByTagName("available_for_order").item(0).setTextContent("1");
        schema.getElementsByTagName("show_price").item(0).setTextContent("1");
        schema.getElementsByTagName("indexed").item(0).setTextContent("1");

        Element category = schema.createElement("category");
        Element catId = schema.createElement("id");
        catId.setTextContent(cat);
        category.appendChild(catId);
        schema.getElementsByTagName("categories").item(0).appendChild(category);

        Element name = (Element) schema.getElementsByTagName("name").item(0).getFirstChild();
        name.appendChild(schema.createCDATASection("&|" + articulo.getArticulo().getDescripcion()));
        name.setAttribute("id", "1");
        name.setAttribute("xlink:href", this.shopUrl + "/api/languages/" + 1);

        Element description = (Element) schema.getElementsByTagName("description").item(0).getFirstChild();
        description.appendChild(schema.createCDATASection("<p><span style='font-size:10pt;font-family:Arial;font-style:normal;'>" + articulo.getArticulo().getCaracteristicas() + "</span></p>"));
        description.setAttribute("id", "1");
        description.setAttribute("xlink:href", this.shopUrl + "/api/languages/" + 1);

        Element description_short = (Element) schema.getElementsByTagName("description_short").item(0).getFirstChild();
        description_short.appendChild(schema.createCDATASection("<p><span style='font-size:10pt;font-family:Arial;font-style:normal;'>" + articulo.getArticulo().getDescripcion() + "</span></p>"));
        description_short.setAttribute("id", "1");
        description_short.setAttribute("xlink:href", this.shopUrl + "/api/languages/" + 1);

        Element link_rewrite = (Element) schema.getElementsByTagName("link_rewrite").item(0).getFirstChild();
        link_rewrite.appendChild(schema.createCDATASection(articulo.getArticulo().getDescripcion()));
        link_rewrite.setAttribute("id", "1");
        link_rewrite.setAttribute("xlink:href", this.shopUrl + "/api/languages/" + 1);

        Element meta_title = (Element) schema.getElementsByTagName("meta_title").item(0).getFirstChild();
        meta_title.appendChild(schema.createCDATASection(articulo.getArticulo().getDescripcion()));
        meta_title.setAttribute("id", "1");
        meta_title.setAttribute("xlink:href", this.shopUrl + "/api/languages/" + 1);

        Element meta_description = (Element) schema.getElementsByTagName("meta_description").item(0).getFirstChild();
        meta_description.appendChild(schema.createCDATASection(articulo.getArticulo().getDescripcion()));
        meta_description.setAttribute("id", "1");
        meta_description.setAttribute("xlink:href", this.shopUrl + "/api/languages/" + 1);

        Element meta_keywords = (Element) schema.getElementsByTagName("meta_keywords").item(0).getFirstChild();
        meta_keywords.appendChild(schema.createCDATASection(articulo.getArticulo().getDescripcion()));
        meta_keywords.setAttribute("id", "1");
        meta_keywords.setAttribute("xlink:href", this.shopUrl + "/api/languages/" + 1);

        Element available_now = (Element) schema.getElementsByTagName("available_now").item(0).getFirstChild();
        available_now.appendChild(schema.createCDATASection(articulo.getArticulo().getClave()));
        available_now.setAttribute("id", "1");
        available_now.setAttribute("xlink:href", this.shopUrl + "/api/languages/" + 1);

        Element available_later = (Element) schema.getElementsByTagName("available_later").item(0).getFirstChild();
        available_later.appendChild(schema.createCDATASection(articulo.getArticulo().getClave()));
        available_later.setAttribute("id", "1");
        available_later.setAttribute("xlink:href", this.shopUrl + "/api/languages/" + 1);

        HashMap<String, Object> productOpt = new HashMap();
        productOpt.put("resource", "products");
        productOpt.put("postXml", ws.DocumentToString(schema));
        System.out.println(ws.DocumentToString(schema));
        Document product = ws.add(productOpt);
        NodeList item = product.getElementsByTagName("stock_availables").item(0).getChildNodes().item(1).getChildNodes();
        String stock = null;
        for (int i = 0; i < item.getLength(); i++) {
            Node node = item.item(i);
            if (node.getNodeName().equals("id")) {
                stock = node.getTextContent();
                System.out.println("Stock: " + stock);
                break;
            }
        }

        String productId = product.getElementsByTagName("id").item(0).getTextContent();
        return new ProductResponse(productId, stock);
    }

    public static String getCharacterDataFromElement(Element e) {

        NodeList list = e.getChildNodes();
        String data;

        for (int index = 0; index < list.getLength(); index++) {
            if (list.item(index) instanceof CharacterData) {
                CharacterData child = (CharacterData) list.item(index);
                data = child.getData();

                if (data != null && data.trim().length() > 0) {
                    return child.getData();
                }
            }
        }
        return "";
    }

    public String addCategory(Categoria categoria) throws PrestaShopWebserviceException, TransformerException {

        System.out.println("hola alv");
        //  id_parent , level_depth, nleft, nright
        HashMap<String, Object> getSchemaOpt = new HashMap();

        getSchemaOpt.put("url", shopUrl + "/api/categories?schema=blank");
        Document schema = ws.get(getSchemaOpt);

        schema.getElementsByTagName("id_parent").item(0).setTextContent("2");
        schema.getElementsByTagName("active").item(0).setTextContent("1");
        schema.getElementsByTagName("id_shop_default").item(0).setTextContent("2");
        schema.getElementsByTagName("position").item(0).setTextContent("0");
        schema.getElementsByTagName("is_root_category").item(0).setTextContent("0");

        Element name = (Element) schema.getElementsByTagName("name").item(0).getFirstChild();
        name.appendChild(schema.createCDATASection(categoria.getNombre()));
        name.setAttribute("id", "1");
        name.setAttribute("xlink:href", this.shopUrl + "/api/languages/" + 1);

        Element descripcion = (Element) schema.getElementsByTagName("description").item(0).getFirstChild();
        descripcion.appendChild(schema.createCDATASection("<p><span style='font-size:10pt;font-family:Arial;font-style:normal;'>" + categoria.getNombre() + "</span></p>"));
        descripcion.setAttribute("id", "1");
        descripcion.setAttribute("xlink:href", this.shopUrl + "/api/languages/" + 1);

        Element link_rewrite = (Element) schema.getElementsByTagName("link_rewrite").item(0).getFirstChild();
        System.out.println("Cat: " + categoria.getNombre());
        link_rewrite.appendChild(schema.createCDATASection(categoria.getNombre().trim().replace(" ", "_")));
        link_rewrite.setAttribute("id", "1");
        link_rewrite.setAttribute("xlink:href", this.shopUrl + "/api/languages/" + 1);

        HashMap<String, Object> categoryOpts = new HashMap();
        categoryOpts.put("resource", "categories");
        categoryOpts.put("postXml", ws.DocumentToString(schema));
        Document category = ws.add(categoryOpts);
        System.out.println(ws.DocumentToString(schema));

        return category.getElementsByTagName("id").item(0).getTextContent();
    }

    public String addStockAvailable(String stockId, String artId, String existencia) throws PrestaShopWebserviceException, TransformerException {

        HashMap<String, Object> getSchemaOpt = new HashMap();
        getSchemaOpt.put("url", shopUrl + "/api/stock_availables/" + stockId);
        Document schema = ws.get(getSchemaOpt);

        HashMap<String, Object> getSchema = new HashMap();
        getSchema.put("url", shopUrl + "/api/stock_availables?schema=blank");
        Document schema1 = ws.get(getSchema);

        String id_product_attribute = schema.getElementsByTagName("id_product_attribute").item(0).getTextContent();

        schema1.getElementsByTagName("id").item(0).setTextContent(stockId);
        schema1.getElementsByTagName("id_product").item(0).setTextContent(artId);
        schema1.getElementsByTagName("quantity").item(0).setTextContent(existencia);
        schema1.getElementsByTagName("id_shop").item(0).setTextContent("1");
        schema1.getElementsByTagName("out_of_stock").item(0).setTextContent("0");
        schema1.getElementsByTagName("depends_on_stock").item(0).setTextContent("0");
        schema1.getElementsByTagName("id_product_attribute").item(0).setTextContent(id_product_attribute);

        System.out.println(ws.DocumentToString(schema1));

        HashMap<String, Object> stockOps = new HashMap();
        stockOps.put("resource", "stock_availables");
        stockOps.put("id", stockId);
        stockOps.put("putXml", ws.DocumentToString(schema1));
        Document stock = ws.edit(stockOps);
        return stock.getElementsByTagName("id").item(0).getTextContent();
    }

    public String addTax(String taxName, String rate) throws PrestaShopWebserviceException, TransformerException {

        HashMap<String, Object> getSchemaOpt = new HashMap();
        getSchemaOpt.put("url", shopUrl + "/api/tax?schema=blank");
        Document schema = ws.get(getSchemaOpt);

        schema.getElementsByTagName("rate").item(0).setTextContent(rate);
        schema.getElementsByTagName("active").item(0).setTextContent("1");
        schema.getElementsByTagName("deleted").item(0).setTextContent("0");

        Element name = (Element) schema.getElementsByTagName("name").item(0).getFirstChild();
        name.appendChild(schema.createCDATASection(taxName));
        name.setAttribute("id", "1");
        name.setAttribute("xlink:href", this.shopUrl + "/api/languages/" + 1);

        System.out.println(ws.DocumentToString(schema));

        HashMap<String, Object> taxOps = new HashMap();
        taxOps.put("resource", "tax");
        taxOps.put("postXml", ws.DocumentToString(schema));
        Document stock = ws.add(taxOps);
        return stock.getElementsByTagName("id").item(0).getTextContent();
    }

    public String addTaxRuleGroup(String taxName) throws PrestaShopWebserviceException, TransformerException {
        HashMap<String, Object> getSchemaOpt = new HashMap();
        getSchemaOpt.put("url", shopUrl + "/api/tax_rule_groups?schema=blank");
        Document schema = ws.get(getSchemaOpt);

        schema.getElementsByTagName("name").item(0).setTextContent(taxName);
        schema.getElementsByTagName("active").item(0).setTextContent("1");
        schema.getElementsByTagName("deleted").item(0).setTextContent("0");

        HashMap<String, Object> taxOps = new HashMap();
        taxOps.put("resource", "tax_rule_groups");
        taxOps.put("postXml", ws.DocumentToString(schema));
        Document stock = ws.add(taxOps);
        return stock.getElementsByTagName("id").item(0).getTextContent();
    }

    public String addTaxRule(String txgroup, String country, String taxId) throws PrestaShopWebserviceException, TransformerException {
        HashMap<String, Object> getSchemaOpt = new HashMap();
        getSchemaOpt.put("url", shopUrl + "/api/tax_rules?schema=blank");
        Document schema = ws.get(getSchemaOpt);

        schema.getElementsByTagName("id_tax_rules_group").item(0).setTextContent(txgroup);
        schema.getElementsByTagName("id_country").item(0).setTextContent(country);
        schema.getElementsByTagName("zipcode_from").item(0).setTextContent("0");
        schema.getElementsByTagName("zipcode_to").item(0).setTextContent("0");
        schema.getElementsByTagName("id_tax").item(0).setTextContent(taxId);
        schema.getElementsByTagName("behavior").item(0).setTextContent("0");

        HashMap<String, Object> taxRulesOps = new HashMap();
        taxRulesOps.put("resource", "tax_rules");
        taxRulesOps.put("postXml", ws.DocumentToString(schema));
        Document stock = ws.add(taxRulesOps);
        return stock.getElementsByTagName("id").item(0).getTextContent();
    }

    public int addImg(byte[] img, String artId) throws JAXBException {

        try {
            Document addImg = ws.addImg(img, Integer.parseInt(artId));
           // System.out.println(ws.DocumentToString(addImg));

            //    System.out.println("///////////////////////////////" + ws.DocumentToString(addImg) + "////////////////////////////////////////////////////");
            Prestashop1 prestashop = (Prestashop1) Utils.unmarshall(Prestashop1.class, ws.DocumentToString(addImg));
            //  System.out.println("/////////img unmarshall///////////" + prestashop.getImage().getId() + "/////////////////////////////////////////");

            return prestashop.getImage().getId();

            //   return Optional.of(prestashop.getOrderState());
        } catch (PrestaShopWebserviceException ex) {
            Logger.getLogger(PSWebServiceWrapper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PSWebServiceWrapper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(PSWebServiceWrapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public AddressPS getAddress(String addressId) throws PrestaShopWebserviceException {
        HashMap<String, Object> getSchemaOpt = new HashMap();
        getSchemaOpt.put("url", shopUrl + "/api/addresses/" + addressId);
        Document schema = ws.get(getSchemaOpt);

        return new AddressPS();
    }
}
