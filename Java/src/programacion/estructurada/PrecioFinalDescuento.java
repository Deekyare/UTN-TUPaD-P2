package programacion.estructurada;

/*Cálculo del Precio Final con impuesto y descuento.
Crea un metodo calcularPrecioFinal(double impuesto, double
descuento) que calcule el precio final de un producto en un e-commerce. La
fórmula es:

PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
Descuento)

Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al méto y muestra el precio
final.*/

import java.util.Scanner;

public class PrecioFinalDescuento {
    public static void main(String[] args) {
        Scanner valoresIngresados = new Scanner(System.in);
        // Solicitud de valores necesarios
        System.out.println("Ingrese el precio del producto");
        double precioBase = Double.parseDouble(valoresIngresados.nextLine());

        System.out.println("Ingrese el porcentaje de impuestos: ");
        double impuestos = Double.parseDouble(valoresIngresados.nextLine());

        System.out.println("Introduzca el porcentaje de descuento");
        int descuento = Integer.parseInt(valoresIngresados.nextLine());

        //Convertir los valores impuestos y descuento a decimal, para luego realizar la cuenta correcta
        double impuestoFinal = impuestos / 100.0;
        double descuentoFinal = descuento / 100.0;

        // Llamar al metodo y guardar el resultado en una variable
        double precioFinal = calcularPrecioFinal(precioBase, impuestoFinal, descuentoFinal);

        // Mostrar el resultado
        System.out.println("El precio final es: $" + precioFinal);
        }

// Metodo que calcula el precio final
    public static double calcularPrecioFinal( double precioBase, double impuestoFinal, double descuentoFinal){
        double precioFinal = 0;
        precioFinal = precioBase + (precioBase*impuestoFinal) - (precioBase * descuentoFinal);
        return precioFinal;
    }
}
