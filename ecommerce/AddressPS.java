
public class AddressPS {

    private String id;
    private String id_customer;
    private String id_country;
    private String id_state;
    private String alias;
    private String lastName;
    private String name;
    private String address1;
    private String zipCode;
    private String city;
    private String phone;

    public AddressPS() {
    }

    public AddressPS(String id, String id_customer, String id_country, String id_state, String alias, String lastName, String name, String address1, String zipCode, String city, String phone) {
        this.id = id;
        this.id_customer = id_customer;
        this.id_country = id_country;
        this.id_state = id_state;
        this.alias = alias;
        this.lastName = lastName;
        this.name = name;
        this.address1 = address1;
        this.zipCode = zipCode;
        this.city = city;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getId_customer() {
        return id_customer;
    }

    public String getId_country() {
        return id_country;
    }

    public String getId_state() {
        return id_state;
    }

    public String getAlias() {
        return alias;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getAddress1() {
        return address1;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setId_customer(String id_customer) {
        this.id_customer = id_customer;
    }

    public void setId_country(String id_country) {
        this.id_country = id_country;
    }

    public void setId_state(String id_state) {
        this.id_state = id_state;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
