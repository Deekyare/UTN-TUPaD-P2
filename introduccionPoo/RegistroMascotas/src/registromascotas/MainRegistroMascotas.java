/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registromascotas;

/**
 *
 * @author Sil
 */
public class MainRegistroMascotas {

    public static void main(String[] args) {
        //Creación e inicialización de la instancia "Mascotas"
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Orion";
        mascota1.especie = "Gato";
        mascota1.edad = 3;

        //Llamada a los métodos
        mascota1.mostrarInfo();
        mascota1.cumplirAnios(2);
        mascota1.mostrarInfo();
    }
    
}
