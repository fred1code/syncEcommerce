
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeCount {

    @XmlElement(name = "employee")
    private List<EmployeeCountDetail> id;

    public EmployeeCount() {
    }

    public List<EmployeeCountDetail> getId() {
        return id;
    }

    public void setId(List<EmployeeCountDetail> id) {
        this.id = id;
    }

}
