

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 * * <h1>OrdersCount class</h1>
 * <p>this class is used for cast xml and count data</p>
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class OrdersCount {

    @XmlElement(name = "order")
    private List<OrderAtrib>  id;

    public OrdersCount() {
    }

    public List<OrderAtrib> getId() {
        return id;
    }

    public void setId(List<OrderAtrib> id) {
        this.id = id;
    }



}
