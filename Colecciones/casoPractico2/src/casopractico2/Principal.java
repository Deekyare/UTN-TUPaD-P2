package casopractico2;

/**
 *
 * @author Sil
 */
public class Principal {

    public static void main(String[] args) {
        //Crear una instancia de biblioteca
        Biblioteca bibliotecaEscolar = new Biblioteca("bibliotecaEscolar");

        // Instancias de Autor
        Autor autor1 = new Autor("101", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("202", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("303", "Jorge Luis Borges", "Argentino");

        //Instancias de biblioteca
        bibliotecaEscolar.agregarLibro("L4434", "Cien años de soledad", 1967, autor1 );
        bibliotecaEscolar.agregarLibro("L126634", "La casa de los espíritus", 1982, autor2);
        bibliotecaEscolar.agregarLibro("L123554", "Ficciones", 1944, autor3);
        bibliotecaEscolar.agregarLibro("L6060", "Paula", 1994, autor2);
        bibliotecaEscolar.agregarLibro("L5050", "El amor en los tiempos del cólera", 1985, autor1);

        
        //Listar todos los libros con su información y la del autor.
        System.out.println(bibliotecaEscolar.listarLibros());
        
        //Buscar un libro por su ISBN y mostrar su información.
        System.out.println("\nEl libro buscado por ISBN es: " + bibliotecaEscolar.buscarLibroPorIsbn("L5050"));
        
        //Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("\nLos libros publicados en el año solicitado: " + bibliotecaEscolar.filtrarLibrosPorAnio(1985));
        

        //Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println(bibliotecaEscolar.eliminarLibro("L123554"));
        
        //Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("\nTotal de libros: " + bibliotecaEscolar.obtenerCantidadLibros());
        
        // Listar todos los autores de los libros disponibles en la biblioteca.
        System.out.println("\nLos autores en la lista son: " + bibliotecaEscolar.mostrarAutoresDisponibles());
    }

}
