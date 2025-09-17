package ejercicio5;

/**
 *
 * @author Sil
 */
public class Propietario {

    private String nombre;
    private String dni;
    //Referencia bidereccionar a computadora
    private Computadora computadora;

    //Constructor
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

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

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        //Validacion antibucle
         if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }

    @Override
    public String toString() {
        return "Propietario [Nombre = " + nombre + ", DNI = " + dni + "]";
    }
}
