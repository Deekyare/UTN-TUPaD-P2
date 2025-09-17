package ejercicio3;

/**
 *
 * @author Sil
 */
public class Editorial {

    private String nombre;
    private String direccion;

    //Constructor
    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    // Método toString
    @Override
    public String toString() {
        return "Editorial [Nombre=" + nombre + ", Dirección=" + direccion + "]";
    }

}
