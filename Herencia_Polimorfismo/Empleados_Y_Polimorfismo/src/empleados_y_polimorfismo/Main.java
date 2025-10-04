package empleados_y_polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author Sil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new EmpleadoPlanta(150000.00, 13000.00, "Lionel M"));
        listaEmpleados.add(new EmpleadoTemporal(20, 5000.00, "Maria P."));

        for (Empleado empleado : listaEmpleados) {
            System.out.println("El nombre del empleado es: " + empleado.getNombre());
            System.out.println("Su sueldo es : " + "$" + empleado.calcularSueldo());

            if (empleado instanceof EmpleadoPlanta) {
                //Downcasting
                EmpleadoPlanta empleadoPlanta = (EmpleadoPlanta) empleado;
                System.out.println("Es un empleado de planta. " + "\n");
            } else {
                System.out.println("La persona no es un empleado de planta.");
            }

        }

    }
}
