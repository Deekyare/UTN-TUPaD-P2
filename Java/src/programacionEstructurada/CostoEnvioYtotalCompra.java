package programacionEstructurada;
/*Composición de funciones para calcular costo de envío y total de compra.

a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado en la zona de envío (Nacional o Internacional)
 y el peso del paquete.
Nacional: $5 por kg
Internacional: $10 por kg

b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio
del producto.

Luego, muestra el total a pagar.

Ejemplo de entrada/salida:
Ingrese el precio del producto: 50
Ingrese el peso del paquete en kg: 2
Ingrese la zona de envío (Nacional/Internacional): Nacional
El costo de envío es: 10.0
El total a pagar es: 60.0*/

import java.util.Scanner;

public class CostoEnvioYtotalCompra {
    public static void main(String[] args) {
        Scanner entradaValores = new Scanner(System.in);
        //Solicitus de datos necesarios
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(entradaValores.nextLine());

        System.out.println("Ingrese el peso del paquete en kg: ");
        double pesoProducto = Double.parseDouble(entradaValores.nextLine());

        System.out.println("Ingrese la zona de envío (Nacional/Internacional): ");
        String zonaEnvio = entradaValores.nextLine();

        // Llamar al metodo y guardar el resultado en una variable
        double costoEnvioFinal = calcularCostoEnvio(zonaEnvio,pesoProducto);
        double valorFinalApagar = calcularTotalCompra(precioProducto, costoEnvioFinal);

        // Mostramos los resultados
        System.out.println("----------------------------------------");
        System.out.println("El costo de envío es: " + costoEnvioFinal);
        System.out.println("El total a pagar es: " + valorFinalApagar);

    }
    //Metodo para calcular costo de envio
    public static double calcularCostoEnvio(String zonaEnvio, double pesoProducto){
        double costoEnvio;
        if (zonaEnvio.equalsIgnoreCase("Nacional")) {
            costoEnvio = pesoProducto * 5;
        } else {
            costoEnvio = pesoProducto * 10;
        }
        return costoEnvio;
    }
    //Metodo para calcular total de compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double totalApagar = precioProducto + costoEnvio;
        return totalApagar;
    }


}
