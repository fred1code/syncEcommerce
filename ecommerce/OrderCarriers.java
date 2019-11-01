
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 *  * <h1>OrderCarriers class</h1>
 * <p>
 * this class used for cast xml to object
 * </p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderCarriers {

    @XmlElement(name = "id")
    private int id;

    @XmlElement(name = "id_order")
    private int id_order;

    @XmlElement(name = "id_carrier")
    private int id_carrier;

    @XmlElement(name = "weight")
    private String weight;

    @XmlElement(name = "shipping_cost_tax_excl")
    private String shipping_cost_tax_excl;

    @XmlElement(name = "shipping_cost_tax_incl")
    private String shipping_cost_tax_incl;

    @XmlElement(name = "tracking_number")
    private String tracking_number;

    @XmlElement(name = "date_add")
    private String date_add;

    public OrderCarriers() {
    }

    public OrderCarriers(int id, int id_order, int id_carrier, String weight, String shipping_cost_tax_excl, String shipping_cost_tax_incl, String tracking_number, String date_add) {
        this.id = id;
        this.id_order = id_order;
        this.id_carrier = id_carrier;
        this.weight = weight;
        this.shipping_cost_tax_excl = shipping_cost_tax_excl;
        this.shipping_cost_tax_incl = shipping_cost_tax_incl;
        this.tracking_number = tracking_number;
        this.date_add = date_add;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    public int getId_carrier() {
        return id_carrier;
    }

    public void setId_carrier(int id_carrier) {
        this.id_carrier = id_carrier;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getShipping_cost_tax_excl() {
        return shipping_cost_tax_excl;
    }

    public void setShipping_cost_tax_excl(String shipping_cost_tax_excl) {
        this.shipping_cost_tax_excl = shipping_cost_tax_excl;
    }

    public String getShipping_cost_tax_incl() {
        return shipping_cost_tax_incl;
    }

    public void setShipping_cost_tax_incl(String shipping_cost_tax_incl) {
        this.shipping_cost_tax_incl = shipping_cost_tax_incl;
    }

    public String getTracking_number() {
        return tracking_number;
    }

    public void setTracking_number(String tracking_number) {
        this.tracking_number = tracking_number;
    }

    public String getDate_add() {
        return date_add;
    }

    public void setDate_add(String date_add) {
        this.date_add = date_add;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
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
        final OrderCarriers other = (OrderCarriers) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrderCarriers{" + "id=" + id + ", id_order=" + id_order + ", id_carrier=" + id_carrier + ", weight=" + weight + ", shipping_cost_tax_excl=" + shipping_cost_tax_excl + ", shipping_cost_tax_incl=" + shipping_cost_tax_incl + ", tracking_number=" + tracking_number + ", date_add=" + date_add + '}';
    }

}
