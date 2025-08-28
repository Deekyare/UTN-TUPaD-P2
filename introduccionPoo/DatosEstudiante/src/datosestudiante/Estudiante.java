
package datosestudiante;

/*
Crear una clase "Estudiante" con los atributos: nombre, apellido, curso, calificación
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),
bajarCalificacion(puntos).
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
calificaciones.*/

public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    // Métodos
    void  mostrarInfo() {
        System.out.println("--- Datos del estudiante --- " + "\nNombre: "+ nombre + " " + apellido + "\nCurso: "+ curso + "\nCalificación: "+ calificacion);
    }
    void subirCalificacion (int puntos) {
        calificacion = calificacion + puntos;
        System.out.println("La calificación con " + puntos + " puntos extras es de: " + calificacion);
    }
    void bajarCalificacion (int puntos){
        calificacion = calificacion - puntos;
        System.out.println( "La calificación con " + puntos + " puntos menos es de: " + calificacion);


    }
}
