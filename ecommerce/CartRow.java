
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 */
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "cart_rows")
public class CartRow {

    @XmlElement(name = "cart_row")
    private List<CartRowData> cartRowData;

    public CartRow() {
    }

    public CartRow(List<CartRowData> cartRowData) {
        this.cartRowData = cartRowData;
    }

    public List<CartRowData> getCartRowData() {
        return cartRowData;
    }

    public void setCartRowData(List<CartRowData> cartRowData) {
        this.cartRowData = cartRowData;
    }

    @Override
    public String toString() {
        return "CartRow{" + "cartRowData=" + cartRowData + '}';
    }
    
}
