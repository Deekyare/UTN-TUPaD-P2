
/**
 *
 * @author Sil
 */
public class Principal {

    public static void main(String[] args) {
        //Crear una instancia de Inventario
        Inventario inventario1 = new Inventario("inventario1");

        // 2. Crear al menos cinco productos (Tarea 1)
        Producto p1 = new Producto("E001", "Parlante", 250000.0, 15, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("ALIM01", "Azucar", 1200.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("R001", "Remeras", 4500.0, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H001", "Juego de Sábanas", 7000.0, 20, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("ALI02", "Leche", 1500.0, 80, CategoriaProducto.ALIMENTOS);

        // Agregar los productos al inventario (Tarea 1)
        inventario1.agregarProducto(p1);
        inventario1.agregarProducto(p2);
        inventario1.agregarProducto(p3);
        inventario1.agregarProducto(p4);
        inventario1.agregarProducto(p5);

        System.out.println("---------------------------------------------------");
        System.out.println(" CONSIGNA: Listar productos");
        System.out.println("---------------------------------------------------");
        inventario1.listarProductos();
        System.out.println("---------------------------------------------------");
        System.out.println("CONSIGNA: Buscar un producto por ID y mostrar su información ");
        System.out.println("---------------------------------------------------");
        inventario1.buscarProductoPorId("R001");
        System.out.println("---------------------------------------------------");
        System.out.println("CONSIGNA: Filtrar y mostrar productos que pertenezcan a una categoría. ");
        System.out.println("---------------------------------------------------");
        inventario1.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        System.out.println("---------------------------------------------------");
        System.out.println("CONSIGNA: Eliminar producto por Id y devolver restantes ");
        System.out.println("---------------------------------------------------");
        inventario1.eliminarProducto("ALI0f2");
        System.out.println("---------------------------------------------------");
        System.out.println("CONSIGNA: Actualizar Stock ");
        System.out.println("---------------------------------------------------");
        inventario1.actualizarStock("E001", 5);
        System.out.println("---------------------------------------------------");
        System.out.println("CONSIGNA: Mostrar Stock total ");
        System.out.println("---------------------------------------------------");
        inventario1.obtenerTotalStock();
        System.out.println("---------------------------------------------------");
        System.out.println("CONSIGNA: El producto con mayor stock ");
        System.out.println("---------------------------------------------------");
        inventario1.obtenerProductoConMayorStock();
        System.out.println("---------------------------------------------------");
        System.out.println("CONSIGNA: Productos entre 1000 y 3000 ");
        System.out.println("---------------------------------------------------");
        inventario1.filtrarProductosPorPrecio(1000, 3000);
        System.out.println("---------------------------------------------------");
        System.out.println("CONSIGNA: Mostrar categorias y descripciones ");
        System.out.println("---------------------------------------------------");
        inventario1.mostrarCategoriasDisponibles();
    }
}
