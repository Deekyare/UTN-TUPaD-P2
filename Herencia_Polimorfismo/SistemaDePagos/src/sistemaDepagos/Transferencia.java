package sistemaDepagos;

//Pagar con transferencia
public class Transferencia implements Pagable {

    private String cbu;

    public Transferencia(String cbu) {
        this.cbu = cbu;
    }

    @Override
    public void pagar() {
        System.out.println("Realizacon pago por transferencia al CBU: " + cbu);
    }

}
