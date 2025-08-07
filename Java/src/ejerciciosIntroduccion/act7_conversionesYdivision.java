package ejerciciosIntroduccion;
/*
Manejar conversiones de tipo y división en Java.
a. Escribe un programa que divida dos números enteros ingresados por el
usuario.
b. Modifica el código para usar double en lugar de int y compara los
resultados.*/

import java.util.Scanner;

public class act7_conversionesYdivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1, numero2, division;
        double divisionDouble;

        System.out.println("Ingrese dos números enteros: ");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();

        // División entera
        division = numero1 / numero2;
        System.out.println("La división (int) de " + numero1 + " y " + numero2 + " es " + division);

        // División con double

        divisionDouble = (double) numero1 / numero2;
        System.out.println("La división (double) de " + numero1 + " y " + numero2 + " es " + divisionDouble);
    }
}
