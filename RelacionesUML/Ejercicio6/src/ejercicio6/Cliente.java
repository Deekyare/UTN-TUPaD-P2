package ejercicio6;

/**
 *
 * @author Sil
 */
public class Cliente {

    private String nombre;
    private int telefono;
    //Referencia de asociación unidireccional: Cliente → Reserva (Cliente es contenedor)
    private Reserva reserva;

    //Constructor
    public Cliente(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        return "Cliente [Nombre = " + nombre + ", Teléfono = " + telefono + "]";
    }
}
