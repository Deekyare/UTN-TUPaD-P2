package ejercicio6;

/**
 *
 * @author Sil
 */
public class Mesa {

    private int numero;
    private int capacidad;

    //Constructor
    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    //Setters y Getters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mesa [numero = " + numero + ", capacidad = " + capacidad + "]";
    }
}
