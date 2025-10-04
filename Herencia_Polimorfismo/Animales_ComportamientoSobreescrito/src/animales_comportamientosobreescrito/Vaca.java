package animales_comportamientosobreescrito;

/**
 *
 * @author Sil
 */
public class Vaca extends Animal {

    public Vaca(String nombre, boolean mamifero) {
        super(nombre, mamifero);
    }

    //Metodos
    @Override
    public void hacerSonido() {
        System.out.println("La vaca: " + this.getNombre() + " esta mujiendo");
    }
}
