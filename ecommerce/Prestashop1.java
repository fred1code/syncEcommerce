

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author fredy
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "prestashop")
public class Prestashop1 {

    @XmlElement(name = "image")
    private EcommerceImagenXml image;

    public Prestashop1() {
    }

    public Prestashop1(EcommerceImagenXml image) {
        this.image = image;
    }

    public EcommerceImagenXml getImage() {
        return image;
    }

    public void setImage(EcommerceImagenXml image) {
        this.image = image;
    }


}
