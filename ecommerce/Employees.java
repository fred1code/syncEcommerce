
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Employees {

    @XmlElement(name = "id")
    private int id;

    @XmlElement(name = "id_lang")
    private int id_lang;

    @XmlElement(name = "last_passwd_gen")
    private String last_passwd_gen;

    @XmlElement(name = "stats_date_from")
    private String stats_date_from;

    @XmlElement(name = "stats_date_to")
    private String stats_date_to;

    @XmlElement(name = "stats_compare_from")
    private String stats_compare_from;

    @XmlElement(name = "stats_compare_to")
    private String stats_compare_to;

    @XmlElement(name = "passwd")
    private String passwd;

    @XmlElement(name = "lastname")
    private String lastname;

    @XmlElement(name = "firstname")
    private String firstname;

    @XmlElement(name = "email")
    private String email;

    @XmlElement(name = "active")
    private String active;

    @XmlElement(name = "optin")
    private String optin;

    @XmlElement(name = "id_profile")
    private String id_profile;

    @XmlElement(name = "bo_color")
    private String bo_color;

    @XmlElement(name = "default_tab")
    private String default_tab;

    @XmlElement(name = "bo_theme")
    private String bo_theme;

    @XmlElement(name = "bo_css")
    private String bo_css;

    @XmlElement(name = "bo_width")
    private String bo_width;

    @XmlElement(name = "bo_menu")
    private String bo_menu;

    @XmlElement(name = "stats_compare_option")
    private String stats_compare_option;

    @XmlElement(name = "preselect_date_range")
    private String preselect_date_range;

    @XmlElement(name = "id_last_order")
    private String id_last_order;

    @XmlElement(name = "id_last_customer_message")
    private String id_last_customer_message;

    @XmlElement(name = "id_last_customer")
    private String id_last_customer;

    @XmlElement(name = "reset_password_token")
    private String reset_password_token;

    @XmlElement(name = "reset_password_validity")
    private String reset_password_validity;

    public Employees() {
    }

    public Employees(int id, int id_lang, String last_passwd_gen, String stats_date_from, String stats_date_to, String stats_compare_from, String stats_compare_to, String passwd, String lastname, String firstname, String email, String active, String optin, String id_profile, String bo_color, String default_tab, String bo_theme, String bo_css, String bo_width, String bo_menu, String stats_compare_option, String preselect_date_range, String id_last_order, String id_last_customer_message, String id_last_customer, String reset_password_token, String reset_password_validity) {
        this.id = id;
        this.id_lang = id_lang;
        this.last_passwd_gen = last_passwd_gen;
        this.stats_date_from = stats_date_from;
        this.stats_date_to = stats_date_to;
        this.stats_compare_from = stats_compare_from;
        this.stats_compare_to = stats_compare_to;
        this.passwd = passwd;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.active = active;
        this.optin = optin;
        this.id_profile = id_profile;
        this.bo_color = bo_color;
        this.default_tab = default_tab;
        this.bo_theme = bo_theme;
        this.bo_css = bo_css;
        this.bo_width = bo_width;
        this.bo_menu = bo_menu;
        this.stats_compare_option = stats_compare_option;
        this.preselect_date_range = preselect_date_range;
        this.id_last_order = id_last_order;
        this.id_last_customer_message = id_last_customer_message;
        this.id_last_customer = id_last_customer;
        this.reset_password_token = reset_password_token;
        this.reset_password_validity = reset_password_validity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_lang() {
        return id_lang;
    }

    public void setId_lang(int id_lang) {
        this.id_lang = id_lang;
    }

    public String getLast_passwd_gen() {
        return last_passwd_gen;
    }

    public void setLast_passwd_gen(String last_passwd_gen) {
        this.last_passwd_gen = last_passwd_gen;
    }

    public String getStats_date_from() {
        return stats_date_from;
    }

    public void setStats_date_from(String stats_date_from) {
        this.stats_date_from = stats_date_from;
    }

    public String getStats_date_to() {
        return stats_date_to;
    }

    public void setStats_date_to(String stats_date_to) {
        this.stats_date_to = stats_date_to;
    }

    public String getStats_compare_from() {
        return stats_compare_from;
    }

    public void setStats_compare_from(String stats_compare_from) {
        this.stats_compare_from = stats_compare_from;
    }

    public String getStats_compare_to() {
        return stats_compare_to;
    }

    public void setStats_compare_to(String stats_compare_to) {
        this.stats_compare_to = stats_compare_to;
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

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getOptin() {
        return optin;
    }

    public void setOptin(String optin) {
        this.optin = optin;
    }

    public String getId_profile() {
        return id_profile;
    }

    public void setId_profile(String id_profile) {
        this.id_profile = id_profile;
    }

    public String getBo_color() {
        return bo_color;
    }

    public void setBo_color(String bo_color) {
        this.bo_color = bo_color;
    }

    public String getDefault_tab() {
        return default_tab;
    }

    public void setDefault_tab(String default_tab) {
        this.default_tab = default_tab;
    }

    public String getBo_theme() {
        return bo_theme;
    }

    public void setBo_theme(String bo_theme) {
        this.bo_theme = bo_theme;
    }

    public String getBo_css() {
        return bo_css;
    }

    public void setBo_css(String bo_css) {
        this.bo_css = bo_css;
    }

    public String getBo_width() {
        return bo_width;
    }

    public void setBo_width(String bo_width) {
        this.bo_width = bo_width;
    }

    public String getBo_menu() {
        return bo_menu;
    }

    public void setBo_menu(String bo_menu) {
        this.bo_menu = bo_menu;
    }

    public String getStats_compare_option() {
        return stats_compare_option;
    }

    public void setStats_compare_option(String stats_compare_option) {
        this.stats_compare_option = stats_compare_option;
    }

    public String getPreselect_date_range() {
        return preselect_date_range;
    }

    public void setPreselect_date_range(String preselect_date_range) {
        this.preselect_date_range = preselect_date_range;
    }

    public String getId_last_order() {
        return id_last_order;
    }

    public void setId_last_order(String id_last_order) {
        this.id_last_order = id_last_order;
    }

    public String getId_last_customer_message() {
        return id_last_customer_message;
    }

    public void setId_last_customer_message(String id_last_customer_message) {
        this.id_last_customer_message = id_last_customer_message;
    }

    public String getId_last_customer() {
        return id_last_customer;
    }

    public void setId_last_customer(String id_last_customer) {
        this.id_last_customer = id_last_customer;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.id;
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
        final Employees other = (Employees) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employees{" + "id=" + id + ", id_lang=" + id_lang + ", last_passwd_gen=" + last_passwd_gen + ", stats_date_from=" + stats_date_from + ", stats_date_to=" + stats_date_to + ", stats_compare_from=" + stats_compare_from + ", stats_compare_to=" + stats_compare_to + ", passwd=" + passwd + ", lastname=" + lastname + ", firstname=" + firstname + ", email=" + email + ", active=" + active + ", optin=" + optin + ", id_profile=" + id_profile + ", bo_color=" + bo_color + ", default_tab=" + default_tab + ", bo_theme=" + bo_theme + ", bo_css=" + bo_css + ", bo_width=" + bo_width + ", bo_menu=" + bo_menu + ", stats_compare_option=" + stats_compare_option + ", preselect_date_range=" + preselect_date_range + ", id_last_order=" + id_last_order + ", id_last_customer_message=" + id_last_customer_message + ", id_last_customer=" + id_last_customer + ", reset_password_token=" + reset_password_token + ", reset_password_validity=" + reset_password_validity + '}';
    }

}
