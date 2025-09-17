package ejercicio4;

/**
 *
 * @author Sil
 */
public class TarjetaDeCredito {

    private String numero;
    private String fechaVencimiento;
    //Relación bidireccional con Cliente
    private Cliente cliente;
   //Relacion de agregación con clase Banco
    private Banco banco;

    //Constructor
    public TarjetaDeCredito(String numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }
    //Setters y Getters

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        //Validacion antibucle
         if (cliente != null && cliente.getTarjetaDeCredito() != this) {
            cliente.setTarjetaDeCredito(this);
        }
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    
    //Método toString
    @Override
    public String toString() {
        return "Tarjeta de Credito [numero=" + numero + ", Fecha de vencimiento = " + fechaVencimiento + "]";
    }

}
