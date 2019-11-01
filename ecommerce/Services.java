
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fredy
 *
 * <h1> Services ecommerce </h1>
 * <p>
 * This class is used to consume ecommerce web services
 * </p>
 *
 */
public class Services extends Service {

    public Services(String dominio, String webkey, boolean debug) {
        super(dominio, webkey, debug);
    }

    public HttpResponse<String> getAddress(int idaAdreess) {
        try {
            return Unirest.get(dominio + "/api/addresses/" + idaAdreess + "/?ws_key=" + webkey)
                    .asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> getAddressCount() {

        try {
            return Unirest.get(dominio + "/api/addresses/?ws_key=" + webkey).asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> getCarriers(int idCarrier) {
        try {
            return Unirest.get(dominio + "/api/carriers/" + idCarrier + "/?ws_key=" + webkey).asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> getCarts(int idCart) {
        try {
            return Unirest.get(dominio + "/api/carts/" + idCart + "/?ws_key=" + webkey).asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> getCart() {

        try {
            return Unirest.get(dominio + "/api/carts//?ws_key=" + webkey).asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> getCustomer(int idCustomer) {
        try {
            return Unirest.get(dominio + "/api/customers/" + idCustomer + "/?ws_key=" + webkey)
                    .asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> getOrderDetails(int idOrderDetails) {
        try {
            return Unirest.get(dominio + "/api/order_details/" + idOrderDetails + "/?ws_key=" + webkey)
                    .asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> getOrderHistories(int idOrderHistories) {
        try {
            return Unirest.get(dominio + "/api/order_histories/" + idOrderHistories + "/?ws_key=" + webkey)
                    .asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> getOrderState(int idStateOrder) {
        try {
            return Unirest.get(dominio + "/api/order_states/" + idStateOrder + "/?ws_key=" + webkey)
                    .asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> getOrder(int idOrder) {
        try {
            return Unirest.get(dominio + "/api/orders/" + idOrder + "/?ws_key=" + webkey).asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> getOrderCarries(int idOrderCarrier) {
        try {
            return Unirest.get(dominio + "/api/order_carriers/" + idOrderCarrier + "/?ws_key=" + webkey).asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> getOrdersList() {

        return null;
    }

    public HttpResponse<String> getOrdersCount() {
        try {
            return Unirest.get(dominio + "/api/orders/?ws_key=" + webkey).asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public HttpResponse<String> getOrderDetailAssoc(int search) {
        try {
            return Unirest.get(dominio + "/api/order_details/&filter[id_order]=" + search + "?ws_key=" + webkey).asString();

        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> getDeliveries(int idDeliverie) {
        try {
            return Unirest.get(dominio + "/api/deliveries/" + idDeliverie + "/?ws_key=" + webkey).asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> getEmployee(int idEmployee) {
        try {
            return Unirest.get(dominio + "/api/employees/" + idEmployee + "/?ws_key=" + webkey).asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public HttpResponse<String> getEmployees() {
        try {
            return Unirest.get(dominio + "/api/employees/?ws_key=" + webkey).asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public HttpResponse<String> getEcommerceId(int id) {
        try {
            return Unirest.get(dominio + "/api/Sincro/" + id + "/?ws_key=" + webkey)
                    .asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> getOrderSearchRanck(String search) {
        try {
            return Unirest.get(dominio + "/api/orders/&filter[id]=[" + search + "]?ws_key=" + webkey).asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> setInfoImg(Long id_product_, long id_img_, int id_img_ecommerce, int id_product_ecommerce) {
        try {
            return Unirest.get(dominio + "/api/AgreInfoImg?id_product_=" + id_product_ + "&id_img_=" + id_img_ + "&id_img_ecommerce=" + id_img_ecommerce + "&id_product_ecommerce=" + id_product_ecommerce + "&ws_key=" + webkey)
                    .asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> setDisableImg(int id_img) {
        try {
            return Unirest.get(dominio + "/api/DisableImg?id_img=" + id_img + "&ws_key=" + webkey).asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> setEnableImg(int id_img) {
        try {
            return Unirest.get(dominio + "/api/EnableImg?id_img=" + id_img + "&ws_key=" + webkey).asString();
        } catch (UnirestException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public HttpResponse<String> getListImgIds(int id_img) {

        try {
            return Unirest.get(dominio + "/api/GetListImgIds?id_img=" + id_img + "&ws_key=" + webkey).asString();
        } catch (UnirestException e) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, e);

        }

        return null;
    }

    public HttpResponse<String> getImgIfExist(int id_img, int id_articulo) {
        try {
            return Unirest.get(dominio + "/api/GetImgIsExist?id_product_=" + id_articulo + "&id_img_=" + id_img + "&ws_key=" + webkey).asString();
        } catch (UnirestException e) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;
    }

}
