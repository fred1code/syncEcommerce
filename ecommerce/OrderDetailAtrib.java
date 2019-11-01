

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author fredy
 * <h1>OrderDetailId class</h1>
 * <p>
 * this class used for cast ordes id to object</p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderDetailAtrib {

    @XmlAttribute(name = "id")
    private int id;

    public OrderDetailAtrib() {
    }

    public OrderDetailAtrib(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
