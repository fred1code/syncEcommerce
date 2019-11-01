
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 */
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "delivery")
public class Deliveries {

    @XmlElement(name = "id")
    private int id;

    @XmlElement(name = "id_carrier")
    private int id_carrier;

    @XmlElement(name = "id_range_price")
    private int id_range_price;

    @XmlElement(name = "id_range_weight")
    private int id_range_weight;

    @XmlElement(name = "id_zone")
    private int id_zone;

    @XmlElement(name = "id_shop")
    private int id_shop;

    @XmlElement(name = "id_shop_group")
    private int id_shop_group;

    @XmlElement(name = "price")
    private String price;

    public Deliveries() {
    }

    public Deliveries(int id, int id_carrier, int id_range_price, int id_range_weight, int id_zone, int id_shop, int id_shop_group, String price) {
        this.id = id;
        this.id_carrier = id_carrier;
        this.id_range_price = id_range_price;
        this.id_range_weight = id_range_weight;
        this.id_zone = id_zone;
        this.id_shop = id_shop;
        this.id_shop_group = id_shop_group;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_carrier() {
        return id_carrier;
    }

    public void setId_carrier(int id_carrier) {
        this.id_carrier = id_carrier;
    }

    public int getId_range_price() {
        return id_range_price;
    }

    public void setId_range_price(int id_range_price) {
        this.id_range_price = id_range_price;
    }

    public int getId_range_weight() {
        return id_range_weight;
    }

    public void setId_range_weight(int id_range_weight) {
        this.id_range_weight = id_range_weight;
    }

    public int getId_zone() {
        return id_zone;
    }

    public void setId_zone(int id_zone) {
        this.id_zone = id_zone;
    }

    public int getId_shop() {
        return id_shop;
    }

    public void setId_shop(int id_shop) {
        this.id_shop = id_shop;
    }

    public int getId_shop_group() {
        return id_shop_group;
    }

    public void setId_shop_group(int id_shop_group) {
        this.id_shop_group = id_shop_group;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.id;
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
        final Deliveries other = (Deliveries) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Deliveries{" + "id=" + id + ", id_carrier=" + id_carrier + ", id_range_price=" + id_range_price + ", id_range_weight=" + id_range_weight + ", id_zone=" + id_zone + ", id_shop=" + id_shop + ", id_shop_group=" + id_shop_group + ", price=" + price + '}';
    }

}
