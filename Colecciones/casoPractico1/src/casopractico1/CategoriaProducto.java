package casopractico1;

/**
 * @author Sil
 */
public enum CategoriaProducto {

    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    private final String descripcion;

    // Los constructores de los enums SIEMPRE son implícitamente privados
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    //Método público (Getter) para acceder al campo
    public String getDescripcion() {
        return descripcion;
    }

}
