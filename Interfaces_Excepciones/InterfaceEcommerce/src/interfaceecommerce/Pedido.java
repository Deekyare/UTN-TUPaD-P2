package interfaceecommerce;

import java.util.ArrayList;

/**
 *
 * @author Sil
 */
public class Pedido implements Pagable {

    private Estados estado;
    private Cliente cliente;
    ArrayList<Producto> listaProductos;

    public Pedido(Estados estado, Cliente cliente) {
        this.estado = estado;
        this.cliente = cliente;
        this.listaProductos = new ArrayList<>();
    }

    public Estados getEstado() {
        return estado;
    }

    //Metodo agregar producto
    public void agregarProducto(Producto p) {
        this.listaProductos.add(p);
    }

    //cambiar estado con notificacion
    public void cambiarEstado(Estados nuevoEstado) {
        if (cliente != null) {
            estado = nuevoEstado;
            cliente.notificar("\nPedido cambió de estado a: " + estado);

        }

    }

    //Calcular total del pedido
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : listaProductos) {
            total += producto.calcularTotal();
        }
        return total;
    }

}
