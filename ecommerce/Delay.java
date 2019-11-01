
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class Delay {

    @XmlElement(name = "language")
    private List<String> language;

    public Delay() {
    }

    public Delay(List<String> language) {
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
        return "Delay{" + "language=" + language + '}';
    }



}
