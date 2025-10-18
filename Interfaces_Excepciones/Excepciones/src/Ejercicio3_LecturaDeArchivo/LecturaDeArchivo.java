package Ejercicio3_LecturaDeArchivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LecturaDeArchivo {

    public static void main(String[] args) {
        
        // Definir el nombre o la ruta del archivo
        String nombreArchivo = "src/Ejercicio3_LecturaDeArchivo/cuento.txt"; 

        try (
            // Inicialización del recurso (Scanner) dentro del try.
            Scanner lector = new Scanner(new File(nombreArchivo));
        ) {
            System.out.println("--- Contenido del archivo (" + nombreArchivo + ") ---\n");
            
            // Lee y muestra cada línea del archivo
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }
            
            System.out.println("\n--- Fin del archivo ---");

        } catch (FileNotFoundException e) {
            //Si el archivo no existe
            System.out.println("¡ERROR! El archivo de texto no fue encontrado.");
            System.out.println("Verifique la ruta: " + nombreArchivo);
            System.out.println("Detalle del error: " + e.getMessage());
        } 
        
        System.out.println("\nPrograma finalizado.");
    }
}


