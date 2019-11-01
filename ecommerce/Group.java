
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Group {

    @XmlElement(name = "group")
    private List<GroupData> group;

    public Group() {
    }

    public Group(List<GroupData> group) {
        this.group = group;
    }

    public List<GroupData> getGroup() {
        return group;
    }

    public void setGroup(List<GroupData> group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Group{" + "group=" + group + '}';
    }

}
