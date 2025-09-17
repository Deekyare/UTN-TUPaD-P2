package ejercicio7;

/**
 *
 * @author Sil
 */
public class Main {

    public static void main(String[] args) {
        // Crear los objetos
        Conductor conductor1 = new Conductor("Silvia G", true);
        Vehiculo vehiculo1 = new Vehiculo("ASD 762", "Sedan");    
        Motor motor1 = new Motor("Naftero","A73737");
        
        // Establecer las relaciones usando los setters
        // Asociación bidireccional: Ambos objetos se referencian mutuamente.
        conductor1.setVehiculo(vehiculo1);
        
        //Conectar vehiculo con motor
        vehiculo1.setMotor(motor1);
        
        // Verificaciónes a traves de la consola
        System.out.println("Información del conductor:");
        System.out.println(conductor1);
        System.out.println("Su vehiculo es: " + conductor1.getVehiculo().getModelo());

        System.out.println("\nInformación del Vehículo:");
        System.out.println(vehiculo1);
        System.out.println("Su consuctor es: " + vehiculo1.getConductor().getNombre()+", tiene licencia: "+ vehiculo1.getConductor().getLicencia());
        System.out.println("Su motor es: " + vehiculo1.getMotor().getTipo()); 
    
    } 
   }
