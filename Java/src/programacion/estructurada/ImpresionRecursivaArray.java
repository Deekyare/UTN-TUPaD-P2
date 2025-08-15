package programacion.estructurada;
/*
Impresión recursiva de arrays antes y después de modificar un elemento.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.

Salida esperada:
Precios originales:
Precio: $199.99
Precio: $299.5
Precio: $149.75
Precio: $399.0
Precio: $89.99
Precios modificados:
Precio: $199.99
Precio: $299.5
Precio: $129.99
Precio: $399.0
Precio: $89.99

Conceptos Clave Aplicados:
        ✔ Uso de arrays (double[]) para almacenar valores.
        ✔ Recorrido del array con una función recursiva en lugar de un bucle.
        ✔ Modificación de un valor en un array mediante un índice.
        ✔ Uso de un índice como parámetro en la recursión para recorrer el
array.*/

public class ImpresionRecursivaArray {
    public static void main(String[] args) {
        //Declaracion e inicializacion de arrary con algunos valores
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        //Llamada al metodo/funcion recursiva para mostrar valores originales
        System.out.println("Precios originales:");
        imprimirPreciosRecursivo(precios, 0);

        // Modificación del precio de un producto específico
        precios[2] = 129.99;

        // Función recursiva para mostrar valores modificados
        System.out.println("\nPrecios modificados:");
        imprimirPreciosRecursivo(precios, 0);
    }

    // Función recursiva
    public static void imprimirPreciosRecursivo(double[] precios, int indice) {
        // Caso Base: Se detiene cuando el índice es igual a la longitud del array
        if (indice >= precios.length) {
            return;
        }

    // Imprime el precio en la posición actual
        System.out.println("Precio: $" + precios[indice]);

    // Llama a la misma función con el siguiente índice
    imprimirPreciosRecursivo(precios, indice + 1);
}
}