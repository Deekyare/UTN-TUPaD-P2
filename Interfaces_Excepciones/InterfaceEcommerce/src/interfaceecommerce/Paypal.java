package interfaceecommerce;

/**
 *
 * @author Sil
 */
public class Paypal implements Pago, PagoConDescuento {

    double descuento = 5.0;
    
    @Override
    public void procesarPago(double monto){
        System.out.println("Pago Procesado con Paypal, tiene un descuento de: " + this.descuento);
    };
    
    @Override
    public double aplicarDescuento(double monto){
        double valorFinal = monto*(1-descuento/100);
        return valorFinal ;
    };
}
