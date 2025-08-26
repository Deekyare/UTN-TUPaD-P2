package introduccion.poo.DatosEstudiantes;
/*
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
calificaciones.
*/
public class MainEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Silvia";
        estudiante1.apellido = "Giardini";
        estudiante1.curso = "Matemáticas";
        estudiante1.calificacion = 7.5;

        estudiante1.mostrarInfo();
        estudiante1.bajarCalificacion(3);
        estudiante1.subirCalificacion(1);
    }
}
