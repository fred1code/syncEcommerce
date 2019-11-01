
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CartCount {

    @XmlElement(name = "cart")
    private List<CartAtribCount> id;

    public CartCount() {
    }

    public List<CartAtribCount> getId() {
        return id;
    }

    public void setId(List<CartAtribCount> id) {
        this.id = id;
    }

}
