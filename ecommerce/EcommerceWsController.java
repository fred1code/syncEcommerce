
import com.mashape.unirest.http.HttpResponse;
import java.net.HttpURLConnection;
import java.util.Optional;

/**
 *
 * @author fredy
 */
public class EcommerceWsController {

    private final ImgServices services;
    private final String webkey;
    private final String dominio;

    public EcommerceWsController(String dominio, String key) {
        this.webkey = key;
        this.dominio = dominio;
        this.services = new ImgServices(dominio, key);
    }

    public Optional<String> getEcommerceId(int id) {
        HttpResponse<String> response = services.getEcommerceId(id);
        if (response.getStatus() == HttpURLConnection.HTTP_OK) {
            String json = response.getBody().replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                    + "<prestashop xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n"
                    + "[{\"id_ecommerce\":\"", "").replace("\"}]</prestashop>", "");
            return Optional.of(json);
        }
        return Optional.empty();
    }

    public Optional<String> setInfoImg(Long id_product_, long id_img_, int id_img_ecommerce, int id_product_ecommerce) {
        HttpResponse<String> response = services.setInfoImg(id_product_, id_img_, id_img_ecommerce, id_product_ecommerce);
        if (response.getStatus() == HttpURLConnection.HTTP_OK) {

        }

        return Optional.empty();
    }

    public Optional<Boolean> setDisableImg(int id_img) {

        HttpResponse<String> response = services.setDisableImg(id_img);
        if (response.getStatus() == HttpURLConnection.HTTP_OK) {
            return Optional.of(true);
        }

        return Optional.empty();
    }

    public Optional<Boolean> setEnableImg(int id_img) {
        HttpResponse<String> response = services.setEnableImg(id_img);
        if (response.getStatus() == HttpURLConnection.HTTP_OK) {
            return Optional.of(true);
        }
        return Optional.empty();
    }

    public Optional<String> getListImgIds(int id_img) {

        HttpResponse<String> response = services.getListImgIds(id_img);
        if (response.getStatus() == HttpURLConnection.HTTP_OK) {
            String json = response.getBody().replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                    + "<prestashop xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n",
                    "").replace("</prestashop>", "");
            return Optional.of(json);

        }

        return Optional.empty();
    }

    public Optional<String> getImgIfExist(int id_img, int id_articulo) {
        HttpResponse<String> response = services.getImgIfExist(id_img, id_articulo);
        if (response.getStatus() == HttpURLConnection.HTTP_OK) {
            String res = response.getBody().replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                    + "<prestashop xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n",
                    "").replace("</prestashop>", "");
            return Optional.of(res);
        }
        return Optional.empty();
    }

    public Optional<String> getFullListImg() {
        HttpResponse<String> response = services.getFullListImg();
        if (response.getStatus() == HttpURLConnection.HTTP_OK) {
            String res = response.getBody().replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                    + "<prestashop xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n",
                    "").replace("</prestashop>", "");
            return Optional.of(res);
        }
        return Optional.empty();
    }

    public Optional<String> getIfEcommerceSync() {

        HttpResponse<String> response = services.getIfEcommerceSync();
        if (response.getStatus() == HttpURLConnection.HTTP_OK) {
            String res = response.getBody().replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                    + "<prestashop xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n",
                    "").replace("</prestashop>", "");
            return Optional.of(res);
        }

        return Optional.empty();
    }
}
