package ejercicio5;

/**
 *
 * @author Sil
 */
public class Main {

    public static void main(String[] args) {
        // Crear los objetos
        Computadora computadora1 = new Computadora("Apple", "30-11223344");
        //Placa mADRE ya fue creada en Computadora

        Propietario propietario1 = new Propietario("Silvia Giar", "36998774");

        // Establecer las relaciones usando los setters
        // Asociación bidireccional: Ambos objetos se referencian mutuamente.
        computadora1.setPropietario(propietario1);
     

        // Verificaciónes a traves de la consola
        System.out.println("Información del propietario: " + propietario1);
        System.out.println("\nInformación de la computadora: " + computadora1.getMarca());
        System.out.println("El modelo de la placa madre es: " + computadora1.getPlacaMadre().getModelo());

        System.out.println("La computadora: " + computadora1.getMarca() + " con la placa madre: " + computadora1.getPlacaMadre().getModelo() + " es de: " + propietario1.getNombre());

    }

}
