package ejercicio6;

/**
 *
 * @author Sil
 */
public class Reserva {

    private String fecha;
    private String hora;

    //Constructor
    public Reserva(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Reserva [Fecha = " + fecha + ", hora = " + hora + "]";

    }

}
