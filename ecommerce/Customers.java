
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 */
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "customer")
public class Customers {

    @XmlElement(name = "id")
    private int id;

    @XmlElement(name = "id_default_group")
    private int id_default_group;

    @XmlElement(name = "id_lang")
    private int id_lang;

    @XmlElement(name = "newsletter_date_add")
    private String newsletter_date_add;

    @XmlElement(name = "ip_registration_newsletter")
    private String ip_registration_newsletter;

    @XmlElement(name = "last_passwd_gen")
    private String last_passwd_gen;

    @XmlElement(name = "secure_key")
    private String secure_key;

    @XmlElement(name = "deleted")
    private int deleted;

    @XmlElement(name = "passwd")
    private String passwd;

    @XmlElement(name = "lastname")
    private String lastname;

    @XmlElement(name = "firstname")
    private String firstname;

    @XmlElement(name = "email")
    private String email;

    @XmlElement(name = "birthday")
    private String birthday;

    @XmlElement(name = "newsletter")
    private int newsletter;

    @XmlElement(name = "optin")
    private int optin;

    @XmlElement(name = "company")
    private String company;

    @XmlElement(name = "siret")
    private String siret;

    @XmlElement(name = "ape")
    private String ape;

    @XmlElement(name = "outstanding_allow_amount")
    private String outstanding_allow_amount;

    @XmlElement(name = "show_public_prices")
    private String show_public_prices;

    @XmlElement(name = "id_risk")
    private String id_risk;

    @XmlElement(name = "max_payment_days")
    private String max_payment_days;

    @XmlElement(name = "active")
    private int active;

    @XmlElement(name = "note")
    private String note;

    @XmlElement(name = "is_guest")
    private String is_guest;

    @XmlElement(name = "id_shop")
    private int id_shop;

    @XmlElement(name = "id_shop_group")
    private int id_shop_group;

    @XmlElement(name = "date_add")
    private String date_add;

    @XmlElement(name = "date_upd")
    private String date_upd;

    @XmlElement(name = "reset_password_token")
    private String reset_password_token;

    @XmlElement(name = "reset_password_validity")
    private String reset_password_validity;

    @XmlElement(name = "associations")
    private AssociationsGroups associations;

    public Customers() {
    }

    public Customers(int id, int id_default_group, int id_lang, String newsletter_date_add, String ip_registration_newsletter, String last_passwd_gen, String secure_key, int deleted, String passwd, String lastname, String firstname, String email, String birthday, int newsletter, int optin, String company, String siret, String ape, String outstanding_allow_amount, String show_public_prices, String id_risk, String max_payment_days, int active, String note, String is_guest, int id_shop, int id_shop_group, String date_add, String date_upd, String reset_password_token, String reset_password_validity, AssociationsGroups associations) {
        this.id = id;
        this.id_default_group = id_default_group;
        this.id_lang = id_lang;
        this.newsletter_date_add = newsletter_date_add;
        this.ip_registration_newsletter = ip_registration_newsletter;
        this.last_passwd_gen = last_passwd_gen;
        this.secure_key = secure_key;
        this.deleted = deleted;
        this.passwd = passwd;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.birthday = birthday;
        this.newsletter = newsletter;
        this.optin = optin;
        this.company = company;
        this.siret = siret;
        this.ape = ape;
        this.outstanding_allow_amount = outstanding_allow_amount;
        this.show_public_prices = show_public_prices;
        this.id_risk = id_risk;
        this.max_payment_days = max_payment_days;
        this.active = active;
        this.note = note;
        this.is_guest = is_guest;
        this.id_shop = id_shop;
        this.id_shop_group = id_shop_group;
        this.date_add = date_add;
        this.date_upd = date_upd;
        this.reset_password_token = reset_password_token;
        this.reset_password_validity = reset_password_validity;
        this.associations = associations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_default_group() {
        return id_default_group;
    }

    public void setId_default_group(int id_default_group) {
        this.id_default_group = id_default_group;
    }

    public int getId_lang() {
        return id_lang;
    }

    public void setId_lang(int id_lang) {
        this.id_lang = id_lang;
    }

    public String getNewsletter_date_add() {
        return newsletter_date_add;
    }

    public void setNewsletter_date_add(String newsletter_date_add) {
        this.newsletter_date_add = newsletter_date_add;
    }

    public String getIp_registration_newsletter() {
        return ip_registration_newsletter;
    }

    public void setIp_registration_newsletter(String ip_registration_newsletter) {
        this.ip_registration_newsletter = ip_registration_newsletter;
    }

    public String getLast_passwd_gen() {
        return last_passwd_gen;
    }

    public void setLast_passwd_gen(String last_passwd_gen) {
        this.last_passwd_gen = last_passwd_gen;
    }

    public String getSecure_key() {
        return secure_key;
    }

    public void setSecure_key(String secure_key) {
        this.secure_key = secure_key;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(int newsletter) {
        this.newsletter = newsletter;
    }

    public int getOptin() {
        return optin;
    }

    public void setOptin(int optin) {
        this.optin = optin;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getOutstanding_allow_amount() {
        return outstanding_allow_amount;
    }

    public void setOutstanding_allow_amount(String outstanding_allow_amount) {
        this.outstanding_allow_amount = outstanding_allow_amount;
    }

    public String getShow_public_prices() {
        return show_public_prices;
    }

    public void setShow_public_prices(String show_public_prices) {
        this.show_public_prices = show_public_prices;
    }

    public String getId_risk() {
        return id_risk;
    }

    public void setId_risk(String id_risk) {
        this.id_risk = id_risk;
    }

    public String getMax_payment_days() {
        return max_payment_days;
    }

    public void setMax_payment_days(String max_payment_days) {
        this.max_payment_days = max_payment_days;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getIs_guest() {
        return is_guest;
    }

    public void setIs_guest(String is_guest) {
        this.is_guest = is_guest;
    }

    public int getId_shop() {
        return id_shop;
    }

    public void setId_shop(int id_shop) {
        this.id_shop = id_shop;
    }

    public int getId_shop_group() {
        return id_shop_group;
    }

    public void setId_shop_group(int id_shop_group) {
        this.id_shop_group = id_shop_group;
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

    public String getReset_password_token() {
        return reset_password_token;
    }

    public void setReset_password_token(String reset_password_token) {
        this.reset_password_token = reset_password_token;
    }

    public String getReset_password_validity() {
        return reset_password_validity;
    }

    public void setReset_password_validity(String reset_password_validity) {
        this.reset_password_validity = reset_password_validity;
    }

    public AssociationsGroups getAssociations() {
        return associations;
    }

    public void setAssociations(AssociationsGroups associations) {
        this.associations = associations;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
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
        final Customers other = (Customers) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Customers{" + "id=" + id + ", id_default_group=" + id_default_group + ", id_lang=" + id_lang + ", newsletter_date_add=" + newsletter_date_add + ", ip_registration_newsletter=" + ip_registration_newsletter + ", last_passwd_gen=" + last_passwd_gen + ", secure_key=" + secure_key + ", deleted=" + deleted + ", passwd=" + passwd + ", lastname=" + lastname + ", firstname=" + firstname + ", email=" + email + ", birthday=" + birthday + ", newsletter=" + newsletter + ", optin=" + optin + ", company=" + company + ", siret=" + siret + ", ape=" + ape + ", outstanding_allow_amount=" + outstanding_allow_amount + ", show_public_prices=" + show_public_prices + ", id_risk=" + id_risk + ", max_payment_days=" + max_payment_days + ", active=" + active + ", note=" + note + ", is_guest=" + is_guest + ", id_shop=" + id_shop + ", id_shop_group=" + id_shop_group + ", date_add=" + date_add + ", date_upd=" + date_upd + ", reset_password_token=" + reset_password_token + ", reset_password_validity=" + reset_password_validity + ", associations=" + associations + '}';
    }

}
