package introduccionPoo.GallinasEnGranja;

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
