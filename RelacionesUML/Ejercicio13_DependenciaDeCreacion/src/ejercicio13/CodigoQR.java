package ejercicio13;

/**
 *
 * @author Sil
 */
public class CodigoQR {

    private String valor;
    // Asociación unidireccional: el CodigoQR conoce a su Usuario
    private Usuario usuario;

    //Constructor
    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CódigoQR [valor= " + valor + "]";
    }
}
