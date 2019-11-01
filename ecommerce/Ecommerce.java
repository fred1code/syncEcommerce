
import com.mashape.unirest.http.HttpResponse;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;

/**
 * @author fredy
 *
 * <h1> ecommerce rest  <h1>
 * <p>
 * in this class consume service from service class
 * </p>
 * @see Services.java
 *
 */
public class Ecommerce {

    private final Services services;
    private final String webkey;
    private final String dominio;
    private final boolean debug;
    private PSWebServiceClient ws;

    public Ecommerce(String dominio, String key, boolean debug) {
        this.dominio = dominio;
        this.debug = debug;
        this.webkey = key;
        this.services = new Services(this.dominio, this.webkey, this.debug);
        this.ws = new PSWebServiceClient(this.dominio, this.webkey, this.debug);

    }

    public Optional<Address> getAddress(int id) {
        try {
            HttpResponse<String> response = services.getAddress(id);
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getAddress());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }

    public Optional<AddressCount> getAddressCount() {
        try {
            HttpResponse<String> response = services.getAddressCount();
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getAddressCount());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }

    public void getAddressCountThread() {
        Runnable hilo = () -> {
            while (true) {
                Optional<AddressCount> addressCout = this.getAddressCount();
                addressCout.ifPresent(address -> {
                    address.getId().forEach(oa -> {
                        System.out.println(oa.getId());
                    });
                    try {
                        Thread.sleep(60000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                });
            }
        };
        Thread hijo = new Thread(hilo);
        hijo.start();
    }

    public Optional<Carts> getCarts(int idCart) {
        try {
            HttpResponse<String> response = services.getCarts(idCart);
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getCart());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }

    public Optional<Customers> getCustomer(int id) {
        try {
            HttpResponse<String> response = services.getCustomer(id);
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getCustomer());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }

    public Optional<Carriers> getCarriers(int idOrder) {
        try {
            HttpResponse<String> response = services.getCarriers(idOrder);
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getCarrier());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }

    public Optional<CartCount> getCartCont() {
        try {
            HttpResponse<String> response = services.getCart();
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getCartCount());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(Ecommerce.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }

    public Optional<Deliveries> getDeliveries(int idDelivery) {
        try {
            HttpResponse<String> response = services.getDeliveries(idDelivery);
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getDeliveris());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }

    public Optional<Employees> getEmployee(int idEmployee) {
        try {
            HttpResponse<String> response = services.getEmployee(idEmployee);
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getEmployee());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }

    public Optional<EmployeeCount> getEmployees() {
        try {
            HttpResponse<String> response = services.getEmployees();
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getEmployeeCount());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }

    public Optional<OrderState> getOrderState(int id) {
        try {
            HttpResponse<String> response = services.getOrderState(id);
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getOrderState());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }

    public Optional<OrderHistories> getOrderHistories(int id) {
        try {
            HttpResponse<String> response = services.getOrderHistories(id);
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getOrderHistories());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }

    public Optional<OrdersDetail> getOrderDetails(int id) {
        try {
            HttpResponse<String> response = services.getOrderDetails(id);
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getOrdersDetail());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }

    public Optional<Orders> getOrder(int orderId) {
        try {
            HttpResponse<String> response = services.getOrder(orderId);
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getOrder());
            }
        } catch (JAXBException ex) {
            System.out.println(ex);
        }
        return Optional.empty();
    }

    public Optional<OrderCarriers> getOrderCarriers(int idOrderCarriers) {
        try {
            HttpResponse<String> response = services.getOrderCarries(idOrderCarriers);
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getOrderCarrier());
            }
        } catch (JAXBException ex) {
            System.out.println(ex);
        }
        return Optional.empty();
    }

    public Optional<OrdersCount> getOrdersCount() {
        try {
            HttpResponse<String> response = services.getOrdersCount();
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getOrdersCount());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }

    public void getOrderCountPros() {
        Runnable hilo = () -> {
            while (true) {
                Optional<OrdersCount> ordersCount = this.getOrdersCount();
                ordersCount.ifPresent(order -> {
                    order.getId().forEach(oa -> {
                        System.out.println(oa.getId());
                    }
                    );
                    try {
                        System.out.println("inicio");
                        Thread.sleep(60000);
                        System.out.println("fin");
                    } catch (Exception ex) {
                        Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
            }
        };
        Thread hijo = new Thread(hilo);
        hijo.start();
    }

    public Optional<OrdersDetailCount> getOrderDetailAssoc(int orderAssoc) {
        try {
            HttpResponse<String> response = services.getOrderDetailAssoc(orderAssoc);
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getOrdersDetailCount());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }

    public Optional<OrdersCount> getOrderSearchRanck(String orderSearch) {
        try {
            HttpResponse<String> response = services.getOrderSearchRanck(orderSearch);
            if (response.getStatus() == HttpURLConnection.HTTP_OK) {
                Prestashop prestashop = (Prestashop) Utils.unmarshall(Prestashop.class, response.getBody());
                return Optional.of(prestashop.getOrdersCount());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }

    public String updateOrder(String idOrder, String orderStatusUpdate) throws PrestaShopWebserviceException, TransformerException {
        HashMap<String, Object> getSchemaOrder = new HashMap();
        getSchemaOrder.put("url", dominio + "/api/orders/1");
        Document schema = ws.get(getSchemaOrder);
        // supply order state 1 = Creación en proceso
        // supply order state 2 = Pedido validado
        // supply order state 3 = Pendiente de recepción
        // supply order state 4 = Pedido recibido parcialmente
        // supply order state 5 = Pedido recibido al completo
        // supply order state 6 = Pedido cancelado
        schema.getElementsByTagName("valid").item(0).setTextContent(orderStatusUpdate);
//        System.out.println(ws.DocumentToString(schema));

        HashMap<String, Object> orderOpt = new HashMap();
        orderOpt.put("resource", "orders");
        orderOpt.put("putXml", ws.DocumentToString(schema));
        orderOpt.put("id", idOrder);

        Document order = ws.edit(orderOpt);
        System.out.println(order);

        return ws.DocumentToString(order);
    }

}
