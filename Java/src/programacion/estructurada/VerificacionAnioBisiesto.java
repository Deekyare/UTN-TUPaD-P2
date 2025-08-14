package programacion.estructurada;

import java.util.Scanner;

/*Escribe un programa en Java que solicite al usuario un año y determine si es
bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
divisible por 400.
*/
public class VerificacionAnioBisiesto {
    public static void main(String[] args) {
        Scanner anioIngresado = new Scanner(System.in);

        System.out.println("-- Corroborando años bisiestos --");
        System.out.print("Ingrese un año: ");
        int anio = Integer.parseInt(anioIngresado.nextLine());

        if ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año ingresado es bisiesto");

        } else {
            System.out.println("El año ingresado no es bisisto");
    }
    anioIngresado.close();
 }
}