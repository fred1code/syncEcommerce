
import java.util.Objects;

/**
 *
 * @author fredy
 */
public class Service {

    protected String dominio;
    protected String webkey;
    protected boolean debug;

    public Service(String dominio, String webkey, boolean debug) {
        this.dominio = dominio;
        this.webkey = webkey;
        this.debug = debug;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getWebkey() {
        return webkey;
    }

    public void setWebkey(String webkey) {
        this.webkey = webkey;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.dominio);
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
        final Service other = (Service) obj;
        if (!Objects.equals(this.dominio, other.dominio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Service{" + "dominio=" + dominio + ", webkey=" + webkey + ", debug=" + debug + '}';
    }

}
