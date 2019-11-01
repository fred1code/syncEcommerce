
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 * <h1>name class</h1>
 * <p>
 * this class used for cast xml to object
 * </p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Name {

    @XmlElement(name = "language")
    private List<String> language;

    public Name() {
    }

    public Name(List<String> language) {
        this.language = language;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Name{" + "language=" + language + '}';
    }

}
