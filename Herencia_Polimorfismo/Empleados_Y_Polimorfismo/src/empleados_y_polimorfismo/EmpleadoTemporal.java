package empleados_y_polimorfismo;

/**
 *
 * @author Sil
 */
public class EmpleadoTemporal extends Empleado {

    private int diasTrabajados;
    private double pagoPorDia;

    public EmpleadoTemporal(int diasTrabajados, double pagoPorDia, String Nombre) {
        super(Nombre);
        this.pagoPorDia = pagoPorDia;
        this.diasTrabajados = diasTrabajados;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public double getPagoPorDia() {
        return pagoPorDia;
    }

    //Métodos
    @Override
    public double calcularSueldo() {
        return diasTrabajados * pagoPorDia;
    }

}
