
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author fredy
 * <h1>imgEcommerceid class</h1>
 * <p>
 * this class used for cast xml to object </p>
 */
public class IdsJs {

    @SerializedName("id_img_")
    private String id;

    public IdsJs() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "IdsJs{" + "id=" + id + '}';
    }

}
