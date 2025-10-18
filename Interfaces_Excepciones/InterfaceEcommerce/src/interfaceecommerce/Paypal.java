package interfaceecommerce;

/**
 *
 * @author Sil
 */
public class Paypal implements Pago, PagoConDescuento {

    double descuento = 5.0;

    @Override
    public double aplicarDescuento(double monto) {
        double valorFinal = monto * (1 - descuento / 100);
        return valorFinal;
    }

    @Override
    public void procesarPago(double monto) {
        //Llama al metodo aplicarDescuento para calcular el valor final
        double valorFinal = aplicarDescuento(monto);

        System.out.println("Pago Procesado con Paypal, tiene un descuento de: " + this.descuento + "%");
        System.out.print("Monto con descuento incluido: " + valorFinal);
    }
}
