package sistemaDepagos;

import static sistemaDepagos.procesarPago.procesarPago;

public class Main {
    
public static void main(String[] args) {
        // Creamos distintas formas de pago
        Pagable miTarjeta = new TarjetaCredito("1234-5678-9012-3456");
        Pagable miTransferencia = new Transferencia("0123456789012345678901");
        Pagable pagoEnEfectivo = new Efectivo();

        // Procesamos todos los pagos con la misma función
        procesarPago(miTarjeta);
        procesarPago(miTransferencia);
        procesarPago(pagoEnEfectivo);
    }
}
