

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 * * <h1>OrdersDetail class</h1>
 * <p>this class used for cast information xml to  object</p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class OrdersDetail {

    @XmlElement(name = "id")
    private int id;

    @XmlElement(name = "id_order")
    private int id_order;

    @XmlElement(name = "product_id")
    private int product_id;

    @XmlElement(name = "product_attribute_id")
    private int product_attribute_id;

    @XmlElement(name = "product_quantity_reinjected")
    private String product_quantity_reinjected;

    @XmlElement(name = "group_reduction")
    private String group_reduction;

    @XmlElement(name = "discount_quantity_applied")
    private String discount_quantity_applied;

    @XmlElement(name = "download_hash")
    private String download_hash;
    
    @XmlElement(name = "download_deadline")
    private String download_deadline;

    @XmlElement(name = "id_order_invoice")
    private int id_order_invoice;

    @XmlElement(name = "id_warehouse")
    private int id_warehouse;

    @XmlElement(name = "id_shop")
    private int id_shop;

    @XmlElement(name = "id_customization")
    private int id_customization;

    @XmlElement(name = "product_name")
    private String product_name;

    @XmlElement(name = "product_quantity")
    private String product_quantity;

    @XmlElement(name = "product_quantity_in_stock")
    private String product_quantity_in_stock;

    @XmlElement(name = "product_quantity_return")
    private String product_quantity_return;

    @XmlElement(name = "product_quantity_refunded")
    private String product_quantity_refunded;

    @XmlElement(name = "product_price")
    private String product_price;

    @XmlElement(name = "reduction_percent")
    private String reduction_percent;

    @XmlElement(name = "reduction_amount")
    private String reduction_amount;

    @XmlElement(name = "reduction_amount_tax_incl")
    private String reduction_amount_tax_incl;

    @XmlElement(name = "reduction_amount_tax_excl")
    private String reduction_amount_tax_excl;

    @XmlElement(name = "product_quantity_discount")
    private String product_quantity_discount;

    @XmlElement(name = "product_ean13")
    private String product_ean13;

    @XmlElement(name = "product_isbn")
    private String product_isbn;

    @XmlElement(name = "product_upc")
    private String product_upc;

    @XmlElement(name = "product_reference")
    private String product_reference;

    @XmlElement(name = "product_supplier_reference")
    private String product_supplier_reference;

    @XmlElement(name = "product_weight")
    private String product_weight;

    @XmlElement(name = "tax_computation_method")
    private String tax_computation_method;

    @XmlElement(name = "id_tax_rules_group")
    private String id_tax_rules_group;

    @XmlElement(name = "ecotax")
    private String ecotax;
    
    @XmlElement(name = "ecotax_tax_rate")
    private String ecotax_tax_rate;
    
    @XmlElement(name = "download_nb")
    private String download_nb;
    
    @XmlElement(name = "unit_price_tax_incl")
    private String unit_price_tax_incl;
    
    @XmlElement(name = "unit_price_tax_excl")
    private String unit_price_tax_excl;
    
    @XmlElement(name = "total_price_tax_incl")
    private String total_price_tax_incl;
    
    @XmlElement(name = "total_price_tax_excl")
    private String total_price_tax_excl;
    
    @XmlElement(name = "total_shipping_price_tax_excl")
    private String total_shipping_price_tax_excl;
    
    @XmlElement(name = "total_shipping_price_tax_incl")
    private String total_shipping_price_tax_incl;

    @XmlElement(name = "purchase_supplier_price")
    private String purchase_supplier_price;

    @XmlElement(name = "original_product_price")
    private String original_product_price;

    @XmlElement(name = "original_wholesale_price")
    private String original_wholesale_price;
    
    @XmlElement(name = "associations")
    private String associations;

    public OrdersDetail() {
    }

    public OrdersDetail(int id, int id_order, int product_id, int product_attribute_id, String product_quantity_reinjected, String group_reduction, String discount_quantity_applied, String download_hash, String download_deadline, int id_order_invoice, int id_warehouse, int id_shop, int id_customization, String product_name, String product_quantity, String product_quantity_in_stock, String product_quantity_return, String product_quantity_refunded, String product_price, String reduction_percent, String reduction_amount, String reduction_amount_tax_incl, String reduction_amount_tax_excl, String product_quantity_discount, String product_ean13, String product_isbn, String product_upc, String product_reference, String product_supplier_reference, String product_weight, String tax_computation_method, String id_tax_rules_group, String ecotax, String ecotax_tax_rate, String download_nb, String unit_price_tax_incl, String unit_price_tax_excl, String total_price_tax_incl, String total_price_tax_excl, String total_shipping_price_tax_excl, String total_shipping_price_tax_incl, String purchase_supplier_price, String original_product_price, String original_wholesale_price, String associations) {
        this.id = id;
        this.id_order = id_order;
        this.product_id = product_id;
        this.product_attribute_id = product_attribute_id;
        this.product_quantity_reinjected = product_quantity_reinjected;
        this.group_reduction = group_reduction;
        this.discount_quantity_applied = discount_quantity_applied;
        this.download_hash = download_hash;
        this.download_deadline = download_deadline;
        this.id_order_invoice = id_order_invoice;
        this.id_warehouse = id_warehouse;
        this.id_shop = id_shop;
        this.id_customization = id_customization;
        this.product_name = product_name;
        this.product_quantity = product_quantity;
        this.product_quantity_in_stock = product_quantity_in_stock;
        this.product_quantity_return = product_quantity_return;
        this.product_quantity_refunded = product_quantity_refunded;
        this.product_price = product_price;
        this.reduction_percent = reduction_percent;
        this.reduction_amount = reduction_amount;
        this.reduction_amount_tax_incl = reduction_amount_tax_incl;
        this.reduction_amount_tax_excl = reduction_amount_tax_excl;
        this.product_quantity_discount = product_quantity_discount;
        this.product_ean13 = product_ean13;
        this.product_isbn = product_isbn;
        this.product_upc = product_upc;
        this.product_reference = product_reference;
        this.product_supplier_reference = product_supplier_reference;
        this.product_weight = product_weight;
        this.tax_computation_method = tax_computation_method;
        this.id_tax_rules_group = id_tax_rules_group;
        this.ecotax = ecotax;
        this.ecotax_tax_rate = ecotax_tax_rate;
        this.download_nb = download_nb;
        this.unit_price_tax_incl = unit_price_tax_incl;
        this.unit_price_tax_excl = unit_price_tax_excl;
        this.total_price_tax_incl = total_price_tax_incl;
        this.total_price_tax_excl = total_price_tax_excl;
        this.total_shipping_price_tax_excl = total_shipping_price_tax_excl;
        this.total_shipping_price_tax_incl = total_shipping_price_tax_incl;
        this.purchase_supplier_price = purchase_supplier_price;
        this.original_product_price = original_product_price;
        this.original_wholesale_price = original_wholesale_price;
        this.associations = associations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getProduct_attribute_id() {
        return product_attribute_id;
    }

    public void setProduct_attribute_id(int product_attribute_id) {
        this.product_attribute_id = product_attribute_id;
    }

    public String getProduct_quantity_reinjected() {
        return product_quantity_reinjected;
    }

    public void setProduct_quantity_reinjected(String product_quantity_reinjected) {
        this.product_quantity_reinjected = product_quantity_reinjected;
    }

    public String getGroup_reduction() {
        return group_reduction;
    }

    public void setGroup_reduction(String group_reduction) {
        this.group_reduction = group_reduction;
    }

    public String getDiscount_quantity_applied() {
        return discount_quantity_applied;
    }

    public void setDiscount_quantity_applied(String discount_quantity_applied) {
        this.discount_quantity_applied = discount_quantity_applied;
    }

    public String getDownload_hash() {
        return download_hash;
    }

    public void setDownload_hash(String download_hash) {
        this.download_hash = download_hash;
    }

    public String getDownload_deadline() {
        return download_deadline;
    }

    public void setDownload_deadline(String download_deadline) {
        this.download_deadline = download_deadline;
    }

    public int getId_order_invoice() {
        return id_order_invoice;
    }

    public void setId_order_invoice(int id_order_invoice) {
        this.id_order_invoice = id_order_invoice;
    }

    public int getId_warehouse() {
        return id_warehouse;
    }

    public void setId_warehouse(int id_warehouse) {
        this.id_warehouse = id_warehouse;
    }

    public int getId_shop() {
        return id_shop;
    }

    public void setId_shop(int id_shop) {
        this.id_shop = id_shop;
    }

    public int getId_customization() {
        return id_customization;
    }

    public void setId_customization(int id_customization) {
        this.id_customization = id_customization;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(String product_quantity) {
        this.product_quantity = product_quantity;
    }

    public String getProduct_quantity_in_stock() {
        return product_quantity_in_stock;
    }

    public void setProduct_quantity_in_stock(String product_quantity_in_stock) {
        this.product_quantity_in_stock = product_quantity_in_stock;
    }

    public String getProduct_quantity_return() {
        return product_quantity_return;
    }

    public void setProduct_quantity_return(String product_quantity_return) {
        this.product_quantity_return = product_quantity_return;
    }

    public String getProduct_quantity_refunded() {
        return product_quantity_refunded;
    }

    public void setProduct_quantity_refunded(String product_quantity_refunded) {
        this.product_quantity_refunded = product_quantity_refunded;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getReduction_percent() {
        return reduction_percent;
    }

    public void setReduction_percent(String reduction_percent) {
        this.reduction_percent = reduction_percent;
    }

    public String getReduction_amount() {
        return reduction_amount;
    }

    public void setReduction_amount(String reduction_amount) {
        this.reduction_amount = reduction_amount;
    }

    public String getReduction_amount_tax_incl() {
        return reduction_amount_tax_incl;
    }

    public void setReduction_amount_tax_incl(String reduction_amount_tax_incl) {
        this.reduction_amount_tax_incl = reduction_amount_tax_incl;
    }

    public String getReduction_amount_tax_excl() {
        return reduction_amount_tax_excl;
    }

    public void setReduction_amount_tax_excl(String reduction_amount_tax_excl) {
        this.reduction_amount_tax_excl = reduction_amount_tax_excl;
    }

    public String getProduct_quantity_discount() {
        return product_quantity_discount;
    }

    public void setProduct_quantity_discount(String product_quantity_discount) {
        this.product_quantity_discount = product_quantity_discount;
    }

    public String getProduct_ean13() {
        return product_ean13;
    }

    public void setProduct_ean13(String product_ean13) {
        this.product_ean13 = product_ean13;
    }

    public String getProduct_isbn() {
        return product_isbn;
    }

    public void setProduct_isbn(String product_isbn) {
        this.product_isbn = product_isbn;
    }

    public String getProduct_upc() {
        return product_upc;
    }

    public void setProduct_upc(String product_upc) {
        this.product_upc = product_upc;
    }

    public String getProduct_reference() {
        return product_reference;
    }

    public void setProduct_reference(String product_reference) {
        this.product_reference = product_reference;
    }

    public String getProduct_supplier_reference() {
        return product_supplier_reference;
    }

    public void setProduct_supplier_reference(String product_supplier_reference) {
        this.product_supplier_reference = product_supplier_reference;
    }

    public String getProduct_weight() {
        return product_weight;
    }

    public void setProduct_weight(String product_weight) {
        this.product_weight = product_weight;
    }

    public String getTax_computation_method() {
        return tax_computation_method;
    }

    public void setTax_computation_method(String tax_computation_method) {
        this.tax_computation_method = tax_computation_method;
    }

    public String getId_tax_rules_group() {
        return id_tax_rules_group;
    }

    public void setId_tax_rules_group(String id_tax_rules_group) {
        this.id_tax_rules_group = id_tax_rules_group;
    }

    public String getEcotax() {
        return ecotax;
    }

    public void setEcotax(String ecotax) {
        this.ecotax = ecotax;
    }

    public String getEcotax_tax_rate() {
        return ecotax_tax_rate;
    }

    public void setEcotax_tax_rate(String ecotax_tax_rate) {
        this.ecotax_tax_rate = ecotax_tax_rate;
    }

    public String getDownload_nb() {
        return download_nb;
    }

    public void setDownload_nb(String download_nb) {
        this.download_nb = download_nb;
    }

    public String getUnit_price_tax_incl() {
        return unit_price_tax_incl;
    }

    public void setUnit_price_tax_incl(String unit_price_tax_incl) {
        this.unit_price_tax_incl = unit_price_tax_incl;
    }

    public String getUnit_price_tax_excl() {
        return unit_price_tax_excl;
    }

    public void setUnit_price_tax_excl(String unit_price_tax_excl) {
        this.unit_price_tax_excl = unit_price_tax_excl;
    }

    public String getTotal_price_tax_incl() {
        return total_price_tax_incl;
    }

    public void setTotal_price_tax_incl(String total_price_tax_incl) {
        this.total_price_tax_incl = total_price_tax_incl;
    }

    public String getTotal_price_tax_excl() {
        return total_price_tax_excl;
    }

    public void setTotal_price_tax_excl(String total_price_tax_excl) {
        this.total_price_tax_excl = total_price_tax_excl;
    }

    public String getTotal_shipping_price_tax_excl() {
        return total_shipping_price_tax_excl;
    }

    public void setTotal_shipping_price_tax_excl(String total_shipping_price_tax_excl) {
        this.total_shipping_price_tax_excl = total_shipping_price_tax_excl;
    }

    public String getTotal_shipping_price_tax_incl() {
        return total_shipping_price_tax_incl;
    }

    public void setTotal_shipping_price_tax_incl(String total_shipping_price_tax_incl) {
        this.total_shipping_price_tax_incl = total_shipping_price_tax_incl;
    }

    public String getPurchase_supplier_price() {
        return purchase_supplier_price;
    }

    public void setPurchase_supplier_price(String purchase_supplier_price) {
        this.purchase_supplier_price = purchase_supplier_price;
    }

    public String getOriginal_product_price() {
        return original_product_price;
    }

    public void setOriginal_product_price(String original_product_price) {
        this.original_product_price = original_product_price;
    }

    public String getOriginal_wholesale_price() {
        return original_wholesale_price;
    }

    public void setOriginal_wholesale_price(String original_wholesale_price) {
        this.original_wholesale_price = original_wholesale_price;
    }

    public String getAssociations() {
        return associations;
    }

    public void setAssociations(String associations) {
        this.associations = associations;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.id;
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
        final OrdersDetail other = (OrdersDetail) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrdersDetail{" + "id=" + id + ", id_order=" + id_order + ", product_id=" + product_id + ", product_attribute_id=" + product_attribute_id + ", product_quantity_reinjected=" + product_quantity_reinjected + ", group_reduction=" + group_reduction + ", discount_quantity_applied=" + discount_quantity_applied + ", download_hash=" + download_hash + ", download_deadline=" + download_deadline + ", id_order_invoice=" + id_order_invoice + ", id_warehouse=" + id_warehouse + ", id_shop=" + id_shop + ", id_customization=" + id_customization + ", product_name=" + product_name + ", product_quantity=" + product_quantity + ", product_quantity_in_stock=" + product_quantity_in_stock + ", product_quantity_return=" + product_quantity_return + ", product_quantity_refunded=" + product_quantity_refunded + ", product_price=" + product_price + ", reduction_percent=" + reduction_percent + ", reduction_amount=" + reduction_amount + ", reduction_amount_tax_incl=" + reduction_amount_tax_incl + ", reduction_amount_tax_excl=" + reduction_amount_tax_excl + ", product_quantity_discount=" + product_quantity_discount + ", product_ean13=" + product_ean13 + ", product_isbn=" + product_isbn + ", product_upc=" + product_upc + ", product_reference=" + product_reference + ", product_supplier_reference=" + product_supplier_reference + ", product_weight=" + product_weight + ", tax_computation_method=" + tax_computation_method + ", id_tax_rules_group=" + id_tax_rules_group + ", ecotax=" + ecotax + ", ecotax_tax_rate=" + ecotax_tax_rate + ", download_nb=" + download_nb + ", unit_price_tax_incl=" + unit_price_tax_incl + ", unit_price_tax_excl=" + unit_price_tax_excl + ", total_price_tax_incl=" + total_price_tax_incl + ", total_price_tax_excl=" + total_price_tax_excl + ", total_shipping_price_tax_excl=" + total_shipping_price_tax_excl + ", total_shipping_price_tax_incl=" + total_shipping_price_tax_incl + ", purchase_supplier_price=" + purchase_supplier_price + ", original_product_price=" + original_product_price + ", original_wholesale_price=" + original_wholesale_price + ", associations=" + associations + '}';
    }
    

    
}
