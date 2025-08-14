package programacion.estructurada;

/*Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el
precio final*/

import java.util.Scanner;

public class CalculadoraDeDescuentos {
    public static void main(String[] args) {
        Scanner valoresIngre = new Scanner(System.in);


        System.out.print("Ingrese el precio del producto: ");
        //Declaración y asgnación de variables.
        double precio = Double.parseDouble(valoresIngre.nextLine());

        System.out.print("Ingrese la categoria del producto (A, B, C): ");
        //Declaración y asgnación de variables.
        String categoria = valoresIngre.nextLine();
        //Declaración y asgnación de variables categorias con sus calculos de descuento
        double precioFinalA = precio - (precio * 0.10), precioFinalB = precio - (precio * 0.15), precioFinalC = precio - (precio * 0.20);

        //Segun la categoría mostramos el descuento correspondiente.
        switch (categoria) {
            case "A":
                System.out.println("El precio ingresado es de: " + precio );
                System.out.println("Descuento aplicado: 10% de descuento");
                System.out.println("Precio final: $" + precioFinalA );
                break;
            case "B":
                System.out.println("El precio ingresado es de: " + precio );
                System.out.println("Descuento aplicado: 15% de descuento");
                System.out.println("Precio final: " + precioFinalB);
                break;
            case "C":
                System.out.println("El precio ingresado es de: " + precio );
                System.out.println("Descuento aplicado: 20% de descuento");
                System.out.println("Precio final: " + precioFinalC );
                break;

        }


    }
}
