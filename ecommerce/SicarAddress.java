
public class Saddress {

    private int add_id;
    private String alias;
    private String company;
    private String lastName;
    private String firstName;
    private String VAT;
    private String address1;
    private String address2;
    private String postCode;
    private String city;
    private String other;
    private String phone;
    private String phoneMobile;
    private String dni;
    private int cli_id;
    private String rfc;
    private int ecommerce_id;

    public Saddress() {
    }

    public Saddress(int add_id, String alias, String company, String lastName, String firstName, String vat, String address1, String address2, String postCode, String city, String other, String phone, String phoneMobile, String dni, int cli_id, String rfc, int ecommerce_id) {
        this.add_id = add_id;
        this.alias = alias;
        this.company = company;
        this.lastName = lastName;
        this.firstName = firstName;
        this.VAT = vat;
        this.address1 = address1;
        this.address2 = address2;
        this.postCode = postCode;
        this.city = city;
        this.other = other;
        this.phone = phone;
        this.phoneMobile = phoneMobile;
        this.dni = dni;
        this.cli_id = cli_id;
        this.rfc = rfc;
        this.ecommerce_id = ecommerce_id;
    }

    public int getAdd_id() {
        return add_id;
    }

    public void setAdd_id(int add_id) {
        this.add_id = add_id;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getVAT() {
        return VAT;
    }

    public void setVAT(String VAT) {
        this.VAT = VAT;
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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
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

    public int getCli_id() {
        return cli_id;
    }

    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public int getEcommerce_id() {
        return ecommerce_id;
    }

    public void setEcommerce_id(int ecommerce_id) {
        this.ecommerce_id = ecommerce_id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.add_id;
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
        final Saddress other = (Saddress) obj;
        if (this.add_id != other.add_id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Saddress{" + "add_id=" + add_id + ", alias=" + alias + ", company=" + company + ", lastName=" + lastName + ", firstName=" + firstName + ", vat=" + VAT + ", address1=" + address1 + ", address2=" + address2 + ", postCode=" + postCode + ", city=" + city + ", other=" + other + ", phone=" + phone + ", phoneMobile=" + phoneMobile + ", dni=" + dni + ", cli_id=" + cli_id + ", rfc=" + rfc + ", ecommerce_id=" + ecommerce_id + '}';
    }

}
