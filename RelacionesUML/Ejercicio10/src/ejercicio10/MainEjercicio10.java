package ejercicio10;

/**
 *
 * @author Sil
 */
public class MainEjercicio10 {

    public static void main(String[] args) {
        // Instaciación de objetos
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("545452254554", 38.582);
        Titular titular1 = new Titular("Silvia G", "367866332");

        //Establecer las relaciones usando los setters. Asociacion bidireccional
        cuentaBancaria1.setTitular(titular1);
       

        // Verificación de datos a través de la salida por consola
        System.out.println("Información del titular: " + titular1);
        System.out.println("Información de la cuenta bancaria: " + cuentaBancaria1);
        System.out.println("Información de la clave: " + cuentaBancaria1.getClaveSeguridad().getUltimaModificación());
        
        System.out.println("");
        
        //Combinar y mostrar la asociación
        System.out.println("La Cuenta Bancaria pertenece a: "+ titular1.getNombre()+ ". Actualmente tiene un saldo de: "+ cuentaBancaria1.getSaldo());
        System.out.println("La clave fue modificada el: "+ titular1.getCuentaBancaria().getClaveSeguridad().getUltimaModificación());
    }
    
    }
    

