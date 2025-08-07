package ejerciciosIntroduccion;

/* Escribe un programa que muestre el siguiente mensaje en consola:
Nombre: Juan Pérez
Edad: 30 años
Dirección: "Calle Falsa 123"
Usa caracteres de escape (\n, \") en System.out.println().*/

public class act5_mensaje {
    public static void main(String[] args) {
        // Variables
        String nombre = "Juan Pérez", edad = "30 años", direccion = "Calle Falsa 123";
        //Salida por consola
        System.out.println("__Contacto__\nNombre: " + nombre + "\nEdad: " + edad + "\nDirección: " + "\"" + direccion + "\""  );
    }
}
