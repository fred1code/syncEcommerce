
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author fredy
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class EcommerceImagenXml {

    @XmlElement(name = "id")
    private int id;
    @XmlElement(name = "id_product")
    private int id_product;
    @XmlElement(name = "position")
    private int position;
    @XmlElement(name = "cover")
    private String cover;
    @XmlElement(name = "legend")
    private String legend;

    public EcommerceImagenXml() {
    }

    public EcommerceImagenXml(int id, int id_product, int position, String cover, String legend) {
        this.id = id;
        this.id_product = id_product;
        this.position = position;
        this.cover = cover;
        this.legend = legend;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getLegend() {
        return legend;
    }

    public void setLegend(String legend) {
        this.legend = legend;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.id;
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
        final EcommerceImagenXml other = (EcommerceImagenXml) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EcommerceImagenXml{" + "id=" + id + ", id_product=" + id_product + ", position=" + position + ", cover=" + cover + ", legend=" + legend + '}';
    }

}
