

/**
 *
 * @author fredy
 * * <h1>OrdersDataDetail class</h1>
 * <p>
 * this class used for container information the type OrdersDetail</p>
 */
public class OrdersDataDetail {

    private int id;
    private String nombre;
    private String rfc;
    private String address1;
    private String city;
    private String estado;
    private String postCode;
    private String DeliveryDate;
    private String ShippingNumber;

    public OrdersDataDetail() {
    }

    public OrdersDataDetail(int id, String nombre, String rfc, String address1, String city, String estado, String postCode, String DeliveryDate, String ShippingNumber) {
        this.id = id;
        this.nombre = nombre;
        this.rfc = rfc;
        this.address1 = address1;
        this.city = city;
        this.estado = estado;
        this.postCode = postCode;
        this.DeliveryDate = DeliveryDate;
        this.ShippingNumber = ShippingNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(String DeliveryDate) {
        this.DeliveryDate = DeliveryDate;
    }

    public String getShippingNumber() {
        return ShippingNumber;
    }

    public void setShippingNumber(String ShippingNumber) {
        this.ShippingNumber = ShippingNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
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
        final OrdersDataDetail other = (OrdersDataDetail) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrdersDataDetail{" + "id=" + id + ", nombre=" + nombre + ", rfc=" + rfc + ", address1=" + address1 + ", city=" + city + ", estado=" + estado + ", postCode=" + postCode + ", DeliveryDate=" + DeliveryDate + ", ShippingNumber=" + ShippingNumber + '}';
    }

}
