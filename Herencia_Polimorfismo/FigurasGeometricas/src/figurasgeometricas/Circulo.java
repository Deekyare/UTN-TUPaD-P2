package figurasgeometricas;

/**
 *
 * @author Sil
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    double pi = Math.PI;

   @Override
public double calcularArea() {
    return (radio * radio) * pi; // Calcula el área
}
}
