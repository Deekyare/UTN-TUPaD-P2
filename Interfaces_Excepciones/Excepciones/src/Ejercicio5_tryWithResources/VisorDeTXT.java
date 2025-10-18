package Ejercicio5_tryWithResources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Sil
 */
public class VisorDeTXT {

    public void mostrarTxt(String ruta) throws FileNotFoundException, IOException {
        File elArchivo = new File(ruta);
        BufferedReader br = new BufferedReader(new FileReader(elArchivo));
        System.out.println(br.readLine());
    }
}
