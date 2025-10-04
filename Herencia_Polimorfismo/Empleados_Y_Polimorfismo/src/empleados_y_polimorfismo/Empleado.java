package empleados_y_polimorfismo;

/**
 *
 * @author Sil
 */
public abstract class Empleado {

    private String Nombre;

    //Constructor
    public Empleado(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    //Métodos
    public abstract double calcularSueldo();
}
