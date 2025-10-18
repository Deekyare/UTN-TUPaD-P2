package Ejercicio5_tryWithResources;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Sil
 */
public class Main {

    public static void main(String[] args) {
        VisorDeTXT v = new VisorDeTXT();
        try {
            v.mostrarTxt("src/Ejercicio3_LecturaArchivo/Texto.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe");
        } catch (IOException ex) {
            System.out.println("Error de E/S");
            System.out.println(ex.getMessage());
        }
    }

}
