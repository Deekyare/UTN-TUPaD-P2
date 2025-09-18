package ejercicio6;

/**
 *
 * @author Sil
 */
public class Main {

    public static void main(String[] args) {
        // Crear los objetos
        Mesa mesa1 = new Mesa(2, 3);
        Cliente cliente1 = new Cliente("Silvia G", 1165656554);
        Reserva reserva1 = new Reserva("25-09-2025", "20:30", mesa1);
       

        // Establecer las relaciones usando los setters
        reserva1.setCliente(cliente1);
        reserva1.setMesa(mesa1);

        // Verificaciónes a traves de la consola
        System.out.println("-- Información de la reserva --");
        System.out.println("La reserva1, se encuentra a nombre de: " + cliente1.getNombre() + ", el dia: " + reserva1.getFecha() + " a las: " + reserva1.getHora() + ".");
        System.out.println("Le tocó la mesa número: " + mesa1.getNumero() + " con capacidad para: " + mesa1.getCapacidad() + " personas.");

    }

}
