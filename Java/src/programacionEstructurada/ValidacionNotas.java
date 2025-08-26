package programacionEstructurada;

/*Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
hasta que ingrese un valor válido.*/

import java.util.Scanner;

public class ValidacionNotas {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        int nota;
        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = notas.nextInt();
            // Si la nota es inválida
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Por favor, intente de nuevo.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente");
    }
}
