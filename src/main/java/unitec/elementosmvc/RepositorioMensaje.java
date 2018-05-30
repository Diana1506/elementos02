
package unitec.elementosmvc;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioMensaje extends MongoRepository<Mensaje, String>{
    public Mensaje findByCuerpo(String cuerpo);
}
