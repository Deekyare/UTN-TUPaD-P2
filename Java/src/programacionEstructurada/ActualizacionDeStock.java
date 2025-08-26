package programacionEstructurada;

/*
Actualización de stock a partir de venta y recepción de productos.
Crea un metodo actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado.

Ejemplo de entrada/salida:
Ingrese el stock actual del producto: 50
Ingrese la cantidad vendida: 20
Ingrese la cantidad recibida: 30
El nuevo stock del producto es: 60
*/

import java.util.Scanner;

public class ActualizacionDeStock {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);

        //Solicitud y entrada de datos
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(entradaDatos.nextLine());

        System.out.print("Ingrese la cantidad vendida: ");
        int cantVendida = Integer.parseInt(entradaDatos.nextLine());

        System.out.print("Ingrese la cantidad recibida: ");
        int cantRecibida = Integer.parseInt(entradaDatos.nextLine());

        //LLamar al metodo y mostrar la actualización del stock
        System.out.print("El núevo stock es: " + actualizarStock(stockActual,cantVendida,cantRecibida));

    }
//Metodo para actualizar el stock
    public static int actualizarStock (int stockActual, int cantVendida, int cantRecibida){
        int nuevoStock = (stockActual - cantVendida) + cantRecibida;
        return nuevoStock;
    }
}
