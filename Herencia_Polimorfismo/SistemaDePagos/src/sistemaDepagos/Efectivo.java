package sistemaDepagos;

public class Efectivo implements Pagable {

    @Override
    public void pagar() {
        System.out.println("Aceptando pago en efectivo. ");
    }
}
