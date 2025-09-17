package ejercicio12;

/**
 *
 * @author Sil
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;
    
    //Constructor
    public Impuesto(double monto) {
        this.monto = monto;

    }
    
    // Getters para acceder al monto y al contribuyente asociado

    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    
}

   
    

 
    