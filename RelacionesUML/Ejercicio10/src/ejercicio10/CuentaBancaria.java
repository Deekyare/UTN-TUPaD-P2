package ejercicio10;

/**
 *
 * @author Sil
 */
public class CuentaBancaria {

    private String cbu;
    private double saldo;

    //Referencia a Clave de Seguridad - Composición
    private ClaveSeguridad claveSeguridad;
    //Referencia a titular - asociación Bidireccional
    private Titular titular;

    //Constructor
    public CuentaBancaria(String cbu, double saldo) {
        this.cbu = cbu;
        this.saldo = saldo;
        //Instanciacion del objeto claveSeguridad
        this.claveSeguridad = new ClaveSeguridad("M3dus4521", "15-07-2025");
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(ClaveSeguridad claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }

    }

    @Override
    public String toString() {
        return "Cuenta Bancaria [cbu= " + cbu + ", saldo= " + saldo + "]";
    }
}
