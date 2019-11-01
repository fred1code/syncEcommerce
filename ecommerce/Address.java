import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {

    @XmlElement(name = "id")
    private String id;
    @XmlElement(name = "id_customer")
    private int idCustomer;
    @XmlElement(name = "id_manufacturer")
    private String idManufacturer;
    @XmlElement(name = "id_supplier")
    private String idSupplier;
    @XmlElement(name = "id_warehouse")
    private String idWareHouse;
    @XmlElement(name = "id_country")
    private String idCountry;
    @XmlElement(name = "id_state")
    private String idState;
    @XmlElement(name = "alias")
    private String alias;
    @XmlElement(name = "company")
    private String company;
    @XmlElement(name = "lastname")
    private String lastname;
    @XmlElement(name = "firstname")
    private String firstname;
    @XmlElement(name = "vat_number")
    private String vat_number;
    @XmlElement(name = "address1")
    private String address1;
    @XmlElement(name = "address2")
    private String address2;
    @XmlElement(name = "postcode")
    private String postcode;
    @XmlElement(name = "city")
    private String city;
    @XmlElement(name = "other")
    private String other;
    @XmlElement(name = "phone")
    private String phone;
    @XmlElement(name = "phone_mobile")
    private String phoneMobile;
    @XmlElement(name = "dni")
    private String dni;
    @XmlElement(name = "deleted")
    private String deleted;
    @XmlElement(name = "date_add")
    private String date_add;
    @XmlElement(name = "date_upd")
    private String dateUpd;

    public Address() {
    }

    public Address(String id, int idCustomer, String idManufacturer, String idSupplier, String idWareHouse, String idCountry, String idState, String alias, String company, String lastname, String firstname, String vat_number, String address1, String address2, String postcode, String city, String other, String phone, String phoneMobile, String dni, String deleted, String date_add, String dateUpd) {
        this.id = id;
        this.idCustomer = idCustomer;
        this.idManufacturer = idManufacturer;
        this.idSupplier = idSupplier;
        this.idWareHouse = idWareHouse;
        this.idCountry = idCountry;
        this.idState = idState;
        this.alias = alias;
        this.company = company;
        this.lastname = lastname;
        this.firstname = firstname;
        this.vat_number = vat_number;
        this.address1 = address1;
        this.address2 = address2;
        this.postcode = postcode;
        this.city = city;
        this.other = other;
        this.phone = phone;
        this.phoneMobile = phoneMobile;
        this.dni = dni;
        this.deleted = deleted;
        this.date_add = date_add;
        this.dateUpd = dateUpd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(String idManufacturer) {
        this.idManufacturer = idManufacturer;
    }

    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getIdWareHouse() {
        return idWareHouse;
    }

    public void setIdWareHouse(String idWareHouse) {
        this.idWareHouse = idWareHouse;
    }

    public String getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(String idCountry) {
        this.idCountry = idCountry;
    }

    public String getIdState() {
        return idState;
    }

    public void setIdState(String idState) {
        this.idState = idState;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getVat_number() {
        return vat_number;
    }

    public void setVat_number(String vat_number) {
        this.vat_number = vat_number;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getDate_add() {
        return date_add;
    }

    public void setDate_add(String date_add) {
        this.date_add = date_add;
    }

    public String getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(String dateUpd) {
        this.dateUpd = dateUpd;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final Address other = (Address) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Address{" + "id=" + id + ", idCustomer=" + idCustomer + ", idManufacturer=" + idManufacturer + ", idSupplier=" + idSupplier + ", idWareHouse=" + idWareHouse + ", idCountry=" + idCountry + ", idState=" + idState + ", alias=" + alias + ", company=" + company + ", lastname=" + lastname + ", firstname=" + firstname + ", vat_number=" + vat_number + ", address1=" + address1 + ", address2=" + address2 + ", postcode=" + postcode + ", city=" + city + ", other=" + other + ", phone=" + phone + ", phoneMobile=" + phoneMobile + ", dni=" + dni + ", deleted=" + deleted + ", date_add=" + date_add + ", dateUpd=" + dateUpd + '}';
    }
    
}
