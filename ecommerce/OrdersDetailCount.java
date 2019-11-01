

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 * * <h1>OrdersDetailCount class</h1>
 * <p> class  for cast xml to class : type order_detail index</p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class OrdersDetailCount {

    @XmlElement(name = "order_detail")
    private List<OrderDetailAtrib> id;

    public OrdersDetailCount() {
    }

    public List<OrderDetailAtrib> getId() {
        return id;
    }

    public void setId(List<OrderDetailAtrib> id) {
        this.id = id;
    }

}
