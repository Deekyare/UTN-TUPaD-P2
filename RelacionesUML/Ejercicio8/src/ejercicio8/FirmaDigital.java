
package ejercicio8;

/**
 *
 * @author Sil
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    // Referencia de agregación: FirmaDigital agrega a Usuario
    private Usuario usuario;
    
    //Constructor
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    //Getters y Setters

    public String getCodigoHash() {
        return codigoHash;
    }


    public String getFecha() {
        return fecha;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setCodigoHash(String codigoHash) {
        this.codigoHash = codigoHash;
    }

    
   
     @Override
    public String toString() {
        return "Firma Digital [CodigoHash = " + codigoHash + ", Fecha = " + fecha + "]";
    }
}
