package interfaceecommerce;

/**
 *
 * @author Sil
 */
public class TarjetaDeCredito implements Pago {
    
   // double descuento = 0; 
    
    //public double aplicarDescuento(double monto){
   //     double valorFinal = monto*(1-descuento/100);
    //    return valorFinal ;
    //};

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago realizado con: Tarjeta de Credito");
    }
}
