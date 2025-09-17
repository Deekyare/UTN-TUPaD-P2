package ejercicio13;

/**
 *
 * @author Sil
 */
public class GeneradorCodigoQR {
    //Método de dependencia de creacion: genera CodigoQR, lo usa pero no lo guarda
    public void generar (String valor, Usuario usuario){
        CodigoQR qr1 = new CodigoQR(valor); {
        qr1.setUsuario(usuario);
        System.out.println("Qr generado para: "+qr1.getUsuario()+" con el valor de: "+qr1.getValor()+".");
    }
    }
}
