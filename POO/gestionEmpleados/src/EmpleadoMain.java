//Implementar la clase Empleado aplicando todos los puntos anteriores.
//Crear una clase de prueba con método main que:
//
//Instancie varios objetos usando ambos constructores.
//Aplique los métodos actualizarSalario() sobre distintos
//empleados.
//
//Imprima la información de cada empleado con toString().
//Muestre el total de empleados creados con
//mostrarTotalEmpleados().

public class EmpleadoMain {
    public static void main(String[] args) {
        //Creacion de instancia Empleado 1
        
        Empleado empleado_1 = new Empleado (1, "Lionel", "Vendedor", 3000);
        
        //Llamada al método actualizarSalario fijo
        empleado_1.actualizarSalario();
        
        //Mostrar datos del empleado
        System.out.println(empleado_1);
        
        //Creacion de instancia Empleado 2
        Empleado empleado_2 = new Empleado ("Silvia", "Aministrador");
         
        //Llamada al método actualizarSalario enviando el porcentaje por parámetro
        empleado_2.actualizarSalario(0.20);
        
        System.out.println(empleado_2);
        
        //Creacion de instancia Empleado 3
        Empleado empleado_3 = new Empleado ("Matilde", "Vendedor");
      
        //Llamada al método actualizarSalario enviando el porcentaje por parámetro
        empleado_3.actualizarSalario(0.50);
        
        System.out.println(empleado_3);
        
        //Mostramos el total de empleados
        Empleado.mostrarTotalEmpleados();
    }
        
}
