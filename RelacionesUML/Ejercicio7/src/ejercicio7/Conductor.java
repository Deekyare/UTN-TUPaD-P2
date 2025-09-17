
package ejercicio7;

/**
 *
 * @author Sil
 */
public class Conductor {
    private String nombre;
    private boolean licencia;
    //Referencia a Vehículo - asociación bidireccional
    private Vehiculo vehiculo;
    
    //Constructor
    public Conductor(String nombre, boolean licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    //Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public boolean getLicencia() {
        return licencia;
    }

   
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        //Validacion antibucle
         if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }
    @Override
    public String toString() {
        return "Conductor [nombre = " + nombre + ", licencia = " + licencia + "]";
    }
}
