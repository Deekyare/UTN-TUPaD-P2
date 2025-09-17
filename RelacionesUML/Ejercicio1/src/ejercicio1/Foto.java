package ejercicio1;

/**
 *
 * @author Sil
 */
public class Foto {

    private String imagen;
    private String formato;

    //Constructor
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    //Getters y Setters
    public String getImagen() {
        return imagen;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public String toString() {
        return "Foto [imagen=" + imagen + ", formato=" + formato + "]";
    }
}
