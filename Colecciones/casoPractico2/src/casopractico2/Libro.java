package casopractico2;

/**
 *
 * @author Sil
 */
public class Libro {

    private String isbn;
    private String titulo;
    private int anioPublicacion;
    //Referencia a la clase Autor
    private Autor autor;

    //Constructor

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
    
    
    
    //Metodos, muestra titulo, isbn,anio y autor
    public void mostrarInfo() {
        System.out.println("Libro: ISBN: " + isbn + ", titulo: " + titulo + ", anioPublicacion: " + anioPublicacion+ ", autor: " + autor );
    }

    @Override
    public String toString() {
        return "Libro: " + "ISBN=" + isbn + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + ", autor=" + autor;
    }

    
    
}
