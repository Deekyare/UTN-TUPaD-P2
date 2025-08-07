package ejerciciosIntroduccion;

/*Escribe un programa que solicite dos números enteros y realice las siguientes
operaciones:
a. Suma
b. Resta
c. Multiplicación
d. División
Muestra los resultados en la consola.*/

import java.util.Scanner;

public class act4_operacionesAritmeticas {
    public static void main(String[] args) {
        Scanner numerosEnteros = new Scanner(System.in);
        //Variables
        int numero1, numero2, suma, resta, multiplicacion, division;

        //Solicitud de entradas
        System.out.println("Ingrese dos numeros enteros: ");
        numero1 = Integer.parseInt(numerosEnteros.nextLine());
        numero2 = Integer.parseInt(numerosEnteros.nextLine());

        //Operaciones
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;

        //Salidas
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + suma);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es " + resta);
        System.out.println("La multiplicacion de " + numero1 + " y " + numero2 + " es " + multiplicacion);
        System.out.println("La division de " + numero1 + " y " + numero2 + " es " + division);

    }
}
