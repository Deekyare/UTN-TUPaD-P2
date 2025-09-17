package ejercicio11;

/**
 *
 * @author Sil
 */
public class MainEjercicio11 {

    public static void main(String[] args) {

        // Se crea un objeto Cancion. 
        Cancion cancion1 = new Cancion("Ave Maria");

        // Se crea un objeto Artista.
        Artista artista1 = new Artista("David Bisbal");

        cancion1.setArtista(artista1);

        // El reproductor "depende" de la cancion al momento de reproducirla.
        Reproductor Reproductor = new Reproductor();
        Reproductor.reproducir(cancion1);
    }

}
