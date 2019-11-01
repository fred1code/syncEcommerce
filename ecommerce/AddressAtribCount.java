
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author fredy
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressAtribCount {

    @XmlAttribute(name = "id")
    private int id;

    public AddressAtribCount() {
    }

    public AddressAtribCount(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
