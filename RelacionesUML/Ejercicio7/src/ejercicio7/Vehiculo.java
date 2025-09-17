
package ejercicio7;

/**
 *
 * @author Sil
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    //Referencia a Conductor - asociación bidireccional
    private Conductor conductor;
    //Referencia a clase motor
    private Motor motor;
    
    //Constructores
    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }
    //Setters y Getters

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        //Validacion antibucle
         if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
 @Override
    public String toString() {
        return "Vehículo [Patente = " + patente + ", Modelo = " + modelo + "]";
    }
    
    
}
