

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 * <h1>OrderRow class</h1>
 * <p>
 * this class container one list for cast objetc </p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderRow {

    @XmlElement(name = "order_row")
    private List<OrderRowData> orderRows;

    public OrderRow() {
    }

    public OrderRow(List<OrderRowData> orderRow) {
        this.orderRows = orderRow;
    }

    public List<OrderRowData> getOrderRows() {
        return orderRows;
    }

    public void setOrderRows(List<OrderRowData> orderRow) {
        this.orderRows = orderRow;
    }

    @Override
    public String toString() {
        return "OrderRow{" + "orderRow=" + orderRows + '}';
    }

}
