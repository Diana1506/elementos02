package unitec.elementosmvc;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosMvcApplication implements CommandLineRunner {

    //Para inyectar dependencias
    @Autowired
    ServicioTarjeta servicio;
    @Autowired
    RepositorioMensaje repomensa; 

    public static void main(String[] args) {
        SpringApplication.run(ElementosMvcApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        // servicio.obtenerSaldo().obtenerSaldo();
      //  LocalDate fecha = LocalDate.now();
      //  repomensa.save(new Mensaje("hola","Cedito",fecha));

        //Buscar todos los mensajes ya
        /* for (Mensaje mensa: repomensa.findAll())
         {
             System.out.println(mensa);
         
         }*/
        
        //repomensa.findById("1 aqui va un id").get();
     // buscar por iD   System.out.println(repomensa.findById("1 aqui va un id").get());
     
     
     //System.out.println(repomensa.findByICuerpo("lo que se quiere buscar en el cuerpo"));
     
     
     //actualizar
     
    /* for (Mensaje mensa: repomensa.findAll())
         {
             System.out.println(mensa);
         
         }*/
    
     //borrar por cuerpo
     /*Mensaje m = new Mensaje();
     m.setId("hola");
     repomensa.delete(m);
     */
    }
}
