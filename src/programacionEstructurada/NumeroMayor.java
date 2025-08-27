package programacionEstructurada;

/* Determinar el Mayor de Tres Números. Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.*/

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner numIngresado = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = numIngresado.nextInt();
        }
        int mayor = calcularMayor(numeros);
        System.out.println("El numero mayor es: " + mayor);
    }
    public static int calcularMayor (int[] numeros) {
        int mayor=numeros[0];
        for (int i = 1 ; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            }return mayor;
        }
    }

