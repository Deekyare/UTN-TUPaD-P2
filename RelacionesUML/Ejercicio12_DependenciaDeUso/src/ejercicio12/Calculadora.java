package ejercicio12;

public class Calculadora {

    // El método "depende" del objeto Impuesto que recibe como parámetro
    public void calcular(Impuesto impuesto) {
        // Simulación de un recargo fijo
        double montoFinal = impuesto.getMonto() + 100.50;
        //Salida por consola
        System.out.println("El impuesto original a nombre de " + impuesto.getContribuyente().getNombre() + " es de: $" + impuesto.getMonto());
        System.out.println("El monto final a pagar, incluyendo recargos, es de: $" + montoFinal);
    }
}
