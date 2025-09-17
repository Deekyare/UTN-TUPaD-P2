package ejercicio14_dependenciadecreacion;

/**
 *
 * @author Sil
 */
public class Proyecto {

    private String nombre;
    private String duracionMin;

    //Constructor
    public Proyecto(String nombre, String duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDuracionMin() {
        return duracionMin;
    }

    @Override
    public String toString() {
        return "Proyecto [nombre= " + nombre + " Duración: " + duracionMin + "]";
    }
}
