package figurasgeometricas;
/**
 *
 * @author Sil
 */
public abstract class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    //Método
    public abstract double calcularArea();
}
