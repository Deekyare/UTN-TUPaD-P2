package ejercicio2;

/**
 *
 * @author Sil
 */
public class Bateria {

    private String capacidad;
    private String modelo;

    //Constructor
    public Bateria(String capacidad, String modelo) {
        this.capacidad = capacidad;
        this.modelo = modelo;
    }
    //Getters y Setters
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Bateria [capacidad=" + capacidad + ", modelo=" + modelo + "]";
    }
}
