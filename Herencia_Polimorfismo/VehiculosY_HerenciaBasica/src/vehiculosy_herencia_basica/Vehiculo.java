package vehiculosy_herencia_basica;

/**
 *
 * @author Sil
 */
public class Vehiculo {

    private String marca;
    private String modelo;

    //Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    //Métodos
    public void mostrarInfo() {
        System.out.println("El Vehiculo es modelo: " + modelo + " y su marca es: " + marca);
    }

}
