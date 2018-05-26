
package unitec.elementosmvc;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;

public class Mensaje {

    public Mensaje(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    
    @Id
    private String id;
    private String cuerpo;
    private LocalDate fecha;

    public Mensaje(String cuerpo, LocalDate fecha) {
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }

    public Mensaje() {
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
}
