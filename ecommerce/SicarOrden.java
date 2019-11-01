
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author fredy
 */
public class Sorden {

    private int id;
    private String customer;
    private ArrayList<String> productos;
    private String addres;
    private BigDecimal price;
    private String date_add;
    private String orderState;
    private String color;

    public Sorden() {
    }

    public Sorden(int id, String customer, ArrayList<String> productos, String addres, BigDecimal price, String date_add, String orderState) {
        this.id = id;
        this.customer = customer;
        this.productos = productos;
        this.addres = addres;
        this.price = price;
        this.date_add = date_add;
        this.orderState = orderState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public ArrayList<String> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<String> productos) {
        this.productos = productos;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDate_add() {
        return date_add;
    }

    public void setDate_add(String date_add) {
        this.date_add = date_add;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.id;
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
        final Sorden other = (Sorden) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sorden{" + "id=" + id + ", customer=" + customer + ", productos=" + productos + ", addres=" + addres + ", price=" + price + ", date_add=" + date_add + ", orderState=" + orderState + ", color=" + color + '}';
    }

    

    


}
