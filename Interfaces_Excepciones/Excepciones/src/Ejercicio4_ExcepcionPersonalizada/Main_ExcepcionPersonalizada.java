package Ejercicio4_ExcepcionPersonalizada;

import java.util.Scanner;

/**
 *
 * @author Sil
 */
public class Main_ExcepcionPersonalizada {
    
    // El código principal SIEMPRE debe ir dentro del método main
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        
        // 1. Leer la entrada del usuario
        int edadIngresada = teclado.nextInt(); 
        
        try {
            // 2. Crear una instancia de tu clase validadora
            EdadInvalida validador = new EdadInvalida();
            
            // 3. LLAMAR al método que contiene la lógica para lanzar la EXCEPCIÓN.
            // Si la edad es válida, la edadValidada será igual a edadIngresada
            int edadValidada = validador.edad(edadIngresada);
            
            // Si se llega a este punto, la edad es válida
            System.out.println("La edad ingresada (" + edadValidada + ") es válida.");
            
        } catch (EdadInvalidaException eix) {
            // 4. Si el método validador lanza la excepción, se captura aquí
            System.out.println("¡Error en la edad!");
            System.out.println("Detalle del error: " + eix.getMessage());
            
        } catch (java.util.InputMismatchException imx) {
            // Sugerencia: Capturar también si el usuario no ingresa un número.
             System.out.println("Error: Debe ingresar un valor numérico.");
            
        } finally {
            // 5. Cerrar el Scanner siempre, sin importar si hubo error o no
            teclado.close();
        }
    }
}