
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 * <h1>GroupData class</h1>
 * <p>this class uset for cast xml to object </p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GroupData {

    @XmlElement(name = "id")
    private int id;

    public GroupData() {
    }

    public GroupData(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GroupData{" + "id=" + id + '}';
    }

}
