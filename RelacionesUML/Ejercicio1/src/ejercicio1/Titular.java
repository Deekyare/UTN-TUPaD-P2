package ejercicio1;

public class Titular {

    private String nombre;
    private String dni;

    // Atributo para la relacion de asociacion
    private Pasaporte pasaporte;

    //constructor
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    // Método para establecer la relación con el pasaporte

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        //Validacion antibucle
         if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", dni=" + dni + "]";
    }
}
