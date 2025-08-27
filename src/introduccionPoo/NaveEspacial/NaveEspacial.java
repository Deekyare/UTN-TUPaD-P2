package introduccionPoo.NaveEspacial;

/*Simulación de Nave Espacial
Crear una clase NaveEspacial con los atributos: nombre, combustible.
Métodos requeridos: despegar(), avanzar(distancia),
recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que
se supere el límite al recargar.
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin
recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.*/


public class NaveEspacial {
    String nombre;
    int combustible;

    void despegar(){
        System.out.println("Despegamos!!");
    }
    void avanzar(int distancia) {
        if (combustible < 10) {
            System.out.println("No hay suficiente combustible para avanzar.");
        } else {
            System.out.println("Estamos avanzando " + distancia + " km.");
        }
    }
    void recargarCombustible(int cantidad){
        System.out.println("Usted está realizando una carga de combustible: ");
        if (cantidad <= 0) {
            System.out.println("La cantidad no puede ser negativa o '0'.");
        } else if (cantidad >= 10 && cantidad <= 100) {
            combustible += cantidad; // Actualiza el combustible
            System.out.println("Cargando... El combustible es suficiente. Se recargaron " + cantidad + " litros.");
        } else {
            System.out.println("La cantidad supera el límite");
        }
    }
    void mostrarEstado(){
        System.out.println("Estamos volando perfectamente la nave: " + nombre + ", con " + combustible + " litros de combustible.");
    }
}