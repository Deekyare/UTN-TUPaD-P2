package figurasgeometricas;

import java.util.ArrayList;

/**
 *
 * @author Sil
 */
public class Main {

    public static void main(String[] args) {
        
        ArrayList<Figura> listaFiguras = new ArrayList<>();
        
        listaFiguras.add(new Circulo(3, "Circulo 1"));
        listaFiguras.add(new Rectangulo(5, 3, "Rectangulo 1"));
        
        
        for (Figura listaFigura: listaFiguras){
            System.out.println("El área del: "+"'"+listaFigura.getNombre()+"'"+" es: "+listaFigura.calcularArea());
        }
        
        
    }
    
}
