package ejercicio2;

/**
 *
 * @author Sil
 */
public class Usuario {

    private String nombre;
    private String dni;

    //Referencia a clase celular - asociacion bidirecional
    private Celular celular;

    //Constructor
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    //Getters y Setters
    public String getDni() {
        return dni;
    }

    public Celular getCelular() {
        return celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        //Validacion antibucle
         if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", dni=" + dni + "]";
    }

}
