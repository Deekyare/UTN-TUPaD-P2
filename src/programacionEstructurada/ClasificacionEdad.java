package programacionEstructurada;

/*
Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
Menor de 12 años: "Niño"
Entre 12 y 17 años: "Adolescente"
Entre 18 y 59 años: "Adulto"
60 años o más: "Adulto mayor"
*/

import java.util.Scanner;

public class ClasificacionEdad {
    public static void main(String[] args) {
        Scanner edadIngresada = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        //Declaramos la variable edad y le asignamos el valor ingresado por el usuario
        int edad = edadIngresada.nextInt();
        //Elegimos que mostrar por pantalla segun corresponda
        if (edad < 12) {
            System.out.println("Eres un niño");
        } else if (edad <= 17) {
            System.out.println("Eres un adolescente");
        } else if (edad <= 59 ) {
            System.out.println("Eres un adulto");
        }else {
            System.out.println("Eres un adulto mayor");
        }
    }
}
