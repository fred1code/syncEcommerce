
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
public class CartRows {

    @XmlElement(name = "cart_rows")
    private List<CartRow> cart_rows;

    public CartRows() {
    }

    public CartRows(List<CartRow> cart_rows) {
        this.cart_rows = cart_rows;
    }

    public List<CartRow> getCart_rows() {
        return cart_rows;
    }

    public void setCart_rows(List<CartRow> cart_rows) {
        this.cart_rows = cart_rows;
    }

    @Override
    public String toString() {
        return "CartRows{" + "cart_rows=" + cart_rows + '}';
    }
    
}
