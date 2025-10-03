package vehiculosy_herencia_basica;

/**
 *
 * @author Sil
 */
public class Auto extends Vehiculo {

    private int cantPuertas;

    //Constructor
    public Auto( String marca, String modelo, int cantPuertas) {
        super(marca, modelo);
        this.cantPuertas = cantPuertas;
    }

//SobreEscribir Método mostarraInfor()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cantidad de puertas: " + cantPuertas);
    }
}
