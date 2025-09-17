package ejercicio12;

/**
 *
 * @author Sil
 */
public class Contribuyente {

    private String nombre;
    private String cuil;

    //Constructor
    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuil() {
        return cuil;
    }

}
