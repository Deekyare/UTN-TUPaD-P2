package ejerciciosIntroduccion;

import java.util.Scanner;

/*Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego
los muestre en pantalla. Usa Scanner para capturar los datos.*/
public class act3_usoDeScanner {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        //Variables
        String nombre;
        int edad;

        //Solicitud e ingreso de datos
        System.out.print("Ingrese su nombre: ");
        nombre = datos.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(datos.nextLine());

        //Salida por consola
        System.out.print("Su nombre es " + nombre + "y tiene " + edad + " años.");
    }
}
