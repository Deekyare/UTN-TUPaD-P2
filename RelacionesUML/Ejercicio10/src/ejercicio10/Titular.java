package ejercicio10;

/**
 *
 * @author Sil
 */
public class Titular {

    private String nombre;
    private String dni;
    //Referencia a clase Cuentabancaria
    private CuentaBancaria cuentaBancaria;

    //Constructor
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;

        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
            cuentaBancaria.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "Titular [Nombre= " + nombre + ", dni= " + dni + "]";
    }
}
