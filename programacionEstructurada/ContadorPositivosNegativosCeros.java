package programacionEstructurada;

/*
Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.
*/

import java.util.Scanner;

public class ContadorPositivosNegativosCeros {
    public static void main(String[] args) {
        Scanner entradaNumeros = new Scanner(System.in);
        //Declaramos e inicializamos las variables

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Bucle for para clasificar los numeros en positivos negativos y ceros a medida que se ingresan
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el número " + (i+1) + ": ");
            int numeros = Integer.parseInt(entradaNumeros.nextLine());
            if (numeros > 0) {
                positivos++;
            } else if (numeros < 0) {
                negativos++;
            }else {
                ceros++;
            }
        }
        //Imprimimos los resultados
        System.out.println("-- Resultados --");
        System.out.println("Positivos: "+ positivos);
        System.out.println("Negativos: "+ negativos);
        System.out.println("Ceros: "+ ceros);

    }
}
