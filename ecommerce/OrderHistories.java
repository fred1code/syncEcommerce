

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 * <h1>OrderHistories class</h1>
 * <p>
 * this class is used for cast xml to object. type history orders</p>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderHistories {

    @XmlElement(name = "id")
    private String id;
    @XmlElement(name = "id_employee")
    private String id_employee;
    @XmlElement(name = "id_order_state")
    private String id_order_state;
    @XmlElement(name = "id_order")
    private String id_order;
    @XmlElement(name = "date_add")
    private String date_add;

    public OrderHistories() {
    }

    public OrderHistories(String id, String id_employee, String id_order_state, String id_order, String date_add) {
        this.id = id;
        this.id_employee = id_employee;
        this.id_order_state = id_order_state;
        this.id_order = id_order;
        this.date_add = date_add;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_employee() {
        return id_employee;
    }

    public void setId_employee(String id_employee) {
        this.id_employee = id_employee;
    }

    public String getId_order_state() {
        return id_order_state;
    }

    public void setId_order_state(String id_order_state) {
        this.id_order_state = id_order_state;
    }

    public String getId_order() {
        return id_order;
    }

    public void setId_order(String id_order) {
        this.id_order = id_order;
    }

    public String getDate_add() {
        return date_add;
    }

    public void setDate_add(String date_add) {
        this.date_add = date_add;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrderHistories other = (OrderHistories) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrderHistories{" + "id=" + id + ", id_employee=" + id_employee + ", id_order_state=" + id_order_state + ", id_order=" + id_order + ", date_add=" + date_add + '}';
    }

}
