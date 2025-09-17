package ejercicio2;

/**
 *
 * @author Sil
 */
public class Celular {

    private int imei;
    private String marca;
    private String modelo;

    //Referencia a clase usuario - asociacion bidirecional
    private Usuario usuario;
    //Referencia a clase Bateria - agregación
    private Bateria bateria;

    //constructor
    public Celular(int imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }
    //Getters y Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        //Validacion antibucle
         if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public String getModelo() {
        return modelo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Bateria getBateria() {
        return bateria;
    }

    @Override
    public String toString() {
        return "Celular [celular imei=" + imei + ", marca=" + marca + "modelo= " + modelo + "]";
    }
}
