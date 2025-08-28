package gallinasengranja;

/*Crear una clase "Gallina" con los atributos: idGallina, edad,
huevosPuestos.
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y
mostrar su estado.*/

public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;


    //Métodos
    public int ponerHuevo(int huevos){
        return huevosPuestos = huevosPuestos + huevos;
    }
    void envejecer(){
        edad ++;
    }
    public void mostrarEstado(){
        System.out.println("\nId: " + idGallina + "\nEdad: " + edad + "\nHuevos puestos: " + huevosPuestos + "\n");
    }
}

