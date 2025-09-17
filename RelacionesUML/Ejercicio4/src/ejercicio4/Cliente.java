package ejercicio4;

/**
 *
 * @author Sil
 */
public class Cliente {

    private String nombre;
    private String dni;
    //Relación bidireccional con tarjeta
    private TarjetaDeCredito tarjetaDeCredito;

    //Constructor
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    //Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        //Validacion antibucle
         if (tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this) {
            tarjetaDeCredito.setCliente(this);
        }
    }
    

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", dni=" + dni + "]";
    }

}
