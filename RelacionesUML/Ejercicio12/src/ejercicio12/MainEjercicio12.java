package ejercicio12;

/**
 *
 * @author Sil
 */
public class MainEjercicio12 {

    public static void main(String[] args) {
        //Instanciación de objetos
        Contribuyente contribuyente1 = new Contribuyente("Silvia G", "4555233234");
        Impuesto impuestos1 = new Impuesto(5.5060);
        
        impuestos1.setContribuyente(contribuyente1);
        
        
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuestos1);
    }
    
}
