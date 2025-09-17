
package ejercicio9;

/**
 *
 * @author Sil
 */
public class Profesional {
    private String nombre;
    private String especialidad;
    
    //Constructor
    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    //Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesional [Nombre= " + nombre + ", Especialidad= " + especialidad + "]";
    }
}
