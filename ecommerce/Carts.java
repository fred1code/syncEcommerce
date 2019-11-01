
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 */
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "cart")
public class Carts {

    @XmlElement(name = "id")
    private int id;

    @XmlElement(name = "id_address_delivery")
    private int id_address_delivery;

    @XmlElement(name = "id_address_invoice")
    private int id_address_invoice;

    @XmlElement(name = "id_currency")
    private int id_currency;

    @XmlElement(name = "id_customer")
    private int id_customer;

    @XmlElement(name = "id_guest")
    private int id_guest;

    @XmlElement(name = "id_lang")
    private int id_lang;

    @XmlElement(name = "id_shop_group")
    private int id_shop_group;

    @XmlElement(name = "id_shop")
    private int id_shop;

    @XmlElement(name = "id_carrier")
    private int id_carrier;

    @XmlElement(name = "recyclable")
    private String recyclable;

    @XmlElement(name = "gift")
    private String gift;

    @XmlElement(name = "gift_message")
    private String gift_message;

    @XmlElement(name = "mobile_theme")
    private String mobile_theme;

    @XmlElement(name = "delivery_option")
    private String delivery_option;

    @XmlElement(name = "secure_key")
    private String secure_key;

    @XmlElement(name = "allow_seperated_package")
    private String allow_seperated_package;

    @XmlElement(name = "date_add")
    private String date_add;

    @XmlElement(name = "date_upd")
    private String date_upd;

    @XmlElement(name = "associations")
    private CartRows associations;

    public Carts() {
    }

    public Carts(int id, int id_address_delivery, int id_address_invoice, int id_currency, int id_customer, int id_guest, int id_lang, int id_shop_group, int id_shop, int id_carrier, String recyclable, String gift, String gift_message, String mobile_theme, String delivery_option, String secure_key, String allow_seperated_package, String date_add, String date_upd, CartRows associations) {
        this.id = id;
        this.id_address_delivery = id_address_delivery;
        this.id_address_invoice = id_address_invoice;
        this.id_currency = id_currency;
        this.id_customer = id_customer;
        this.id_guest = id_guest;
        this.id_lang = id_lang;
        this.id_shop_group = id_shop_group;
        this.id_shop = id_shop;
        this.id_carrier = id_carrier;
        this.recyclable = recyclable;
        this.gift = gift;
        this.gift_message = gift_message;
        this.mobile_theme = mobile_theme;
        this.delivery_option = delivery_option;
        this.secure_key = secure_key;
        this.allow_seperated_package = allow_seperated_package;
        this.date_add = date_add;
        this.date_upd = date_upd;
        this.associations = associations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_address_delivery() {
        return id_address_delivery;
    }

    public void setId_address_delivery(int id_address_delivery) {
        this.id_address_delivery = id_address_delivery;
    }

    public int getId_address_invoice() {
        return id_address_invoice;
    }

    public void setId_address_invoice(int id_address_invoice) {
        this.id_address_invoice = id_address_invoice;
    }

    public int getId_currency() {
        return id_currency;
    }

    public void setId_currency(int id_currency) {
        this.id_currency = id_currency;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public int getId_guest() {
        return id_guest;
    }

    public void setId_guest(int id_guest) {
        this.id_guest = id_guest;
    }

    public int getId_lang() {
        return id_lang;
    }

    public void setId_lang(int id_lang) {
        this.id_lang = id_lang;
    }

    public int getId_shop_group() {
        return id_shop_group;
    }

    public void setId_shop_group(int id_shop_group) {
        this.id_shop_group = id_shop_group;
    }

    public int getId_shop() {
        return id_shop;
    }

    public void setId_shop(int id_shop) {
        this.id_shop = id_shop;
    }

    public int getId_carrier() {
        return id_carrier;
    }

    public void setId_carrier(int id_carrier) {
        this.id_carrier = id_carrier;
    }

    public String getRecyclable() {
        return recyclable;
    }

    public void setRecyclable(String recyclable) {
        this.recyclable = recyclable;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public String getGift_message() {
        return gift_message;
    }

    public void setGift_message(String gift_message) {
        this.gift_message = gift_message;
    }

    public String getMobile_theme() {
        return mobile_theme;
    }

    public void setMobile_theme(String mobile_theme) {
        this.mobile_theme = mobile_theme;
    }

    public String getDelivery_option() {
        return delivery_option;
    }

    public void setDelivery_option(String delivery_option) {
        this.delivery_option = delivery_option;
    }

    public String getSecure_key() {
        return secure_key;
    }

    public void setSecure_key(String secure_key) {
        this.secure_key = secure_key;
    }

    public String getAllow_seperated_package() {
        return allow_seperated_package;
    }

    public void setAllow_seperated_package(String allow_seperated_package) {
        this.allow_seperated_package = allow_seperated_package;
    }

    public String getDate_add() {
        return date_add;
    }

    public void setDate_add(String date_add) {
        this.date_add = date_add;
    }

    public String getDate_upd() {
        return date_upd;
    }

    public void setDate_upd(String date_upd) {
        this.date_upd = date_upd;
    }

    public CartRows getAssociations() {
        return associations;
    }

    public void setAssociations(CartRows associations) {
        this.associations = associations;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
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
        final Carts other = (Carts) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carts{" + "id=" + id + ", id_address_delivery=" + id_address_delivery + ", id_address_invoice=" + id_address_invoice + ", id_currency=" + id_currency + ", id_customer=" + id_customer + ", id_guest=" + id_guest + ", id_lang=" + id_lang + ", id_shop_group=" + id_shop_group + ", id_shop=" + id_shop + ", id_carrier=" + id_carrier + ", recyclable=" + recyclable + ", gift=" + gift + ", gift_message=" + gift_message + ", mobile_theme=" + mobile_theme + ", delivery_option=" + delivery_option + ", secure_key=" + secure_key + ", allow_seperated_package=" + allow_seperated_package + ", date_add=" + date_add + ", date_upd=" + date_upd + ", associations=" + associations + '}';
    }
    

}
