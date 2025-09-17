
package ejercicio7;

/**
 *
 * @author Sil
 */
public class Motor {
    private String tipo;
    private String numeroSerie;
    
    //Constructor

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }
    //Setters y Getters

    public String getTipo() {
        return tipo;
    }

  
    public String getNumeroSerie() {
        return numeroSerie;
    }


    @Override
    public String toString() {
        return "Motor [tipo= " + tipo + ", Número de Serie= " + numeroSerie + "]";
    }
}
