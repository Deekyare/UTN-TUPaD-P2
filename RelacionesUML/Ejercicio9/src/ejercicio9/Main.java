package ejercicio9;

/**
 *
 * @author Sil
 */
public class Main {

    public static void main(String[] args) {

        // Instaciación de objetos
        CitaMedica citaMedica1 = new CitaMedica("25-09-2025", "12:30");
        Paciente paciente1 = new Paciente("Silvia G", "Particular");
        Profesional profesional1 = new Profesional("Homero Simpson", "Medico General");

        //Establecer las relaciones usando los setters. Asociacion unidireccional
        citaMedica1.setPaciente(paciente1);
        citaMedica1.setProfesional(profesional1);
       

        // Verificación de datos a través de la salida por consola
        System.out.println("Información del paciente: " + paciente1);
        System.out.println("Información de la cita: " + citaMedica1);
        System.out.println("Información de la cita: " + citaMedica1);
        
        System.out.println("");
        
        //Combinar y mostrar la asociación
        System.out.println("La cita Medica será el: "+ citaMedica1.getFecha() + "a las: " + citaMedica1.getHora() + ". El profesional designado será: " + profesional1.getNombre() + ", " +profesional1.getEspecialidad());
        System.out.println("La cita se encuentra a nombre de: "+ paciente1.getNombre()+". Obra social: "+ paciente1.getObraSocial());
    }
    
}


