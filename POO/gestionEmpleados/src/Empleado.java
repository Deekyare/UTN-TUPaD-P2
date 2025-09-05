// Clase empleado
public class Empleado {
    // Atributos de las instancias
    public int id;
    public String nombre;
    public String puesto;
    public double salario; 
    public double salarioBase = 1500; 
    //Atributos estáticos
    public static int totalEmpleados = 0;
    public static int autoId = 1;
    //Aumento fijo de $ 50
    public double aumentoFijo = 50;
    
    
            
    //Constructor
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario; // Asigna el salario actual
        
        //totalEmpleados++ aumenta el total de empleados en 1
        totalEmpleados++;
    }
     //Constructor de sobrecarga que recibe solamente nombre y puesto. El id es autoincremental
    public Empleado(String nombre, String puesto) {
        autoId++;
        this.id = autoId;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = this.salarioBase;
        //totalEmpleados aumenta el total de empleados en 1
        totalEmpleados++;
    }
    
    //Sobrecarga de métodos
    
    //Método para actualizar el salario con un aumento de $50
    public void actualizarSalario(){
        this.salario = this.salario + this.aumentoFijo;
    }
    //Aumento sin definir previamente. Porcentaje recibido por parámetros
    public void actualizarSalario(double porcentajeAumento){
        this.salario = this.salario + (this.salario * porcentajeAumento);
    }
     
    //Método para mostrar el total de empleados
    public static void mostrarTotalEmpleados(){
        System.out.println("\nEl total de empleados es de: " + Empleado.totalEmpleados+"\n");
    }
    
    //Metodo "toString" para visualizar los datos de las instancias de objeto
    @Override
    
    public String toString() {
        return "--DATOS EMPLEADO --\n\nId: "+ id + " \nNombre: "+ nombre +"\nPuesto: "+ puesto + "\nEl salario con el aumento es de: " + this.salario +"\n";
        } 
    }
    

