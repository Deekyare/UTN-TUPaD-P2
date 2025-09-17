package ejercicio5;

/**
 *
 * @author Sil
 */
public class Computadora {

    private String marca;
    private String numeroSerie;
    //Relacion bidireccional con propietario
    private Propietario propietario;
    //La PlacaMadre se crea dentro del constructor de la Computadora. PlacaMadre se crea dentro del constructor de computadora
    private PlacaMadre placaMadre;

    //Constructor
    public Computadora(String marca, String numeroSerie) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre("Modelo-1234", "Chipset-ABC");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        //Validacion antibucle
         if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
        
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    @Override
    public String toString() {
        return "Computadora [Marca=" + marca + ", Numero de Serie=" + numeroSerie + "]";
    }
}
