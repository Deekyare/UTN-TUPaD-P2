
package Ejercicio1_DivisionSegura_Multimatch;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Sil
 */
public class Main {
    
    public static void main(String[] args) {
        
        try {
            int x, y, z;
            System.out.print("Ingrese x: ");
            x = new Scanner(System.in).nextInt();
            
            System.out.print("Ingrese y: ");
            y = new Scanner(System.in).nextInt();
            z = x / y;
            System.out.println("Resultado: " + z);
        }
        catch (InputMismatchException ime) {
            System.out.println("No es un entero... ");
        }
        catch (ArithmeticException ae) {
            System.out.println("No se puede dividir por cero");
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace(System.out);
        }
        System.out.println("Operación finalizada.");
    }

}
    
