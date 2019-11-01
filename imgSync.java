import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.xml.bind.JAXBException;

import ecommerce.EcommerceWsContro;
import ecommerce.IdsJs;
import ecommerce.PSWebServiceWrapper;

import static getEntityManagerFactory;


/**
 * @author fredy
 * * <h1>ecommerce img sync<h1>
 */
public class EcommerceImgSync {

    private String ecommerceID;
    String url;
    String keys;
    boolean res = false;
    private PSWebServiceWrapper psws;
    private EcommerceWsContro ecommers;
    private artContro artContro = new artContro();
    private ImagenContro imagenContro = new ImagenContro();

    public EcommerceImgSync(String url, String keys) {
        this.url = url;
        this.keys = keys;
        this.psws = new PSWebServiceWrapper(url, keys, false);
        this.ecommers = new EcommerceWsContro(url, keys);

    }

    public void primeraSincro(artContro artContro, Contro ) {
        EntityManager em = .getEntityManager();
        try {
            .setEntityManagerFactory(getEntityManagerFactory());
            artContro.findAll().stream().filter(a -> a.getTipo() == 0 || a.getTipo() == 2).forEach(a -> {
                Id Id = .getId("art", a.getArtId());
                if (Id != null) {
                    Long nubId = Id.getNubId();
                    Optional<String> respuesta = ecommers.getEcommerceId(nubId.intValue());
                    respuesta.ifPresent(respu -> {
                        String id = respu;
                        for (artImagen im : a.getartImagenList()) {
                            if (im.getImagen().getImagen() != null) {
                                Optional<String> existe = ecommers.getImgIfExist(im.getImagen().getImgId().intValue(), nubId.intValue());
                                existe.ifPresent(h -> {
                                    int h2 = Integer.parseInt(h.trim());
                                    if (h2 != 1) {
                                       // System.out.println("la imagen no existe en el ecommerce");
                                        try {
                                            int idImg = psws.addImg(im.getImagen().getImagen(), id.trim());
                                            Optional<String> info = ecommers.setInfoImg(nubId, im.getImagen().getImgId(), idImg, Integer.parseInt(id.trim()));
                                        } catch (JAXBException ex) {
                                            System.out.println(ex);
                                        }
                                    } else {
                                 //     System.out.println("La imagen ya fue sincronisada ");
                                    }
                                });
                                System.out.println("Imagen Sync");
                            }
                        }
                    });
                }
            });
            ConfiguracionContro.save("ecommerce", "sincro", "1");
        } catch (Exception e) {
            System.out.println("img faill " + e);
        }
    }

    public void checkImgs(Contro ) {
        EntityManager em = .getEntityManager();
        List<String> listaEcommerce = new ArrayList<>();
        List<String> listaLocal;
        List<String> listaControl = new ArrayList<>();
        try {
            Optional<String> respuesta = ecommers.getFullListImg();
            respuesta.ifPresent(r -> {
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                IdsJs[] id = gson.fromJson(r, IdsJs[].class);
                for (IdsJs idsJs : id) {
                    listaEcommerce.add(idsJs.getId());
                }
            });
            String sql = "SELECT img_id "
                    + "FROM artImagen "
                    + "WHERE art_id "
                    + "NOT IN (SELECT art_id FROM art WHERE tipo = 50) "
                    + "ORDER BY img_id;";
            Query q = em.createNativeQuery(sql);
            listaLocal = q.getResultList();
            listaLocal.removeAll(listaEcommerce);
            for (int i = 0; i < listaLocal.size(); i++) {
                boolean bo = listaEcommerce.remove(String.valueOf(listaLocal.get(i)));
                if (bo == false) {
                    listaControl.add(String.valueOf(listaLocal.get(i)));
                }
            }
            listaControl.forEach(lis -> {
                String consulta = "SELECT imagen "
                        + "FROM imagen "
                        + "WHERE img_id = ?1 LIMIT 1";
                Query ts = em.createNativeQuery(consulta);
                ts.setParameter(1, lis);
                byte[] by = (byte[]) ts.getSingleResult();
                String sa = "SELECT art_id "
                        + "FROM artImagen "
                        + "WHERE img_id = ?1 "
                        + "LIMIT 1;";
                Query im = em.createNativeQuery(sa);
                im.setParameter(1, lis);
                Object os = im.getSingleResult();
               // System.out.println(os);
                Id Id = .getId("art", Integer.parseInt(String.valueOf(os)));
                Long nubId = Id.getNubId();
                int id = nubId.intValue();
                Optional<String> idRes = ecommers.getEcommerceId(id);
                idRes.ifPresent(gh -> {
                    ecommerceID = gh.trim();
                //    System.out.println("id respuesta  = " + ecommerceID);
                });
                try {
                    int idImg = psws.addImg(by, ecommerceID);
                    Long id_product_ = Long.parseLong(String.valueOf(id));
                    Long id_img_ = Long.parseLong(String.valueOf(lis));
                    Optional<String> info = ecommers.setInfoImg(id_product_, id_img_, idImg, Integer.parseInt(ecommerceID));
                } catch (JAXBException ex) {
                    Logger.getLogger(EcommerceImgSync.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteImgEcommerce(int art_id, Contro ) {
        EntityManager em = .getEntityManager();
        List<String> listaEcommerce = new ArrayList<>();
        List<String> listaLocal;
        try {
            Id Id = .getId("art", art_id);
            Long nubId = Id.getNubId();
            int id = nubId.intValue();
            Optional<String> respuesta = ecommers.getListImgIds(id);
            respuesta.ifPresent(f -> {
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                IdsJs[] id = gson.fromJson(f, IdsJs[].class);
                for (int i = 0; i < id.length; i++) {
                    listaEcommerce.add(String.valueOf(id[i].getId()));
                }
            });
            String sql = "SELECT img_id "
                    + "FROM artImagen "
                    + "WHERE art_id = ?1;";
            Query q = em.createNativeQuery(sql);
            q.setParameter(1, art_id);
            listaLocal = q.getResultList();
            for (int i = 0; i < listaLocal.size(); i++) {
                listaEcommerce.remove(String.valueOf(listaLocal.get(i)));
            }
            listaEcommerce.forEach(y -> {
                ecommers.setDisableImg(Integer.parseInt(y));
            });
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setImgNew(int art_id, Contro ) {
        EntityManager em = .getEntityManager();
        try {
            String sql = "SELECT img_id "
                    + "FROM artImagen "
                    + "WHERE art_id=?1;";
            Query q = em.createNativeQuery(sql);
            q.setParameter(1, art_id);
            List lista = q.getResultList();
            lista.forEach(a -> {
                int imgid = Integer.parseInt(a.toString().trim());
                Id Id = .getId("art", art_id);
                Long nubId = Id.getNubId();
                int id = nubId.intValue();
                Optional<String> respuesta = ecommers.getImgIfExist(imgid, id);
                respuesta.ifPresent(respu -> {
                    int exist = Integer.parseInt(respu.trim());
                    if (exist != 1) {
                        //System.out.println("AGREGADO IMAGEN");
                        try {
                            String consulta = "SELECT imagen "
                                    + "FROM imagen "
                                    + "WHERE img_id = ?1 LIMIT 1";
                            Query ts = em.createNativeQuery(consulta);
                            ts.setParameter(1, a);
                            byte[] by = (byte[]) ts.getSingleResult();

                            Optional<String> idRes = ecommers.getEcommerceId(id);
                            idRes.ifPresent(gh -> {
                                ecommerceID = gh.trim();
                                System.out.println("id respuesta  = " + ecommerceID);
                            });
                            int idImg = psws.addImg(by, ecommerceID);
                            Long id_product_ = Long.parseLong(String.valueOf(id));
                            Long id_img_ = Long.parseLong(String.valueOf(a));
                            Optional<String> info = ecommers.setInfoImg(id_product_, id_img_, idImg, Integer.parseInt(ecommerceID));
                        } catch (NumberFormatException | JAXBException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                     //   System.out.println("LA IMAGEN SI EXISTE EN ECOMMERCE");
                    }
                });
            });

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean ecommerceIfSync() {
        Optional<String> respuesta = ecommers.getIfEcommerceSync();
        respuesta.ifPresent(t -> {
            res = Boolean.parseBoolean(t.trim());
            if ("1".equals(t.trim())) {
                res = true;
            }
        });
        return res;
    }
}
