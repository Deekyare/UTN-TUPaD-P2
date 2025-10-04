package empleados_y_polimorfismo;

/**
 *
 * @author Sil
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private double extraPorAntiguedad;

    public EmpleadoPlanta(double sueldoBase, double extraPorAntiguedad, String Nombre) {
        super(Nombre);
        this.sueldoBase = sueldoBase;
        this.extraPorAntiguedad = extraPorAntiguedad;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public double getExtraPorAntiguedad() {
        return extraPorAntiguedad;
    }

  
    
    @Override
    public double calcularSueldo(){
       return  sueldoBase + extraPorAntiguedad;
    }
    
}
