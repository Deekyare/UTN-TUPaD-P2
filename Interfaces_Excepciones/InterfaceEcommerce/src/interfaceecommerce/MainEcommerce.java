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
        Pedido pedido1 = new Pedido(Estados.PROCESANDO, cliente1);
        
        // Añadir productos al pedido
        pedido1.agregarProducto(producto1);
        pedido1.agregarProducto(producto2);
        
        // Mostrar información de la compra
        System.out.println("\n -- INFORMACIÓN DE COMPRA --\n");
        System.out.printf("El total de la compra realizada es de: ", pedido1.calcularTotal());
        
        // Cambiar estados del pedido
        pedido1.cambiarEstado(Estados.ENVIADO);
        
        // Procesar pago con Paypal (con descuento)
        Paypal pagoPaypal = new Paypal();
        pagoPaypal.procesarPago(pedido1.calcularTotal());
        System.out.printf("Monto con descuento inluido: "+ pagoPaypal.aplicarDescuento(pedido1.calcularTotal())+"\n");
        
        System.out.println("\n -- Actualización -- \n");
        
        pedido1.cambiarEstado(Estados.ENTREGADO);
        
        
    }
}