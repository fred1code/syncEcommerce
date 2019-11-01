
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author fredy
 * <h1>OrderAtrib class</h1>
 * <p>
 * this class used for cast xml to object
 * </p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderAtrib {

    @XmlAttribute(name = "id")
    private int id;

    public OrderAtrib() {
    }

    public OrderAtrib(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
