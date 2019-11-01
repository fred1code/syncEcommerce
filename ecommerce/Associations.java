import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 */
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "associations")
public class Associations {

    @XmlElement(name = "order_rows")
    private List<OrderRow> orderRows;

    public Associations() {
    }

    public Associations(List<OrderRow> lista) {
        this.orderRows = lista;
    }

    public List<OrderRow> getOrderRows() {
        return orderRows;
    }

    public void setOrderRows(List<OrderRow> orderRows) {
        this.orderRows = orderRows;
    }

    @Override
    public String toString() {
        return "Associations{" + "orderRows=" + orderRows + '}';
    }

}
