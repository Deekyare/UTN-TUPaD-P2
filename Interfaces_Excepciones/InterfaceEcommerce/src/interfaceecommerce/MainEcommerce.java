package interfaceecommerce;

/**
 *
 * @author Sil
 */
public class MainEcommerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente1 = new Cliente("Harry", "Potter", "123654");
        
        // Crear productos
        Producto producto1 = new Producto("Ventilador", 500.0);
        Producto producto2 = new Producto("Lavarropas", 800.0);
        
        // Crear pedido
        Pedido pedido1 = new Pedido(cliente1, Estados.PROCESANDO);
        
        // Añadir productos al pedido
        pedido1.agregarProducto(producto1);
        pedido1.agregarProducto(producto2);
        
        // Mostrar información de la compra
        System.out.println("\n -- INFORMACIÓN DE COMPRA --\n");
        System.out.println(cliente1);
        System.out.print("El total de la compra realizada es de: "+pedido1.calcularTotal() +"\n");
        
        // Cambiar estados del pedido
        pedido1.cambiarEstado(Estados.PROCESANDO);
        
       // --- Procesar pago con Paypal ---
        System.out.println("\n -- INFORMACIÓN DE COMPRA CON PAYPAL --\n");
        Paypal pagoPaypal = new Paypal();
        pagoPaypal.procesarPago(pedido1.calcularTotal()); 
        
        
        System.out.println("\n\n-- Actualización --");
        pedido1.cambiarEstado(Estados.ENVIADO);
        
        // --- Procesar pago con Tarjeta  ---
        System.out.println("\n -- INFORMACIÓN DE COMPRA CON TARJETA DE CREDITO --\n");
        TarjetaDeCredito pagoTcredito = new TarjetaDeCredito();

        pagoTcredito.procesarPago(pedido1.calcularTotal());
        
        
        System.out.println("\n\n -- Actualización -- ");
        pedido1.cambiarEstado(Estados.ENTREGADO);
    }
}