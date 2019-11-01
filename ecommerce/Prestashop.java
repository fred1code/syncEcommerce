

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fredy
 * <h1> prestashop controller </h1>
 * <p>
 * this class used from cast xml to object include methods from different class
 * </p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "prestashop")
public class Prestashop {

    @XmlElement(name = "address")
    private Address address;

    @XmlElement(name = "order")
    private Orders order;

    @XmlElement(name = "order_detail")
    private OrdersDetail ordersDetail;

    @XmlElement(name = "customer")
    private Customers customer;

    @XmlElement(name = "order_history")
    private OrderHistories orderHistories;

    @XmlElement(name = "order_state")
    private OrderState orderState;

    @XmlElement(name = "carrier")
    private Carriers carrier;

    @XmlElement(name = "order_carrier")
    private OrderCarriers orderCarrier;

    @XmlElement(name = "cart")
    private Carts cart;

    @XmlElement(name = "delivery")
    private Deliveries deliveris;

    @XmlElement(name = "employee")
    private Employees employee;

    @XmlElement(name = "employees")
    private EmployeeCount employeeCount;

    @XmlElement(name = "orders")
    private OrdersCount ordersCount;

    @XmlElement(name = "addresses")
    private AddressCount addressCount;

    @XmlElement(name = "carts")
    private CartCount cartCount;

    @XmlElement(name = "order_details")
    private OrdersDetailCount ordersDetailCount;

    private String json;

    public Prestashop() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public OrdersDetail getOrdersDetail() {
        return ordersDetail;
    }

    public void setOrdersDetail(OrdersDetail ordersDetail) {
        this.ordersDetail = ordersDetail;
    }

    public OrderHistories getOrderHistories() {
        return orderHistories;
    }

    public void setOrderHistories(OrderHistories orderHistories) {
        this.orderHistories = orderHistories;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public Carriers getCarrier() {
        return carrier;
    }

    public void setCarrier(Carriers carrier) {
        this.carrier = carrier;
    }

    public OrderCarriers getOrderCarrier() {
        return orderCarrier;
    }

    public void setOrderCarrier(OrderCarriers orderCarrier) {
        this.orderCarrier = orderCarrier;
    }

    public Carts getCart() {
        return cart;
    }

    public void setCart(Carts cart) {
        this.cart = cart;
    }

    public Deliveries getDeliveris() {
        return deliveris;
    }

    public void setDeliveris(Deliveries deliveris) {
        this.deliveris = deliveris;
    }

    public Employees getEmployee() {
        return employee;
    }

    public void setEmployee(Employees employee) {
        this.employee = employee;
    }

    public OrdersCount getOrdersCount() {
        return ordersCount;
    }

    public void setOrdersCount(OrdersCount ordersCount) {
        this.ordersCount = ordersCount;
    }

    public AddressCount getAddressCount() {
        return addressCount;
    }

    public void setAddressCount(AddressCount addressCount) {
        this.addressCount = addressCount;
    }

    public OrdersDetailCount getOrdersDetailCount() {
        return ordersDetailCount;
    }

    public void setOrdersDetailCount(OrdersDetailCount ordersDetailCount) {
        this.ordersDetailCount = ordersDetailCount;
    }

    public CartCount getCartCount() {
        return cartCount;
    }

    public void setCartCount(CartCount cartCount) {
        this.cartCount = cartCount;
    }

    public EmployeeCount getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(EmployeeCount employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

}
