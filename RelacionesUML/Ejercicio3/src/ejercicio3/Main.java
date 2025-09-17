package ejercicio3;

/**
 *
 * @author Sil
 */
public class Main {

    public static void main(String[] args) {

        // Crear los objetos
        Libro libro1 = new Libro("Caperucita", "12345678A");

        Autor autor1 = new Autor("Hermanos Grimm", "Alemana");

        Editorial editorial1 = new Editorial("Alba", "Calle falsa 123");

        //Establecer las relaciones usando los setters
        // Agregación: El libro tiene una editorial, de la clase editorial
        libro1.setEditorial(editorial1);
        
        // Asociación unidireccional: El libro tiene un autor, clase autor.
        libro1.setAutor(autor1);

        // Verificación
        System.out.println("Información del libro: " + libro1);
        System.out.println("Su autor es: " + libro1.getAutor().getNombre());
        System.out.println("La editorial es: " + libro1.getEditorial().getNombre());
    }

}
