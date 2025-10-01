package casopractico1;

import java.util.ArrayList;

/**
 *
 * @author Sil
 */// 
public class Inventario {

    //Un inventario tiene productos. lista de productos
    public ArrayList<Producto> productos;
    private String nombre;

//Constructor
    public Inventario(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

//Metodo agregar producto
    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

//Metodo para listar los productos
    public String listarProductos() {
        if (productos.isEmpty()) {
            return "El inventario no tiene productos.";
        }

        //Usar una variable String para acumular la lista
        String lista = "";

        //Iterar y añadir información CONCISA a la cadena usando '+'
        for (Producto producto : productos) {

            // Acumulamos la información. '\n' es el salto de línea.
            lista = lista + "\n- Nombre: " + producto.getNombre() + " - Categoria: " + producto.getCategoria();
        }

        return lista;
    }

// Metodo para buscar un producto por id Y MOSTRARLO
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                System.out.println("Producto encontrado (ID: " + id + "):");
                p.mostrarInfo();
                return p;

            }
        }

        // Si el bucle termina sin encontrar el producto
        System.out.println("Producto con ID " + id + " no encontrado.");
        return null;
    }

// Metodo para eliminar un producto por id
    public boolean eliminarProducto(String id) {

        // Si el producto fue encontrado (no es null)
        Producto prodAborrar = buscarProductoPorId(id);
        if (prodAborrar != null) {

            // El método .remove(Object) devuelve 'true' si el objeto fue encontrado y eliminado.
            System.out.println("Producto Eliminado");

            return this.productos.remove(prodAborrar);

        } else { // Si prodAborrar era null (no se encontró), devolvemos false.
            System.out.println("Producto no encontrado");
            return false;
        }
    }

    // Metodo actualizar stock
    public boolean actualizarStock(String id, int nuevaCantidad) {
        // Buscar el producto por ID
        Producto productoAactualizar = buscarProductoPorId(id);

        // verificar si el producto fue encontrado
        if (productoAactualizar != null) {

            // Obtener el stock actual
            int stockActual = productoAactualizar.getCantidad();

            // Calcular el nuevo stock sumando la cantidadASumar
            int nuevoStock = stockActual + nuevaCantidad;

            // Establecer el nuevo stock en el producto
            productoAactualizar.setCantidad(nuevoStock);

            //Imprimir la confirmación y el nuevo stock (¡lo que querías!)
            System.out.println("Stock actualizado para el ID: " + id);
            System.out.println("Se sumaron: " + nuevaCantidad + " unidades.");
            System.out.println("Stock actual: " + nuevoStock + " unidades.");

            return true;

        } else {
            // Caso de que el producto no exista
            System.out.println("Producto con ID " + id + " no encontrado. Stock no actualizado.");
            return false;
        }
    }

    // Metodo para filtar por categoría
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        // Crear una lista vacía para almacenar los resultados
        ArrayList<Producto> productosFiltrados = new ArrayList<>();

        // Iterar sobre la lista de productos
        for (Producto p : productos) {
            // si la categoría del producto (p.getCategoria())
            //    es igual a la categoría que se busca (el parámetro 'categoria').
            if (p.getCategoria() == categoria) {
                // Si es igual, agregar 'p' a la lista productosFiltrados.
                productosFiltrados.add(p);
            }
        }
        if (productosFiltrados.isEmpty()) {
            System.out.println("No se encontraron productos en esta categoría.");
        } else {
            // Itera la lista que ya contiene los productos filtrados e imprime cada uno.
            for (Producto p : productosFiltrados) {
                p.mostrarInfo();
            }
        }

        // Devolver la lista 
        return productosFiltrados;
    }

//Metodo obtener total
    public int obtenerTotalStock() {
        int totalStock = 0;

        for (Producto producto : productos) {
            totalStock += producto.getCantidad();
        }
        System.out.println("Stock total: " + totalStock);
        return totalStock;

    }

//REVISAR ACA
// Metodo obtener producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        Producto productoConMayorStock = null;

        for (Producto p : productos) {
            if (productoConMayorStock == null || p.getCantidad() > productoConMayorStock.getCantidad()) {
                productoConMayorStock = p;
            }
        }

        // imprimimos el resultado solo una vez, al finalizar el bucle
        if (productoConMayorStock != null) {

            System.out.println("El producto con mayor stock es:");
            productoConMayorStock.mostrarInfo();
        } else {
            System.out.println("El inventario está vacío.");
        }

        return productoConMayorStock;
    }

//Metodo filtrar por precio
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {

        // Crear una lista vacía para almacenar los resultados
        ArrayList<Producto> productosEnRango = new ArrayList<>();

        //Iteramos para buscar los valores
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                productosEnRango.add(p);
            }
        }
       
        if (productosEnRango.isEmpty()) {
            System.out.println("No se encontraron productos en este rango.");
        } else {
            for (Producto p : productosEnRango) {
                p.mostrarInfo(); // Usamos el método que ya creaste
            }
        }

        // Devolver la lista filtrada
        return productosEnRango;
    }

//Metodo mostrar categoria disponible
    public void mostrarCategoriasDisponibles() {
        System.out.println("--- Categorías de Productos Disponibles ---");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            // Imprime el nombre (ALIMENTOS, ROPA, etc.) y su descripción (getDescripcion())
            System.out.println("Categoría: " + categoria.name() + " | Descripción: " + categoria.getDescripcion());
        }
    }

}
