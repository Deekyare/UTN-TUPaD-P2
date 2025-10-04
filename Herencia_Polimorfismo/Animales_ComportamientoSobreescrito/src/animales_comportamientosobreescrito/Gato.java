package animales_comportamientosobreescrito;

/**
 *
 * @author Sil
 */
public class Gato extends Animal {

    public Gato(String nombre, boolean mamifero) {
        super(nombre, mamifero);
    }

    //Metodos
    @Override
    public void hacerSonido() {
        System.out.println("El Gato: " + this.getNombre() + ", esta maullando");
    }
}
