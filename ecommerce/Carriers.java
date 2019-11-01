import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Carriers {

    @XmlElement(name = "id")
    private int id;

    @XmlElement(name = "deleted")
    private String deleted;

    @XmlElement(name = "is_module")
    private String is_module;

    @XmlElement(name = "id_tax_rules_group")
    private String id_tax_rules_group;

    @XmlElement(name = "id_reference")
    private int id_reference;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "active")
    private String active;

    @XmlElement(name = "is_free")
    private String is_free;

    @XmlElement(name = "url")
    private String url;

    @XmlElement(name = "shipping_handling")
    private String shipping_handling;

    @XmlElement(name = "shipping_external")
    private String shipping_external;

    @XmlElement(name = "range_behavior")
    private String range_behavior;

    @XmlElement(name = "shipping_method")
    private String shipping_method;

    @XmlElement(name = "max_width")
    private String max_width;

    @XmlElement(name = "max_height")
    private String max_height;

    @XmlElement(name = "max_depth")
    private String max_depth;

    @XmlElement(name = "max_weight")
    private String max_weight;

    @XmlElement(name = "grade")
    private String grade;

    @XmlElement(name = "external_module_name")
    private String external_module_name;

    @XmlElement(name = "need_range")
    private String need_range;

    @XmlElement(name = "position")
    private String position;

    @XmlElement(name = "delay")
    private Delay delay;

    public Carriers() {
    }

    public Carriers(int id, String deleted, String is_module, String id_tax_rules_group, int id_reference, String name, String active, String is_free, String url, String shipping_handling, String shipping_external, String range_behavior, String shipping_method, String max_width, String max_height, String max_depth, String max_weight, String grade, String external_module_name, String need_range, String position, Delay delay) {
        this.id = id;
        this.deleted = deleted;
        this.is_module = is_module;
        this.id_tax_rules_group = id_tax_rules_group;
        this.id_reference = id_reference;
        this.name = name;
        this.active = active;
        this.is_free = is_free;
        this.url = url;
        this.shipping_handling = shipping_handling;
        this.shipping_external = shipping_external;
        this.range_behavior = range_behavior;
        this.shipping_method = shipping_method;
        this.max_width = max_width;
        this.max_height = max_height;
        this.max_depth = max_depth;
        this.max_weight = max_weight;
        this.grade = grade;
        this.external_module_name = external_module_name;
        this.need_range = need_range;
        this.position = position;
        this.delay = delay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getIs_module() {
        return is_module;
    }

    public void setIs_module(String is_module) {
        this.is_module = is_module;
    }

    public String getId_tax_rules_group() {
        return id_tax_rules_group;
    }

    public void setId_tax_rules_group(String id_tax_rules_group) {
        this.id_tax_rules_group = id_tax_rules_group;
    }

    public int getId_reference() {
        return id_reference;
    }

    public void setId_reference(int id_reference) {
        this.id_reference = id_reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getIs_free() {
        return is_free;
    }

    public void setIs_free(String is_free) {
        this.is_free = is_free;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShipping_handling() {
        return shipping_handling;
    }

    public void setShipping_handling(String shipping_handling) {
        this.shipping_handling = shipping_handling;
    }

    public String getShipping_external() {
        return shipping_external;
    }

    public void setShipping_external(String shipping_external) {
        this.shipping_external = shipping_external;
    }

    public String getRange_behavior() {
        return range_behavior;
    }

    public void setRange_behavior(String range_behavior) {
        this.range_behavior = range_behavior;
    }

    public String getShipping_method() {
        return shipping_method;
    }

    public void setShipping_method(String shipping_method) {
        this.shipping_method = shipping_method;
    }

    public String getMax_width() {
        return max_width;
    }

    public void setMax_width(String max_width) {
        this.max_width = max_width;
    }

    public String getMax_height() {
        return max_height;
    }

    public void setMax_height(String max_height) {
        this.max_height = max_height;
    }

    public String getMax_depth() {
        return max_depth;
    }

    public void setMax_depth(String max_depth) {
        this.max_depth = max_depth;
    }

    public String getMax_weight() {
        return max_weight;
    }

    public void setMax_weight(String max_weight) {
        this.max_weight = max_weight;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getExternal_module_name() {
        return external_module_name;
    }

    public void setExternal_module_name(String external_module_name) {
        this.external_module_name = external_module_name;
    }

    public String getNeed_range() {
        return need_range;
    }

    public void setNeed_range(String need_range) {
        this.need_range = need_range;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Delay getDelay() {
        return delay;
    }

    public void setDelay(Delay delay) {
        this.delay = delay;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
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
        final Carriers other = (Carriers) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carriers{" + "id=" + id + ", deleted=" + deleted + ", is_module=" + is_module + ", id_tax_rules_group=" + id_tax_rules_group + ", id_reference=" + id_reference + ", name=" + name + ", active=" + active + ", is_free=" + is_free + ", url=" + url + ", shipping_handling=" + shipping_handling + ", shipping_external=" + shipping_external + ", range_behavior=" + range_behavior + ", shipping_method=" + shipping_method + ", max_width=" + max_width + ", max_height=" + max_height + ", max_depth=" + max_depth + ", max_weight=" + max_weight + ", grade=" + grade + ", external_module_name=" + external_module_name + ", need_range=" + need_range + ", position=" + position + ", delay=" + delay + '}';
    }

}
