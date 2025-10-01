package casopractico2;

import java.util.ArrayList;

/**
 *
 * @author Sil
 */
public class Biblioteca {

    //Atributos
    private String nombre;
    //Conposición entre biblioteca y libro
    public ArrayList<Libro> libros; //Coleccion de libros de la biblioteca

    //Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        //Conposición entre biblioteca y libro
        this.libros = new ArrayList<>();
    }
    //Métodos

    //Metrodo para agregar un nuevo libro a la biblioteca
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        //Crear el nuevo objeto Libro, usando el constructor de la clase Libro
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);

        // Agregar el objeto a la lista
        this.libros.add(nuevoLibro);
    }

    public String listarLibros() {
        if (libros.isEmpty()) {
            return "La biblioteca no tiene libros registrados.";
        }

        // 2. Usar una variable String para acumular la lista
        String lista = "";

        // 3. Iterar y añadir información CONCISA a la cadena usando '+'
        for (Libro libro : libros) {

            // Acumulamos la información. '\n' es el salto de línea.
            lista = lista + "\n- " + libro.getTitulo();
        }

        return lista;
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        //Para buscar un libro x alguna cualidad, hay que recorrer la lista primero
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                libro.getTitulo();
                return libro;
            }
        }//Si no es encontrado
        return null;
    }

    public String eliminarLibro(String isbn) {

        //Buscar el libro
        Libro libroAeliminar = buscarLibroPorIsbn(isbn);

        // Si NO se encontró el libro:
        if (libroAeliminar == null) {
            // Devolvemos el mensaje de fallo como String (compatible con la firma)
            return "Fallo: Libro con ISBN " + isbn + " no encontrado. ";
        }

        // Si SÍ se encontró, intentamos la eliminación:
        boolean fueEliminado = this.libros.remove(libroAeliminar);

        if (fueEliminado) {
            
            System.out.println("\nEl Libro con ISBN " + isbn + " fue eliminado.\n");
            this.listarLibros(); 

            // Llamamos al listado 
                    

        }
        return this.listarLibros();
        
    }

    public int obtenerCantidadLibros() {
        int contador = 0;
        for (Libro libro : libros) {
            contador += 1;
        }
        return contador;
    }

    public String filtrarLibrosPorAnio(int anioBuscado) { // 1. Cambiamos la firma a String

        // 2Declaramos e inicializamos la variable lista como un String
        String listaDeTitulos = "";

        boolean encontrado = false; 

        // Recorremos la lista original (libros)
        for (Libro libro : libros) {

            if (libro.getAnioPublicacion() == anioBuscado) {

                // Concatenamos el título a la cadena
                listaDeTitulos += "\n- " + libro.getTitulo();
                encontrado = true;
            }
        }

        // Decidimos qué devolver basado en el resultado
        if (encontrado) {
            return listaDeTitulos; // Devolvemos la lista de títulos
        } else {
            // Devolvemos un mensaje si no se encontró nada
            return "No se encontraron libros publicados en el año " + anioBuscado + ".";
        }
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public String mostrarAutoresDisponibles() {
        String listaDeAutores = "";

        boolean encontrado = false; 

        // Recorremos la lista original (libros)
        for (Libro libro : libros) {

            if (libro.getAutor() != null) {

                // Concatenamos el título a la cadena
                listaDeAutores += "\n " + libro.getAutor();
                encontrado = true;
            }
        }

        // Decidimos qué devolver basado en el resultado
        if (encontrado) {
            return listaDeAutores; // Devolvemos la lista de autores
        } else {
            // Devolvemos un mensaje si no se encontró nada
            return "No se encontraron.";
        }
    }}
