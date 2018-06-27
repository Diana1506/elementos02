
package E.T.E;


public class Tarjeta {
     private String numero;
     private Float saldo;
     private String nombre;

    public Tarjeta(String numero, Float saldo, String nombre) {
        this.numero = numero;
        this.saldo = saldo;
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
