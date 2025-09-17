package ejercicio11;

/**
 *
 * @author Sil
 */
public class Reproductor {

    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getNombre());
        System.out.println("Artista: " + cancion.getArtista().getNombre());
    }
}
