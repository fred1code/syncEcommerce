

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 */
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "cart_row")
public class CartRowData {

    @XmlElement(name = "id_product")
    private int id_product;

    @XmlElement(name = "id_product_attribute")
    private int id_product_attribute;

    @XmlElement(name = "id_address_delivery")
    private int id_address_delivery;

    @XmlElement(name = "quantity")
    private String quantity;

    public CartRowData() {
    }

    public CartRowData(int id_product, int id_product_attribute, int id_address_delivery, String quantity) {
        this.id_product = id_product;
        this.id_product_attribute = id_product_attribute;
        this.id_address_delivery = id_address_delivery;
        this.quantity = quantity;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getId_product_attribute() {
        return id_product_attribute;
    }

    public void setId_product_attribute(int id_product_attribute) {
        this.id_product_attribute = id_product_attribute;
    }

    public int getId_address_delivery() {
        return id_address_delivery;
    }

    public void setId_address_delivery(int id_address_delivery) {
        this.id_address_delivery = id_address_delivery;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final CartRowData other = (CartRowData) obj;
        if (this.id_product != other.id_product) {
            return false;
        }
        if (this.id_product_attribute != other.id_product_attribute) {
            return false;
        }
        if (this.id_address_delivery != other.id_address_delivery) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CartRowData{" + "id_product=" + id_product + ", id_product_attribute=" + id_product_attribute + ", id_address_delivery=" + id_address_delivery + ", quantity=" + quantity + '}';
    }

}
