package animales_comportamientosobreescrito;

/**
 *
 * @author Sil
 */
public class Perro extends Animal {

    public Perro(String nombre, boolean mamifero) {
        super(nombre, mamifero);
    }

    //Metodos
    @Override
    public void hacerSonido() {

        System.out.println("El perro: " + this.getNombre() + ", esta ladrando");
    }
}
