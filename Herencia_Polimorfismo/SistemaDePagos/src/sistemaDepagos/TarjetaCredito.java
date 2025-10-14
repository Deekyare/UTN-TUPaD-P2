package sistemaDepagos;

/**
 *
 * @author Sil
 */

//Pagar con tarjeta de credito
public class TarjetaCredito implements Pagable {

    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void pagar() {
        System.out.println("Procesando pago con Tarjeta de Credito N°: " + numeroTarjeta);
    }
}
