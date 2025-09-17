package ejercicio13;

/**
 *
 * @author Sil
 */
public class Usuario {

    private String nombre;
    private String email;

    //Constructor
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Usuario [nombre= " + nombre + ", email= " + email + "]";
    }

}
