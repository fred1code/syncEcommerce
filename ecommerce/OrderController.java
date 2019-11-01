

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.persistence.*;


/**
 * @author fredy
 *
 * <h1> Orders Model ecommerce </h1>
 * <p>
 * this class is used to inset, get, update orders.</p>
 *
 *
 */
public class OrderController extends AbstractFacade<Imagen> {

    private IActualizaTabla itabla;
    private nc nc;
    private EntityManagerFactory emf;
    private List idA;
    private int idInsert;

    public OrderController() {
        super(Imagen.class);
        idInsert = 0;
    }

    //Address
    public int setAddress(Address address) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        if (em != null) {
            try {
                String sql = "INSERT INTO "
                        + " `address` (alias, company, lastName, firstName, VAT, address1, address2, postCode, city, other, phone, phoneMobile, dni, cli_id, rfc, ecommerce_id) "
                        + " VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13, ?14, ?15, ?16) ; ";
                Query q = em.createNativeQuery(sql);
                q.setParameter(1, address.getAlias());
                q.setParameter(2, address.getCompany());
                q.setParameter(3, address.getLastname());
                q.setParameter(4, address.getFirstname());
                q.setParameter(5, address.getVat_number());
                q.setParameter(6, address.getAddress1());
                q.setParameter(7, address.getAddress2());
                q.setParameter(8, address.getPostcode());
                q.setParameter(9, address.getCity());
                q.setParameter(10, address.getOther());
                q.setParameter(11, address.getPhone());
                q.setParameter(12, address.getPhoneMobile());
                q.setParameter(13, address.getDni());
                q.setParameter(14, address.getIdCustomer());
                q.setParameter(15, "ASDGTRTHFG6");
                q.setParameter(16, address.getId());
                if (q.executeUpdate() != 0) {
                    em.getTransaction().commit();
                }
                return getInsertId();
            } catch (Exception ex) {
                em.getTransaction().rollback();
                Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                em.close();
            }
        }
        return 0;
    }

    public int getAddressCount(int idAddress) {
        int count = 0;
        try {
            String sql = "SELECT  COUNT(a.add_id)"
                    + " FROM address a"
                    + " WHERE add_id =?1;";
            Query q = createNativeQuery(sql);
            q.setParameter(1, idAddress);
            count = ((Long) q.getSingleResult()).intValue();
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    public List getAddress(int id) {
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT * FROM `address` WHERE add_id=?1;";
            Query q = em.createNativeQuery(sql, ..jpa.Address.class);
            q.setParameter(1, id);
            return q.getResultList();
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }

    public boolean checkAddressExist(int id) {
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT * FROM `address` WHERE ecommerce_id=?1;";
            Query q = em.createNativeQuery(sql, ..jpa.Address.class);
            q.setParameter(1, id);
            if (!q.getResultList().isEmpty()) {
                return true;
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List getAllAddress() {
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT * FROM address;";
            Query q = em.createNativeQuery(sql, ..jpa.Address.class);
            List<..jpa.Address> tmp = q.getResultList();
            return tmp;
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }

    public boolean updateAddress(int idAddress, Address address) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        if (em != null) {
            try {
                String sql = "UPDATE address "
                        + "SET alias=?1, company=?2, lastName=?3, firstName=?4, VAT=?5, address1=?6, address2=?7, postCode=?8, city=?9, other=?10, "
                        + "phone=?11, phoneMobile=?12, dni=?13, cli_id=?14 "
                        + "WHERE add_id=?15 ; ";
                Query q = createNativeQuery(sql);
                q.setParameter(1, address.getAlias());
                q.setParameter(2, address.getCompany());
                q.setParameter(3, address.getFirstName());
                q.setParameter(4, address.getLastName());
                q.setParameter(5, address.getVAT());
                q.setParameter(6, address.getAddress1());
                q.setParameter(7, address.getAddress2());
                q.setParameter(8, address.getPostCode());
                q.setParameter(9, address.getCity());
                q.setParameter(10, address.getOther());
                q.setParameter(11, address.getPhone());
                q.setParameter(12, address.getPhoneMobile());
                q.setParameter(13, address.getDni());
                q.setParameter(14, address.getCli_id());
                q.setParameter(15, idAddress);
                int variable = 100;
                variable = q.executeUpdate();
                em.getTransaction().commit();
                return true;
            } catch (Exception ex) {
                em.getTransaction().rollback();
                Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                em.close();
            }
        }
        return false;
    }

    //ORDERS
    public int setOrder(Orders order, int idAddress, int idCard) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        if (em != null) {
            // te quedaste aqui con el error de que no inserta
            try {
                String sql = "INSERT INTO `order` (currentState, module, deliveryNumber, deliveryDate, shippingNumber, payment, totalPaidTaxInc, car_id, deliveryAddress, invoiceAddress, gift, order_detail_id, ecommerce_id) "
                        + " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13) ; ";
                Query q = createNativeQuery(sql);
                q.setParameter(1, order.getCurrent_state());
                q.setParameter(2, order.getModule());
                q.setParameter(3, order.getDelivery_number());
                q.setParameter(4, order.getDelivery_date());
                q.setParameter(5, order.getShipping_number());
                q.setParameter(6, order.getPayment());
                q.setParameter(7, order.getTotal_paid_tax_incl());
                q.setParameter(8, idCard);
                q.setParameter(9, idAddress);
                q.setParameter(10, idAddress);
                q.setParameter(11, Integer.parseInt(order.getGift().trim()));
                q.setParameter(12, 0);
                q.setParameter(13, order.getId());
                if (q.executeUpdate() != 0) {
                    em.getTransaction().commit();
                    return getInsertId();
                }
            } catch (Exception ex) {
                em.getTransaction().rollback();
                Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                em.close();
            }
        }
        return 0;
    }

    public List getOrder(int idOrder) {
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT * FROM `order` WHERE ecommerce_id=?1 ;";
            Query q = em.createNativeQuery(sql);
            q.setParameter(1, idOrder);
            List<Object[]> resultado = q.getResultList();
            List<Order1> collect = resultado.stream().map(objeto -> {
                Order1 od = new Order1();
                od.setOrdId((Long) objeto[0]);
                od.setCurrentState("" + objeto[1]);
                od.setModule("" + objeto[2]);
                od.setDeliveryNumber("" + objeto[3]);
                od.setDeliveryDate((Date) objeto[4]);
                od.setShippingNumber("" + objeto[5]);
                od.setPayment("" + objeto[6]);
                od.setTotalPaidTaxInc((BigDecimal) objeto[7]);
                od.setGift((boolean) objeto[11]);
                //     od.setOrderDetailList((List<OrderDetail>) objeto[12]);
                od.setEcommerceId((int) objeto[13]);
                return od;
            }).collect(Collectors.toList());
            return collect;
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }

    public List getOrders() {
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT ecommerce_id FROM `order` ;";
            Query q = createNativeQuery(sql);
            return q.getResultList();
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }

    public List getOrdersList() {
        try {
            String sql = "SELECT o.ord_id, c.nombre, a.address1, o.totalPaidTaxInc, o.currentState, o.deliveryDate"
                    + "  FROM `order` AS o"
                    + "  INNER JOIN `address` AS a ON a.add_id = o.deliveryAddress"
                    + "  INNER JOIN `cliente` AS c ON c.cli_id = a.cli_id ; ";
            Query q = createNativeQuery(sql);
            List<Object[]> resultado = q.getResultList();
            List<Orders> collect = resultado.stream().map(objeto -> {
                Orders order = new Orders();
                order.setId(Integer.parseInt("" + objeto[0]));
                order.setName("" + objeto[1]);
                order.setAddress("" + objeto[2]);
                order.setPrice("" + objeto[3]);
                order.setStatus("" + objeto[4]);
                order.setDate("" + objeto[5]);
                return order;
            }).collect(Collectors.toList());
            return collect;
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }

    public List getOrderListReport(int idOrder) {
        try {
            String sql = "SELECT  c.nombre, a.address1, a.city, a.address2, a.postCode, o.totalPaidTaxInc "
                    + " FROM `order` AS o "
                    + "  INNER JOIN `address` AS a ON a.add_id = o.deliveryAddress "
                    + "  INNER JOIN `cliente` AS c ON c.cli_id = a.cli_id "
                    + " WHERE o.ord_id = ?1 LIMIT 1; ";
            Query q = createNativeQuery(sql);
            q.setParameter(1, idOrder);
            List<Object[]> resultado = q.getResultList();
            List<OrdersRepo> collect = resultado.stream().map(objeto -> {
                OrdersRepo order = new OrdersRepo();
                order.setName("" + objeto[0]);
                order.setAddress1("" + objeto[1]);
                order.setCity("" + objeto[2]);
                order.setState("" + objeto[3]);
                order.setZipCode("" + objeto[4]);
                order.setTotalPaid("" + objeto[5]);
                return order;
            }).collect(Collectors.toList());
            return collect;
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }

    public OrdersDataDetail getOrdersDataDetail(int Order_id) {
        OrdersDataDetail data = null;
        try {
            String sql = "SELECT o.ord_id, c.nombre, a.rfc, a.address1, a.city, c.estado, a.postCode, o.deliveryDate, o.shippingNumber "
                    + "FROM `order` AS o "
                    + "    INNER JOIN `address` AS a ON a.add_id = o.deliveryAddress "
                    + "    INNER JOIN `cliente` AS c ON c.cli_id = a.cli_id WHERE o.ord_id = ?1  LIMIT 1; ";
            Query q = createNativeQuery(sql);
            q.setParameter(1, Order_id);
            Object[] objeto = (Object[]) q.getSingleResult();

            data = new OrdersDataDetail();
            data.setId(Integer.parseInt("" + objeto[0]));
            data.setNombre("" + objeto[1]);
            data.setRfc("" + objeto[2]);
            data.setAddress1("" + objeto[3]);
            data.setCity("" + objeto[4]);
            data.setEstado("" + objeto[5]);
            data.setPostCode("" + objeto[6]);
            data.setDeliveryDate("" + objeto[7]);
            data.setShippingNumber("" + objeto[7]);

        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    public boolean updateOrder(Orders order, int id, int idOrder) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        if (em != null) {
            try {
                String sql = "UPDATE `order` "
                        + "SET currentState=?1, module=?2, deliveryNumber=?3, deliveryDate=?4, shippingNumber=?5, payment=?6, totalPaidTaxInc=?7, car_id=?8, "
                        + "deliveryAddress=?9, invoiceAddress=?10, gift=?11, order_detail_id=?12, ecommerce_id=?13 WHERE ord_id=?14 ; ";

                Query q = em.createNativeQuery(sql);
                q.setParameter(1, order.getCurrent_state());
                q.setParameter(2, order.getModule());
                q.setParameter(3, order.getDelivery_number());
                q.setParameter(4, order.getDelivery_date());
                q.setParameter(5, order.getShipping_number());
                q.setParameter(6, order.getPayment());
                q.setParameter(7, order.getTotal_paid_tax_incl());
                q.setParameter(8, order.getId_carrier());
                q.setParameter(9, order.getId_address_delivery());
                q.setParameter(10, order.getId_address_invoice());
                q.setParameter(11, Integer.parseInt(order.getGift().trim()));
                q.setParameter(12, idOrder);
                q.setParameter(13, order.getId());
                q.setParameter(14, id);

                int row = q.executeUpdate();
                em.getTransaction().commit();
                return row > 0;
            } catch (Exception ex) {
                em.getTransaction().rollback();
                Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                em.close();
            }
        }
        return false;
    }

    //Order detail
    public int setOrderDetail(OrdersDetail orderdetail, int idOrder) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        if (em != null) {
            try {
                String sql = "INSERT INTO `orderDetail` (productId, productIdAttr, quantity, productName, productReference, productPrice, ord_id) "
                        + "VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7) ; ";
                BigDecimal price = new BigDecimal(orderdetail.getProduct_price());
                Query q = createNativeQuery(sql);
                q.setParameter(1, orderdetail.getProduct_id());
                q.setParameter(2, orderdetail.getProduct_attribute_id());
                q.setParameter(3, Integer.parseInt(orderdetail.getProduct_quantity().trim()));
                q.setParameter(4, orderdetail.getProduct_name());
                q.setParameter(5, orderdetail.getProduct_reference());
                q.setParameter(6, price);
                q.setParameter(7, idOrder);
                if (q.executeUpdate() != 0) {
                    em.getTransaction().commit();
                    return getInsertId();
                }
            } catch (Exception ex) {
                em.getTransaction().rollback();
                Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                em.close();
            }
        }
        return 0;
    }

    public List getOrderDetail(int idOrderDetail) {
        EntityManager em = getEntityManager();
        String sql = "SELECT * FROM orderDetail WHERE ord_id=?1 ;";
        try {
            Query q = em.createNativeQuery(sql);
            q.setParameter(1, idOrderDetail);
            List<Object[]> resultado = q.getResultList();
            List<OrderDetail> collect = resultado.stream().map(objeto -> {
                OrderDetail od = new OrderDetail();
                od.setOddId((Long) objeto[0]);
                od.setProductId((Long) objeto[1]);
                od.setProductIdAttr((Long) objeto[2]);
                od.setQuantity((BigDecimal) objeto[3]);
                od.setProductName("" + objeto[4]);
                od.setProductReference("" + objeto[5]);
                od.setProductPrice((BigDecimal) objeto[6]);
                return od;
            }).collect(Collectors.toList());
            return collect;
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }

    public boolean updateOrderDetail(OrdersDetail orderdetail, int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        if (em != null) {
            try {
                String sql = "UPDATE `orderDetail` "
                        + "SET productId=?1, productIdAttr=?2, quantity=?3, productName=?4, productReference=?5, productPrice=?6, ord_id=?7 "
                        + "WHERE odd_id=?8;";
                Query q = createNativeQuery(sql);
                q.setParameter(1, orderdetail.getProduct_id());
                q.setParameter(2, orderdetail.getProduct_attribute_id());
                q.setParameter(3, orderdetail.getProduct_quantity());
                q.setParameter(4, orderdetail.getProduct_name());
                q.setParameter(5, orderdetail.getProduct_reference());
                q.setParameter(6, orderdetail.getProduct_price());
                q.setParameter(7, orderdetail.getId_order());
                q.setParameter(8, orderdetail.getId());
                int row = q.executeUpdate();
                em.getTransaction().commit();
                return row > 0;
            } catch (Exception ex) {
                em.getTransaction().rollback();
                Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                em.close();
            }
        }
        return false;
    }

    ////Carrier////
    public int setCarrier(Carriers carrier) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        if (em != null) {
            try {
                String sql = "INSERT INTO carrier (name, isFree, url, status) VALUES(?1, ?2, ?3, ?4) ; ";
                Query q = createNativeQuery(sql);
                q.setParameter(1, carrier.getName());
                q.setParameter(2, Integer.parseInt(carrier.getIs_free().trim()));
                q.setParameter(3, carrier.getUrl());
                q.setParameter(4, Integer.parseInt(carrier.getActive().trim()));
                if (q.executeUpdate() != 0) {
                    em.getTransaction().commit();
                    return getInsertId();
                }
            } catch (Exception ex) {
                em.getTransaction().rollback();
                Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                em.close();
            }
        }
        return 0;
    }

    public List getCarrier(int idCarrier) {
        EntityManager em = getEntityManager();
        String sql = "SELECT car_id, name, isFree, url, status FROM carrier WHERE car_id = ?1 ; ";
        try {
            Query q = em.createNativeQuery(sql, Carrier.class);
            q.setParameter(1, idCarrier);
            return q.getResultList();
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }

    public List getCarriers() {
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT * FROM carrier ; ";
            Query q = em.createNativeQuery(sql, Carrier.class);
            return q.getResultList();
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }

    public boolean updateCarriers(Carriers carrier, int idCarrier) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        if (em != null) {
            try {
                String sql = "UPDATE carrier SET name=?1, isFree=?2, url=?3, status=?4 WHERE car_id=?5 ; ";
                Query q = createNativeQuery(sql);
                q.setParameter(1, carrier.getName());
                q.setParameter(2, Integer.parseInt(carrier.getIs_free().trim()));
                q.setParameter(3, carrier.getUrl());
                q.setParameter(4, Integer.parseInt(carrier.getActive().trim()));
                q.setParameter(5, idCarrier);
                if (q.executeUpdate() != 0) {
                    em.getTransaction().commit();
                    return true;
                }
            } catch (Exception ex) {
                em.getTransaction().rollback();
                Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                em.close();
            }
        }
        return false;
    }

    public boolean checkCarrierExist(int id) {
        EntityManager em = getEntityManager();
        String sql = "SELECT * FROM carrier WHERE car_id = ?1 ; ";
        try {
            Query q = em.createNativeQuery(sql, Carrier.class);
            q.setParameter(1, id);

            if (!q.getResultList().isEmpty()) {
                return true;
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //Customer
    public int setCustomer(Customers customer) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        if (em != null) {
            try {
                String sql = "INSERT INTO "
                        + "cliente (nombre, representante, domicilio, noExt, noInt, localidad, ciudad, estado, pais, codigoPostal, colonia, rfc, curp, telefono, celular, mail, comentario, status, limite, precio, diasCredito, retener, desglosarIEPS, notificar, clave, foto, huella, muestra, usoCfdi, sid, grc_id) "
                        + "VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13, ?14, ?15, ?16, ?17, ?18, ?19, ?20, ?21, ?22, ?23, ?24, ?25, ?26, ?27, ?28, ?29, ?30, ?31) ; ";
                Query q = createNativeQuery(sql);
                int notificar;
                if (customer.getNewsletter_date_add() != null) {
                    notificar = 0;
                } else {
                    notificar = 1;
                }
                q.setParameter(1, customer.getFirstname() + " " + customer.getLastname());
                q.setParameter(2, customer.getFirstname() + " " + customer.getLastname());
                q.setParameter(3, " ");//domicilio
                q.setParameter(4, "  ");//noExt
                q.setParameter(5, " ");//noInt
                q.setParameter(6, " ");//localidad
                q.setParameter(7, " ");//ciudad
                q.setParameter(8, " ");//estado
                q.setParameter(9, " ");//pais
                q.setParameter(10, " ");//zipcode
                q.setParameter(11, " ");//colonia
                q.setParameter(12, " ");//rfc
                q.setParameter(13, " ");//curp
                q.setParameter(14, " ");//telefono
                q.setParameter(15, " ");//celular
                q.setParameter(16, customer.getEmail());//email
                q.setParameter(17, "ecommerce");//comentario
                q.setParameter(18, 1);//status
                q.setParameter(19, 0);//limit
                q.setParameter(20, 0);//precio
                q.setParameter(21, 0);//dias de creito
                q.setParameter(22, 0);//retener
                q.setParameter(23, 0);//desglosarIEPS
                q.setParameter(24, notificar);//notifcar
                q.setParameter(25, null);//clave
                q.setParameter(26, null);//foto
                q.setParameter(27, null);//huella
                q.setParameter(28, null);//muestra
                q.setParameter(29, null);//usocfdi
                q.setParameter(30, null);//sid
                q.setParameter(31, null);//grc_id
                if (q.executeUpdate() != 0) {
                    em.getTransaction().commit();
                    //return getInsertId();
                    return 1;
                }
            } catch (Exception ex) {
                em.getTransaction().rollback();
                Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                em.close();
            }
        }
        return 0;
    }

    public List getCustomer(int idCustomer) {
        try {
            String sql = "SELECT * "
                    + " FROM cliente "
                    + " WHERE comentario ='ecommerce' AND ecommerce_id=?1 ; ";
            Query q = createNativeQuery(sql);
            q.setParameter(1, idCustomer);
            return q.getResultList();
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }

    public List getCustomerAll() {
        try {
            EntityManager em = getEntityManager();
            String sql = "SELECT * FROM `cliente` WHERE comentario = 'ecommerce' ; ";
            Query q = em.createNativeQuery(sql, Cliente.class);
            return q.getResultList();
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }

    public boolean updateCustomer(Customers customer) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        if (em != null) {
            try {
                String sql = "UPDATE cliente "
                        + "SET nombre=?1, representante=?2, domicilio=?3, noExt=?4, noInt=?5, localidad=?6, ciudad=?7, estado=?8, "
                        + "pais=?9, codigoPostal=?10, colonia=?11, rfc=?12, curp=?13, telefono=?14, celular=?15, mail=?16, comentario=?17, status=?18, "
                        + "limite=?19, precio=?20, diasCredito=?21, retener=?22, desglosarIEPS=?23, notificar=?24, clave=?25 "
                        + "WHERE mail=?26 AND comentario='ecommerce' ; ";
                int notificar;
                if (customer.getNewsletter_date_add() != null) {
                    notificar = 0;
                } else {
                    notificar = 1;
                }
                Query q = createNativeQuery(sql);
                q.setParameter(1, customer.getFirstname() + " " + customer.getLastname());
                q.setParameter(2, customer.getFirstname() + " " + customer.getLastname());
                q.setParameter(3, " ");
                q.setParameter(4, "  ");
                q.setParameter(5, " ");
                q.setParameter(6, " ");
                q.setParameter(7, " ");
                q.setParameter(8, " ");
                q.setParameter(9, " ");
                q.setParameter(10, " ");
                q.setParameter(11, " ");
                q.setParameter(12, " ");
                q.setParameter(13, " ");
                q.setParameter(14, " ");
                q.setParameter(15, " ");
                q.setParameter(16, customer.getEmail());
                q.setParameter(17, "ecommerce");
                q.setParameter(18, 1);
                q.setParameter(19, 0);
                q.setParameter(20, 0);
                q.setParameter(21, 0);
                q.setParameter(22, 0);
                q.setParameter(23, 0);
                q.setParameter(24, notificar);
                q.setParameter(25, " ");
                q.setParameter(26, customer.getEmail());
                int row = q.executeUpdate();
                em.getTransaction().commit();
                getInsertId();
                return row > 0;
            } catch (Exception ex) {
                em.getTransaction().rollback();
                Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                em.close();
            }
        }
        return false;
    }

    public Query createNativeQuery(String sql) {
        EntityManager em = getEntityManager();
        return em.createNativeQuery(sql);
    }

    public int getInsertId() {
        try {
            String sq = "SELECT LAST_INSERT_ID();";
            Query q = createNativeQuery(sq);
            idA = q.getResultList();
            if (idA != null) {
                idA.forEach(a -> {
                    idInsert = Integer.parseInt(a.toString());
                });
            }
            return idInsert;
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
