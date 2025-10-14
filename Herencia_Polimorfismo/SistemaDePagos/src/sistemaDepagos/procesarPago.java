package sistemaDepagos;

/**
 *
 * @author Sil
 */
public class procesarPago {

    public static void procesarPago(Pagable medioDePago) {
        System.out.println("Iniciando proceso de pago...");
        medioDePago.pagar(); // Llama al método pagar() del objeto específico que se le pasó
        System.out.println("¡Pago completado con éxito!\n");
    }
}
