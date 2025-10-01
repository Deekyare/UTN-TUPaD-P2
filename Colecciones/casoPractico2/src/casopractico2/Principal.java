package casopractico2;

/**
 *
 * @author Sil
 */
public class Principal {

    public static void main(String[] args) {
        //Crear una instancia de biblioteca
        Biblioteca bibliotecaEscolar = new Biblioteca("bibliotecaEscolar");

        // Crear los objetos Autor
        Autor autor1 = new Autor("101", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("202", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("303", "Jorge Luis Borges", "Argentino");

        //Creamos y agregamos los libros a la biblioteca
        bibliotecaEscolar.agregarLibro("l4434", "Amor en tiempos de colera", 1995, autor1);
        bibliotecaEscolar.agregarLibro("l126634", "asd", 1993, autor2);
        bibliotecaEscolar.agregarLibro("l123554", "asdewq", 1993, autor3);
        
        //Listar todos los libros con su información y la del autor.
        System.out.println("\nLos libros en la biblioteca son:\n " + bibliotecaEscolar.listarLibros());
        
        //Buscar un libro por su ISBN y mostrar su información.
        System.out.println("\nEl libro buscado por ISBN es: " + bibliotecaEscolar.buscarLibroPorIsbn("l4434"));
        
        //Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("\nLos libros publicados en el año solicitado: " + bibliotecaEscolar.filtrarLibrosPorAnio(1993));
        
        //Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("\nColección actualizada: " + bibliotecaEscolar.eliminarLibro("l4434"));
        
        //Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("\nTotal de libros: " + bibliotecaEscolar.obtenerCantidadLibros());
        
        // Listar todos los autores de los libros disponibles en la biblioteca.
        System.out.println("\nLos autores en la lista son: " + bibliotecaEscolar.mostrarAutoresDisponibles());
    }

}
