package ejercicio1;

/**
 *
 * @author Sil
 */
public class main {

    public static void main(String[] args) {
        // Crear el objeto Titular
        Titular silvia = new Titular("Silvia Giar", "12345678A");

        // Crear el objeto Pasaporte, que internamente crea el objeto Foto
        Pasaporte pasaporteDeSilvia = new Pasaporte("P987654", "20-03-2000", "imagen-sil.jpg", "PNG");

        // Establecer la relación de asociación bidireccional
        // El pasaporte "conoce" a su titular, Se coloca una sola asociacion porque incluimos las validaciones en cada clase
        pasaporteDeSilvia.setTitular(silvia);
    

        // Salida por consola para corroborar datos
        System.out.println("Información del titular:");
        System.out.println(silvia);
        System.out.println("Su pasaporte es: " + silvia.getPasaporte().getNumero());

        System.out.println("\nInformación del pasaporte:");
        System.out.println(pasaporteDeSilvia);
        System.out.println("Su titular es: " + pasaporteDeSilvia.getTitular().getNombre());
        System.out.println("Su foto es: " + pasaporteDeSilvia.getFoto()); // Demuestra la composición
    }
}
