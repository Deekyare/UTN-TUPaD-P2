package introduccionPoo.RegistroMascotas;

/*
Registro de Mascotas
a. Crear una clase Mascota con los atributos: nombre, especie, edad.
Métodos requeridos: mostrarInfo(), cumplirAnios().
Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y
verificar los cambios.
*/

public class Mascota {
    String nombre;
    String especie;
    int edad;

    //Métodos
    void mostrarInfo(){
        System.out.println("\n---Información de la mascota ---\n"+ "\nNombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad+ "\n-------------------");
    }
    void cumplirAnios(int anios){
        edad = edad + anios;
        //simular el paso del tiempo
        System.out.println("Han pasado "+ anios + " años");
    }
}
