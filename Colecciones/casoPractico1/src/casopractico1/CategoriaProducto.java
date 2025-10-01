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

    //Getter para acceder a la descripción
    public String getDescripcion() {
        return descripcion;
    }

}
