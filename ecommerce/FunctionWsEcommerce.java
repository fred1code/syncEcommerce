
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;

/**
 * @author fredy
 *
 * <h1> Ecommerce fuctions Controller </h1>
 * <p>
 * controller from the functios ws and jpa functios
 * </p>
 *

 * @see OrderController.java
 *
 *
 *
 */
public class FunctionWsEcommerce {

    private String ecommerceID;

    Optional<String> urls;
    Optional<String> keys;
    String url;
    String key;

    private ArrayList<Orden> ordenes;
    private art arcon = new arcon();
    private PSWebServiceWrapper psws;
    private EcommerceWsController ecommer;
    private Ecommerce ecommerce;
    OrderController orden;
    private int idAddressInsert;
    private int idCarrierInsert;
    private int idOrder;

    public FunctionWsEcommerce(EntityManagerFactory emf) {
        this.urls = ConfiguracionController.get("ecommerce", "url");
        this.keys = ConfiguracionController.get("ecommerce", "key");
        this.urls.ifPresent(ur -> {
            this.url = ur.trim();
        });
        this.keys.ifPresent(ke -> {
            this.key = ke;
        });
        psws = new PSWebServiceWrapper(this.url.trim(), this.key.trim(), false);
        ecommer = new EcommerceWsController(this.url.trim(), this.key.trim());
        ecommerce = new Ecommerce(this.url.trim(), this.key.trim(), false);
        orden = new OrderController();
        orden.setEntityManagerFactory(emf);
        ordenes = new ArrayList();
        idAddressInsert = 0;
        idCarrierInsert = 0;
        idOrder = 0;
    }

    //Address 
    public int setAddress(int idAddress) {
        Address addres = new Address();
        Optional<Address> address = ecommerce.getAddress(idAddress);
        address.ifPresent(adress -> {
            addres.setAlias(adress.getAlias());
            addres.setCompany(adress.getCompany());
            addres.setLastname(adress.getLastname());
            addres.setFirstname(adress.getFirstname());
            addres.setVat_number(adress.getVat_number());
            addres.setAddress1(adress.getAddress1());
            addres.setAddress2(adress.getAddress2());
            addres.setPostcode(adress.getPostcode());
            addres.setCity(adress.getCity());
            addres.setOther(adress.getOther());
            addres.setPhone(adress.getPhone());
            addres.setPhoneMobile(adress.getAddress1());
            addres.setDni(adress.getDni());
            addres.setIdCustomer(adress.getIdCustomer());
            addres.setId(adress.getId());
        });
        return orden.setAddress(addres);
    }

    public List getFullAddress() {
        List<..jpa.Address> addr = orden.getAllAddress();
        return addr;
    }

    public List<..jpa.Address> getAddress(int idAddress) {
        return orden.getAddress(idAddress);
    }

    public boolean updateAddress(int idAddress, Address addr) {
        return orden.updateAddress(idAddress, addr);
    }

    public boolean checkAddressExist(int id) {
        return orden.checkAddressExist(id);
    }

    //Address ecommerce
    public ArrayList<Address> getEcommerceAddress(int idAddress) {
        ArrayList<Address> addressLista = new ArrayList();
        Optional<Address> address = ecommerce.getAddress(idAddress);
        address.ifPresent(addres -> {
            addressLista.add(addres);
        });
        return addressLista;
    }

    //Orders 
    public int setOrder(int idOrder, int idAddress, int idCard) {
        Orders orden = new Orders();
        Optional<Orders> order = ecommerce.getOrder(idOrder);
        order.ifPresent(or -> {
            orden.setCurrent_state(order.get().getCurrent_state());
            orden.setModule(order.get().getModule());
            orden.setDelivery_number(order.get().getDelivery_number());
            orden.setDelivery_date(order.get().getDelivery_date());
            orden.setShipping_number(order.get().getShipping_number());
            orden.setPayment(order.get().getPayment());
            orden.setTotal_paid_tax_incl(order.get().getTotal_paid_tax_incl());
            orden.setGift(order.get().getGift());
            orden.setId(order.get().getId());
        });
        return orden.setOrder(orden, idAddress, idCard);
    }

    public List getOrder(int idOrder) {
        return orden.getOrder(idOrder);
    }

    public List getOrderListReport(int idOrder) {
        return orden.getOrderListReport(idOrder);
    }

    public List getOrders() {
        return orden.getOrders();
    }

    public List getOrderList() {
        return orden.getOrdersList();
    }

    public OrdersDataDetail getOrdersDataDetail(int Order_id) {
        return orden.getOrdersDataDetail(Order_id);
    }

    public int setOrderDetail(int idOrderDetail, int idOrder) {
        OrdersDetail orderDetail = new OrdersDetail();
        Optional<OrdersDetail> orderDet = ecommerce.getOrderDetails(idOrderDetail);
        orderDet.ifPresent(order -> {
            orderDetail.setProduct_id(order.getProduct_id());
            orderDetail.setProduct_attribute_id(order.getProduct_attribute_id());
            orderDetail.setProduct_quantity(order.getProduct_quantity());
            orderDetail.setProduct_name(order.getProduct_name());
            orderDetail.setProduct_reference(order.getProduct_reference());
            orderDetail.setProduct_price(order.getProduct_price());
        });
        return orden.setOrderDetail(orderDetail, idOrder);
    }

    public List getOrderDetail(int idOrderDetail) {
        List<OrderDetail> collect = orden.getOrderDetail(idOrderDetail);
        return collect;
    }

    public boolean updateOrderDetail(OrdersDetail order, int idOrderDetail) {
        return orden.updateOrderDetail(order, idOrderDetail);
    }

    public void updateOrder2(Orders order, int id, int idOrder) {
        orden.updateOrder(order, id, idOrder);
    }

    //Orders ecommerce
    public void setEcommerceOrders() {
        getFullAddress();
        System.out.println("full address mamalonas = ");

    }

    public ArrayList<Orders> getEcommerceOrder(int idOrder) {
        ArrayList<Orders> ordenList = new ArrayList();
        Optional<Orders> orden = ecommerce.getOrder(idOrder);
        orden.ifPresent(orde -> {
            ordenList.add(orde);
        });
        return ordenList;
    }

    public void getEcommerceOrdes() {

        Optional<OrdersCount> order = ecommerce.getOrdersCount();

        order.ifPresent(a -> {

            a.getId().forEach(op -> {
                Optional<Orders> orderDetail = ecommerce.getOrder(op.getId());
                orderDetail.ifPresent(pre -> {
                    Orden Orden = new Orden();
                    ArrayList<String> productos = new ArrayList();
                    Orden.setId(pre.getId());
                    pre.getId_customer();
                    Optional<Customers> resCustomer = ecommerce.getCustomer(pre.getId_customer());
                    resCustomer.ifPresent(cu -> {
                        Orden.setCustomer(cu.getFirstname() + " " + cu.getLastname());
                    });

                    int cont = 0;
                    pre.getAssociations().getOrderRows().forEach(in -> {
                        productos.add(in.getOrderRows().get(cont).getProduct_name());
                    });

                    Orden.setProductos(productos);

                    Optional<Address> addres = ecommerce.getAddress(pre.getId_address_delivery());

                    addres.ifPresent(addr -> {
                        Orden.setAddres(addr.getCity() + " " + addr.getAddress1());
                    });
                    Orden.setPrice(pre.getTotal_paid_tax_incl());
                    Optional<OrderState> state = ecommerce.getOrderState(Integer.parseInt(pre.getCurrent_state().trim()));
                    state.ifPresent(stat -> {
                        Orden.setColor(stat.getColor());
                        stat.getName().getLanguage().forEach(i -> {
                            Orden.setOrderState(i);
                        });
                    });
                    Orden.setDate_add(pre.getDate_add());
                    ordenes.add(Orden);
                });
            });
        });

    }

    public ArrayList<Address> getEcommerceOrderAddress(int idOrderAddress) {
        ArrayList<Address> addressLista = new ArrayList();
        Optional<Address> address = ecommerce.getAddress(idOrderAddress);
        address.ifPresent(addre -> {
            addressLista.add(addre);
        });
        return addressLista;
    }

    public ArrayList<OrderCarriers> getEcommerceOrderCarrier(int idOrderCarrier) {
        ArrayList<OrderCarriers> orderCarrierList = new ArrayList();
        Optional<OrderCarriers> orderCarrier = ecommerce.getOrderCarriers(idOrderCarrier);
        orderCarrier.ifPresent(orderC -> {
            orderCarrierList.add(orderC);
        });
        return orderCarrierList;
    }

    public ArrayList<OrderAtrib> getEcommerceOrderSearchRanck(String ranck) {
        ArrayList<OrderAtrib> orderList = new ArrayList();
        Optional<OrdersCount> count = ecommerce.getOrderSearchRanck(ranck);
        count.ifPresent(coun -> {
            coun.getId().forEach(co -> {
                orderList.add(co);
            });
        });
        return orderList;
    }

    public ArrayList<OrderDetailAtrib> getEcommerceOrderDetailAssoc(int idOrderDetailAssoc) {
        ArrayList<OrderDetailAtrib> ordenesLista = new ArrayList();
        Optional<OrdersDetailCount> ordenes = ecommerce.getOrderDetailAssoc(idOrderDetailAssoc);
        ordenes.ifPresent(orden -> {
            orden.getId().forEach(or -> {
                ordenesLista.add(or);
            });
        });
        return ordenesLista;
    }

    //Employess ecommerce
    public ArrayList<Employees> getEcommerceEmployee(int idEmployee) {
        ArrayList<Employees> employee = new ArrayList();
        Optional<Employees> emploOptional = ecommerce.getEmployee(idEmployee);
        emploOptional.ifPresent(eploye -> {
            employee.add(eploye);
        });
        return employee;
    }

    public ArrayList<EmployeeCountDetail> getEcommerceEmployees() {

        ArrayList<EmployeeCountDetail> employee = new ArrayList();
        Optional<EmployeeCount> employe = ecommerce.getEmployees();
        employe.ifPresent(emplo -> {
            emplo.getId().forEach(em -> {
                employee.add(em);
            });
        });
        return employee;
    }

    //Carts ecommerce
    public ArrayList<CartAtribCount> getEcommerceCarts() {
        ArrayList<CartAtribCount> cartList = new ArrayList();
        Optional<CartCount> car = ecommerce.getCartCont();
        car.ifPresent(ca -> {
            ca.getId().forEach(cart -> {
                cartList.add(cart);
            });
        });
        return cartList;
    }

    public ArrayList<Carts> getEcommerceCar(int idCar) {
        ArrayList<Carts> cardLista = new ArrayList();
        Optional<Carts> card = ecommerce.getCarts(idCar);
        card.ifPresent(car -> {
            cardLista.add(car);
        });
        return cardLista;
    }

    //Carriers 
    public int setCarrier(int idCarrier) {
        Carriers carrier = new Carriers();
        Optional<Carriers> carri = ecommerce.getCarriers(idCarrier);
        carri.ifPresent(carr -> {
            carrier.setName(carr.getName());
            carrier.setIs_free(carr.getIs_free());
            carrier.setUrl(carr.getUrl());
            carrier.setActive(carr.getActive());
        });

        return orden.setCarrier(carrier);
    }

    public List<Carrier> getCarrier(int idCarrier) {
        List<Carrier> temp = orden.getCarrier(idCarrier);
        return temp;
    }

    public List getAllCarriers() {
        List<Carrier> temp = orden.getCarriers();
        return temp;
    }

    public boolean updateCarrier(Carriers carrier, int idCarrier) {
        return orden.updateCarriers(carrier, idCarrier);
    }

    public boolean checkCarrierExist(int id) {
        return orden.checkCarrierExist(id);
    }

    //Carriers ecommerce
    //Custommer  
    public int setCustomer(Customers customer) {
        return orden.setCustomer(customer);
    }

    public List<Cliente> getCustomer(int idCustomer) {
        return orden.getCustomer(idCustomer);
    }

    public List<Cliente> getCustomers() {
        List<Cliente> cliente = orden.getCustomerAll();
        System.out.println("LISTA DE RESPUESTA ==> " + cliente);
        return cliente;
    }

    public boolean updateCustomers(Customers customer) {
        return orden.updateCustomer(customer);
    }

    //Custommer ecommerce
    public ArrayList<Customers> getEcommerceCustomer(int idCustomer) {
        ArrayList<Customers> customerList = new ArrayList();
        Optional<Customers> customer = ecommerce.getCustomer(idCustomer);
        customer.ifPresent(custo -> {
            customerList.add(custo);
        });
        return customerList;
    }

    public ArrayList<Integer> getEcommerceOrdesCount() {
        try {
            //  ArrayList<OrdersCount> orders = new ArrayList();
            ArrayList<Integer> count = new ArrayList();
            Optional<OrdersCount> ordersCount = ecommerce.getOrdersCount();
            ordersCount.ifPresent(o -> {
                o.getId().forEach(p -> {
                    count.add(p.getId());
                });
            });
            return count;
        } catch (Exception ex) {

        }
        return new ArrayList<Integer>();
    }

    public boolean insertOrderEcommerce() {
        try {
            List ordenes = getOrders();
            ArrayList<Integer> ordersEcommerce = getEcommerceOrdesCount();
            ordersEcommerce.forEach(orderEcommerce -> {
                if (ordenes.contains(orderEcommerce) != true) {
                    //get order ecommerce 
                    List<Orders> orderF = getEcommerceOrder(orderEcommerce);
                    orderF.forEach(fa -> {
                        int idAddress = fa.getId_address_delivery();
                        ArrayList<Address> listaA = getEcommerceAddress(idAddress);
                        int idAddressFinal = Integer.parseInt(listaA.get(0).getId());
                        //inserando address
                        if (checkAddressExist(idAddressFinal) == false) {
                            idAddressInsert = setAddress(idAddressFinal);
                        } else {
                            List<..jpa.Address> idAdd = getAddress(idAddressFinal);
                            idAdd.forEach(a -> {
                                idAddressInsert = a.getEcommerceId();
                            });
                        }
                        //carries faltantes 
                        int idCarrier = fa.getId_carrier();
                        if (checkCarrierExist(idCarrier) == false) {
                            idCarrierInsert = setCarrier(idCarrier);
                        } else {
                            List<Carrier> idCarr = getCarrier(idCarrier);
                            idCarr.forEach(c -> {
                                idCarrierInsert = c.getCarId();
                            });
                        }
                        //orders faltantes
                        idOrder = setOrder(fa.getId(), idAddressInsert, idCarrierInsert);

                        //ordersDetails faltantes
                        fa.getAssociations().getOrderRows().forEach(d -> {
                            d.getOrderRows().forEach(de -> {
                                setOrderDetail(de.getId(), idOrder);
                            });
                        });
                    });
                    System.out.println("Order nueva generada");
                } else {
                    System.out.println("Lista de inconsistencias vacia ");
                }

            });
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List getOrdersList() {

        return orden.getOrdersList();
    }

}
