package ejercicio9;

/**
 *
 * @author Sil
 */
public class Paciente {
    private String nombre;
    private String obraSocial;
    
    //Constructor

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
    //Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

      @Override
    public String toString() {
        return "Paciente [Nombre= " + nombre + ", Obra social= " + obraSocial + "]";
    }
    
}
