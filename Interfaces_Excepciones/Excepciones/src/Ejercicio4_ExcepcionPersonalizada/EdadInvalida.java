package Ejercicio4_ExcepcionPersonalizada;

/**
 *
 * @author Sil
 */
public class EdadInvalida {
    public int edad (int edad) {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad es invalida");
        }
        if (edad > 120) {
            throw new EdadInvalidaException("La edad es invalida");
        }
        return edad;

    }
}

