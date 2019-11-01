

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 * <h1>OrderState class</h1>
 * <p>this classs used for cast xml to object</p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderState {

    @XmlElement(name = "id")
    private int id;

    @XmlElement(name = "unremovable")
    private String unremovable;

    @XmlElement(name = "delivery")
    private String delivery;

    @XmlElement(name = "hidden")
    private String hidden;

    @XmlElement(name = "send_email")
    private String send_email;

    @XmlElement(name = "module_name")
    private String module_name;

    @XmlElement(name = "invoice")
    private String invoice;

    @XmlElement(name = "color")
    private String color;

    @XmlElement(name = "logable")
    private String logable;

    @XmlElement(name = "shipped")
    private String shipped;

    @XmlElement(name = "paid")
    private String paid;

    @XmlElement(name = "pdf_delivery")
    private String pdf_delivery;

    @XmlElement(name = "pdf_invoice")
    private String pdf_invoice;

    @XmlElement(name = "deleted")
    private String deleted;

    @XmlElement(name = "name")
    private Name name;

    @XmlElement(name = "template")
    private Name template;

    public OrderState() {
    }

    public OrderState(int id, String unremovable, String delivery, String hidden, String send_email, String module_name, String invoice, String color, String logable, String shipped, String paid, String pdf_delivery, String pdf_invoice, String deleted, Name name, Name template) {
        this.id = id;
        this.unremovable = unremovable;
        this.delivery = delivery;
        this.hidden = hidden;
        this.send_email = send_email;
        this.module_name = module_name;
        this.invoice = invoice;
        this.color = color;
        this.logable = logable;
        this.shipped = shipped;
        this.paid = paid;
        this.pdf_delivery = pdf_delivery;
        this.pdf_invoice = pdf_invoice;
        this.deleted = deleted;
        this.name = name;
        this.template = template;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnremovable() {
        return unremovable;
    }

    public void setUnremovable(String unremovable) {
        this.unremovable = unremovable;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getHidden() {
        return hidden;
    }

    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    public String getSend_email() {
        return send_email;
    }

    public void setSend_email(String send_email) {
        this.send_email = send_email;
    }

    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogable() {
        return logable;
    }

    public void setLogable(String logable) {
        this.logable = logable;
    }

    public String getShipped() {
        return shipped;
    }

    public void setShipped(String shipped) {
        this.shipped = shipped;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getPdf_delivery() {
        return pdf_delivery;
    }

    public void setPdf_delivery(String pdf_delivery) {
        this.pdf_delivery = pdf_delivery;
    }

    public String getPdf_invoice() {
        return pdf_invoice;
    }

    public void setPdf_invoice(String pdf_invoice) {
        this.pdf_invoice = pdf_invoice;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getTemplate() {
        return template;
    }

    public void setTemplate(Name template) {
        this.template = template;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
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
        final OrderState other = (OrderState) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrderState{" + "id=" + id + ", unremovable=" + unremovable + ", delivery=" + delivery + ", hidden=" + hidden + ", send_email=" + send_email + ", module_name=" + module_name + ", invoice=" + invoice + ", color=" + color + ", logable=" + logable + ", shipped=" + shipped + ", paid=" + paid + ", pdf_delivery=" + pdf_delivery + ", pdf_invoice=" + pdf_invoice + ", deleted=" + deleted + ", name=" + name + ", template=" + template + '}';
    }

}
