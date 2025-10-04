package animales_comportamientosobreescrito;

/**
 *
 * @author Sil
 */
public class Animal {

    private String nombre;
    private boolean mamifero;

    public Animal(String nombre, boolean mamifero) {
        this.nombre = nombre;
        this.mamifero = mamifero;
    }

    public String getNombre() {
        return nombre;
    }

    //Método
    public void hacerSonido() {
        System.out.println("Sonido de animal general");
    }

    public void describirAnimal() {
    System.out.println("El animal llamado: " + "'"+ this.nombre+ "'" + " es mamifero: " + mamifero+"\n");
    }
}