package programacionEstructurada;

/*Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10.

Luego, crea un metodo calcularDescuentoEspecial(double precio) que use la variable global para
calcular el descuento especial del 10%.

Dentro del metodo, declara una variable local descuentoAplicado, almacena
el valor del descuento y muestra el precio final con descuento.

Ejemplo de entrada/salida:
Ingrese el precio del producto: 200
El descuento especial aplicado es: 20.0
El precio final con descuento es: 180.0*/

import java.util.Scanner;

public class DescuentoEspecial {

    public class variableGlobal {
        public static double descuentoEspecial = 0.10;
    }
    public static void main(String[] args) {
        Scanner entradaDdatos = new Scanner(System.in);
        //Solicitud de datos necesarios
        System.out.print ("Ingrese el precio del producto: ");
        double precioProducto = Integer.parseInt(entradaDdatos.nextLine());

        //Llamada al metodo y muestra de resultados
        System.out.println ("El descuento especial aplicado es: "+ calcularDdescuentoEspecial(precioProducto));
        System.out.print ("El precio final con descuento es: "+ (precioProducto - calcularDdescuentoEspecial(precioProducto)));

    }
    //precio - (precio * 0.10)
    public static double calcularDdescuentoEspecial(double precioProducto){
       double descuentoAplicado = (precioProducto * variableGlobal.descuentoEspecial);
       return descuentoAplicado;
    }
}
