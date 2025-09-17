package ejercicio11;

/**
 *
 * @author Sil
 */
public class Cancion {

    private String nombre;
    //Asociacion unidireccional - Cancion conoce a Artista
    private Artista artista;

    public Cancion(String nombre) {
        this.nombre = nombre;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public Artista getArtista() {
        return artista;
    }

   

}
