package ejercicio13;

/**
 *
 * @author Sil
 */
public class Main_Ejercicio13 {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Silvia G", "silvia@giar.com");
        GeneradorCodigoQR generador = new GeneradorCodigoQR();

        //Llamar al método generar del generador, pasándole los datos necesarios
        generador.generar("soy un codigoQR", usuario1);
    }

}
