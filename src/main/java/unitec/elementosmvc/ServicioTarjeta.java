
package unitec.elementosmvc;

import org.springframework.context.annotation.Configuration;

//el configuration dhace la inyeccion de dependencias
@Configuration
public class ServicioTarjeta {
    Tarjeta obtenerSaldo()
    {
        return new Credito();
    }
}
