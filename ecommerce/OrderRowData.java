

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 * <h1>OrderRowData class</h1>
 * <p>this class used for cast xml to object </p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderRowData {
     @XmlElement(name = "id")
    private int id;

    @XmlElement(name = "product_id")
    private int product_id;
    
    @XmlElement(name = "product_attribute_id")
    private int product_attribute_id;
    
    @XmlElement(name = "product_quantity")
    private BigDecimal product_quantity;
    
    @XmlElement(name = "product_name")
    private String product_name;
    
    @XmlElement(name = "product_reference")
    private String product_reference;
    
    @XmlElement(name = "product_ean13")
    private String product_ean13;
    
    @XmlElement(name = "product_isbn")
    private String product_isbn;
    
    @XmlElement(name = "product_upc")
    private String product_upc;
    
    @XmlElement(name = "product_price")
    private String product_price;
    
    @XmlElement(name = "unit_price_tax_incl")
    private String unit_price_tax_incl;
    
    @XmlElement(name = "unit_price_tax_excl")
    private String unit_price_tax_excl;

    public OrderRowData() {
    }

    public OrderRowData(int id, int product_id, int product_attribute_id, BigDecimal product_quantity, String product_name, String product_reference, String product_ean13, String product_isbn, String product_upc, String product_price, String unit_price_tax_incl, String unit_price_tax_excl) {
        this.id = id;
        this.product_id = product_id;
        this.product_attribute_id = product_attribute_id;
        this.product_quantity = product_quantity;
        this.product_name = product_name;
        this.product_reference = product_reference;
        this.product_ean13 = product_ean13;
        this.product_isbn = product_isbn;
        this.product_upc = product_upc;
        this.product_price = product_price;
        this.unit_price_tax_incl = unit_price_tax_incl;
        this.unit_price_tax_excl = unit_price_tax_excl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getProduct_attribute_id() {
        return product_attribute_id;
    }

    public void setProduct_attribute_id(int product_attribute_id) {
        this.product_attribute_id = product_attribute_id;
    }

    public BigDecimal getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(BigDecimal product_quantity) {
        this.product_quantity = product_quantity;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_reference() {
        return product_reference;
    }

    public void setProduct_reference(String product_reference) {
        this.product_reference = product_reference;
    }

    public String getProduct_ean13() {
        return product_ean13;
    }

    public void setProduct_ean13(String product_ean13) {
        this.product_ean13 = product_ean13;
    }

    public String getProduct_isbn() {
        return product_isbn;
    }

    public void setProduct_isbn(String product_isbn) {
        this.product_isbn = product_isbn;
    }

    public String getProduct_upc() {
        return product_upc;
    }

    public void setProduct_upc(String product_upc) {
        this.product_upc = product_upc;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getUnit_price_tax_incl() {
        return unit_price_tax_incl;
    }

    public void setUnit_price_tax_incl(String unit_price_tax_incl) {
        this.unit_price_tax_incl = unit_price_tax_incl;
    }

    public String getUnit_price_tax_excl() {
        return unit_price_tax_excl;
    }

    public void setUnit_price_tax_excl(String unit_price_tax_excl) {
        this.unit_price_tax_excl = unit_price_tax_excl;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
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
        final OrderRowData other = (OrderRowData) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrderRowData{" + "id=" + id + ", product_id=" + product_id + ", product_attribute_id=" + product_attribute_id + ", product_quantity=" + product_quantity + ", product_name=" + product_name + ", product_reference=" + product_reference + ", product_ean13=" + product_ean13 + ", product_isbn=" + product_isbn + ", product_upc=" + product_upc + ", product_price=" + product_price + ", unit_price_tax_incl=" + unit_price_tax_incl + ", unit_price_tax_excl=" + unit_price_tax_excl + '}';
    }
    
    
    
}
