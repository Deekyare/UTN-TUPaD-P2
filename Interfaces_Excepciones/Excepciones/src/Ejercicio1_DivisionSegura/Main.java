package Ejercicio1_DivisionSegura;

import java.util.Scanner;

/**
 *
 * @author Sil
 */
public class Main {

    public static void main(String[] args) {
        int x, y, z;
        System.out.print("Ingrese x: ");
        x = new Scanner(System.in).nextInt();
        System.out.print("Ingrese z: ");
        try {
            
            y = new Scanner(System.in).nextInt();
            z = x / y;
            System.out.println("Resultado: " + z);
        } catch (Exception ex) {
            System.out.print("Ocurrió un error. ");
            System.out.println("Error: " + ex.getMessage());
           
        }
        System.out.println("Operación finalizada");
    }

}
