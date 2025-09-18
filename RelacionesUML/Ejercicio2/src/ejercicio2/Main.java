package ejercicio2;

/**
 *
 * @author Sil
 */
public class Main {

    public static void main(String[] args) {
        //Crear las instancias
        Usuario silvia = new Usuario("Silvia Giar", "12345678A");
        Bateria bateria1 = new Bateria("4500mAh", "EB-B1234");
        Celular celular1 = new Celular(300, "Samsung", "Galaxy S22", bateria1 );

 
        // Asociación bidireccional: Ambos objetos se referencian mutuamente.
        celular1.setUsuario(silvia); // El celular conoce al usuario, pero como agregamos validación en cada clase, solo colocamos una asociación
       

        //Verificar datos
        System.out.println("Información del usuario: " + silvia);
        System.out.println("Su celular es: " + silvia.getCelular().getModelo());

        System.out.println("\nInformación del celular: " + celular1);
        System.out.println("El dueño es: " + celular1.getUsuario().getNombre());
        System.out.println("La batería tiene una capacidad de: " + celular1.getBateria().getCapacidad());

    }
}
