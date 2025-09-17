package ejercicio10;

/**
 *
 * @author Sil
 */
public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificación;
            
    //Constructor

    public ClaveSeguridad(String codigo, String ultimaModificación) {
        this.codigo = codigo;
        this.ultimaModificación = ultimaModificación;
    }
    //Setters y Getters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUltimaModificación() {
        return ultimaModificación;
    }

    public void setUltimaModificación(String ultimaModificación) {
        this.ultimaModificación = ultimaModificación;
    }
     @Override
    public String toString() {
        return "Clave de Seguridad [Codigo= " + codigo + ", Ultima Modificación= " + ultimaModificación + "]";
    }
}
