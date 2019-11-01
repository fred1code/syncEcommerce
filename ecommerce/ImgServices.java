
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fredy
 * <h1>ImgService class</h1>
 */
public class ImgServices {

    String dominio;
    String key;

    public ImgServices(String dominio, String key) {
        this.dominio = dominio;
        this.key = key;
    }

    public ImgServices() {
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "EcommerceWsController{" + "dominio=" + dominio + ", key=" + key + '}';
    }

    public HttpResponse<String> getEcommerceId(int ID) {
        try {
            return Unirest.get(dominio + "/api/Sincro/" + ID + "/?ws_key=" + key)
                    .asString();
        } catch (UnirestException ex) {
            Logger.getLogger(ImgServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> setInfoImg(Long id_product_, long id_img_, int id_img_ecommerce, int id_product_ecommerce) {
        try {
            return Unirest.get(dominio + "/api/AgreInfoImg?id_product_=" + id_product_ + "&id_img_=" + id_img_ + "&id_img_ecommerce=" + id_img_ecommerce + "&id_product_ecommerce=" + id_product_ecommerce + "&ws_key=" + key)
                    .asString();
        } catch (UnirestException ex) {
            Logger.getLogger(ImgServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> setDisableImg(int id_img) {
        try {
            return Unirest.get(dominio + "/api/DisableImg?id_img=" + id_img + "&ws_key=" + key).asString();
        } catch (UnirestException ex) {
            Logger.getLogger(ImgServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> setEnableImg(int id_img) {
        try {
            return Unirest.get(dominio + "/api/EnableImg?id_img=" + id_img + "&ws_key=" + key).asString();
        } catch (UnirestException ex) {
            Logger.getLogger(ImgServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> getListImgIds(int id_img) {

        try {
            return Unirest.get(dominio + "/api/GetListImgIds?id_img=" + id_img + "&ws_key=" + key).asString();
        } catch (UnirestException e) {
            Logger.getLogger(ImgServices.class.getName()).log(Level.SEVERE, null, e);

        }

        return null;
    }

    public HttpResponse<String> getImgIfExist(int id_img, int id_articulo) {
        try {
            return Unirest.get(dominio + "/api/GetImgIsExist?id_product_=" + id_articulo + "&id_img_=" + id_img + "&ws_key=" + key).asString();
        } catch (UnirestException e) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;
    }

    public HttpResponse<String> getIfEcommerceSync() {
        try {
            return Unirest.get(dominio + "/api/EcommerceSync&ws_key=" + key).asString();
        } catch (UnirestException e) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public HttpResponse<String> getFullListImg() {
        try {
            return Unirest.get(dominio + "/api/GetFullImgIds&ws_key=" + key).asString();
        } catch (UnirestException e) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

}
