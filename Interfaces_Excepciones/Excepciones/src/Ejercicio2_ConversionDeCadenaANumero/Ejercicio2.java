package Ejercicio2_ConversionDeCadenaANumero;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        // Crear el Scanner
        Scanner leer = new Scanner(System.in); 
        //Pedirle al usuario que ingrese un dato
        System.out.print("Ingrese un texto/número para intentar convertir: ");
        
        // Leer la entrada como String
        String textoIngresado = leer.nextLine(); 
        
        try {
            int numeroConvertido = Integer.parseInt(textoIngresado);            
            System.out.println("Conversión exitosa. El número es: " + numeroConvertido);
        } 
        catch (NumberFormatException nfe) {
            //Capturar y manejar la excepción si la conversión falla
            System.out.println("Error: El texto ingresado no es un número entero válido.");
            System.out.println("Detalle del error: " + nfe.getMessage());
        }
        
        System.out.println("Operación finalizada.");
       
    }
}