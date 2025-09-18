package ejercicio4;

/**
 *
 * @author Sil
 */
public class Main {

    public static void main(String[] args) {
        // Crear los objetos
        
        Banco banco1 = new Banco("Galicia", "30-11223344");
        
        Cliente cliente1 = new Cliente("Silvia Giar","36975662");

        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("5468545165", "12/2028", banco1);

        // Establecer las relaciones usando los setters
        // Relación de gregación con clase Banco
        tarjeta1.setBanco(banco1);
        
        // Asociación bidireccional: Ambos objetos se referencian mutuamente.
        cliente1.setTarjetaDeCredito(tarjeta1);
    

        //Salida por comsola
        System.out.println("Información del banco: " + banco1);
        System.out.println("La tarjeta asociada es: " + tarjeta1.getNumero());
        
        System.out.println("\nInformación del cliente: " + cliente1);
        System.out.println("La tarjeta de " + cliente1.getNombre() + " es: " + cliente1.getTarjetaDeCredito().getNumero());
        
        System.out.println("\nVencimiento de la tarjeta: " + tarjeta1.getFechaVencimiento());
       
    }

}
