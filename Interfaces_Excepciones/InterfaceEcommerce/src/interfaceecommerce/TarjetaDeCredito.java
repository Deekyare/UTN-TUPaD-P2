package interfaceecommerce;

/**
 *
 * @author Sil
 */
public class TarjetaDeCredito implements Pago, PagoConDescuento {

    double descuento = 10.0;

    @Override
    public double aplicarDescuento(double monto) {
        double valorFinal = monto * (1 - descuento / 100);
        return valorFinal;
    }

    @Override
    public void procesarPago(double monto) {
        // Llama al metodo anterior para calcular el valor final
        double valorFinal = aplicarDescuento(monto);

        System.out.println("Pago Procesado con Tarjeta de Credito, tiene un descuento de: " + this.descuento + "%");
        System.out.print("Monto con Tarjeta de Credito es: " + valorFinal);
    }
}
