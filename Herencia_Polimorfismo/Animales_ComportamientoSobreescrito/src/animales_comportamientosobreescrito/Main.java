package animales_comportamientosobreescrito;

import java.util.ArrayList;

/**
 *
 * @author Sil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Animal> listaAnimales = new ArrayList<>();

        listaAnimales.add(new Perro("Plutón", true));
        listaAnimales.add(new Gato("Orion", true));
        listaAnimales.add(new Vaca("Lola", true));

        for (Animal animal : listaAnimales) {
            animal.hacerSonido();
            animal.describirAnimal();
        }
    }

}
