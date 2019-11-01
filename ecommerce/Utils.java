
import java.io.ByteArrayInputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author fredy
 */
public class Utils {
    
    public  static Object unmarshall(Class clazz, String xml) throws JAXBException{
        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return unmarshaller.unmarshal(new ByteArrayInputStream(xml.getBytes()));
    }
    
}
