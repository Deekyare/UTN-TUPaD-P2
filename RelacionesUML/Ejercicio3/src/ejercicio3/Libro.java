package ejercicio3;
/**
 *
 * @author Sil
 */
public class Libro {

    private String titulo;
    private String isbn;
    //Referencia a clase autor - asociación unidereccional
    private Autor autor;
    //Referencia a clase editorial - agregación
    private Editorial editorial;

    //Constructor
    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    // Método toString
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", isbn=" + isbn + "]";
    }

}
