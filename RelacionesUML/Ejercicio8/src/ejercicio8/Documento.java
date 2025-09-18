
package ejercicio8;

/**
 *
 * @author Sil
 */
public class Documento {
    private String titulo;
    private String contenido;
    //Referencia a usuario -  composicion
    private FirmaDigital firmaDigital;
    
    //Constructor
    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }
    //Getters y Setters

    public String getContenido() {
        return contenido;
    }

    public String getTitulo() {
        return titulo;
    }
    

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    public void setFirmaDigital(FirmaDigital firmaDigital) {
        this.firmaDigital = firmaDigital;
    }
     @Override
    public String toString() {
        return "Documento [Título = " + titulo + ", Contenido = " + contenido + "]";
    }
}
