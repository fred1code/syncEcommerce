
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressCount {

    @XmlElement(name = "address")
    private List<AddressAtribCount> id;

    public AddressCount() {
    }

    public AddressCount(List<AddressAtribCount> id) {
        this.id = id;
    }

    public List<AddressAtribCount> getId() {
        return id;
    }

    public void setId(List<AddressAtribCount> id) {
        this.id = id;
    }

}
