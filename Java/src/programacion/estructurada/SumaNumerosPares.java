package programacion.estructurada;

/*
Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados.
*/

import java.util.Scanner;

public class SumaNumerosPares {
        public static void main(String[] args) {
            Scanner numIngresado = new Scanner(System.in);
            int numero;
            int sumaPares = 0;

            //  Leer el primer número antes del bucle
            System.out.print("Ingresa un números. Presiona '0' para terminar: ");
            numero = Integer.parseInt(numIngresado.nextLine());

            // Bucle while para cerrar el programa, reconocer los numeros pares y sumarlos
            while (numero != 0) {

                if (numero % 2 == 0) {
                    sumaPares += numero;
                }
                // // Lee el siguiente número para comenzar el while nuevamente
                System.out.print("Ingresa un números. Presiona '0' para terminar: ");
                numero = numIngresado.nextInt();
            }
            System.out.println("La suma de los números pares es: " + sumaPares);
        }
    }




