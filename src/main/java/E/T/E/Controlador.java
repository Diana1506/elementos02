
package E.T.E;



import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class Controlador {
    
    @Autowired RepositorioInter repoCliente;
    //Caso a) Buscar todos
    
    @GetMapping("/mensaje")
    public List<Cliente> buscarTodos(){
    return repoCliente.findAll();
    
    }
    
    //Caso b) buscar por ID
    @GetMapping("/cliente/{id}")
    public Cliente buscarPorId(@PathVariable String id){//String es el tipo de dato del ID
        Cliente mensa = new Cliente();
        
    return repoCliente.findById(id).get(); 
    }
    
    //caso C) Guardar
    @PostMapping("/cliente")
    public Estatus guardar(@RequestBody String json) throws Exception {
    
        //primero convertimos este String llamado json a un objeto java
        ObjectMapper maper = new ObjectMapper();
         Cliente mensa = maper.readValue(json, Cliente.class);
         
         repoCliente.save(mensa);
         
         System.out.println("Este Objeto se Convirtio: "+mensa);
         Estatus estatus = new Estatus();
         estatus.setSuccess(true);
         estatus.setMensaje("Mensaje guardado con exito!!");
         return estatus; 
    }
    
    
    //caso d) actualizar
    
    @PutMapping("/cliente")
    public Estatus actualizar(@RequestBody String json) throws Exception {
    
        //primero convertimos este String llamado json a un objeto java
        ObjectMapper maper = new ObjectMapper();
         Cliente mensa = maper.readValue(json, Cliente.class);
         
         repoCliente.save(mensa);
         
         System.out.println("Este Objeto se Convirtio: "+mensa);
         Estatus estatus = new Estatus();
         estatus.setSuccess(true);
         estatus.setMensaje("Mensaje guardado con exito!!");
         return estatus; 
    }
    
    @DeleteMapping("/cliente/{id}")
    public Estatus borrarPorId(@PathVariable String id){//String es el tipo de dato del ID
        Cliente mensa = new Cliente();
        
        repoCliente.deleteById(id);
        
        Estatus e = new Estatus();
        e.setSuccess(true);
        e.setMensaje("Mensaje borrado");
        return e;
        
  
    }
    
}