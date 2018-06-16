
package unitec.elementosmvc;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ControladorMensaje {
    
    @Autowired RepositorioMensaje repoMensa;
    //Caso a) Buscar todos
    
    @GetMapping("/mensaje")
    public List<Mensaje> buscarTodos(){
    return repoMensa.findAll();
    
    }
    
    //Caso b) buscar por ID
    @GetMapping("/mensaje/{id}")
    public Mensaje buscarPorId(@PathVariable String id){//String es el tipo de dato del ID
        Mensaje mensa = new Mensaje();
        
    return repoMensa.findById(id).get(); 
    }
}
