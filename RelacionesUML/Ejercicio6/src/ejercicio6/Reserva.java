package ejercicio6;

/**
 *
 * @author Sil
 */
public class Reserva {

    private String fecha;
    private String hora;
    //Referencia Cliente - asociación bidireccional
    private Cliente cliente;
    //Referencia Mesa - agregacion
    private Mesa mesa;

    //Constructor
    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
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

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Reserva [Fecha = " + fecha + ", hora = " + hora + "]";

    }

}
