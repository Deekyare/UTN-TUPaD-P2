package casopractico3;

/**
 *
 * @author Silvia
 */
public class Curso {

    private String codigo;
    private String nombre;
    //Cada Curso tiene 1 profesor responsable bidireccional. NO SE PASA POR CONSTRUUCTOR, SETTER CON VALIDACION
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    //GETTERS Y SETTERS
    public Profesor getProfesor() {
        return profesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    //MÉTODOS
    //Asigna/cambia el profesor sincronizando ambos lados o Si tenía profesor previo, quitarse de su lista.
    public void setProfesor(Profesor nuevoProfesor) {

        //VALIDACIÓN ANTI-BUCLE: Si el profesor que me pasan es el mismo que tengo, ¡termino!
        if (this.profesor == nuevoProfesor) {
            return;
        }

        // ROMPER EL VÍNCULO PREVIO (Sincronizar al profesor anterior)
        if (this.profesor != null) {
            // Le pedimos al antiguo profesor que se quite este curso de su lista.
            // Esto previene que el antiguo profesor siga creyendo que dicta este curso.
            this.profesor.eliminarCurso(this);
        }

        // ESTABLECER EL NUEVO VÍNCULO LOCAL
        // Asignamos el nuevo profesor (puede ser un objeto Profesor o null para romper el vínculo)
        this.profesor = nuevoProfesor;

        //SINCRONIZAR CON EL NUEVO PROFESOR (Si el nuevo profesor no es null)
        if (this.profesor != null) {
            // Le pedimos al profesor nuevo que se agregue este curso a su lista.
            // El método agregarCurso se encarga de añadirlo y de la validación final.
            this.profesor.agregarCurso(this);
        }
    }

    //Muestra código, nombre y nombre del profesor (si tiene).
    public void mostrarInfo() {
         // 1. Verificar si el profesor existe para evitar el error
    String nombreProfesor;
    
    if (this.profesor != null) {
        // Si existe, obtenemos su nombre
        nombreProfesor = this.profesor.getNombre();
    } else {
        // Si es null, mostramos un mensaje por defecto
        nombreProfesor = "Sin asignar";
    }
    
    // 2. Imprimir la información usando la variable segura
    System.out.println("\nCódigo: " + this.getCodigo());
    System.out.println("Nombre: " + this.getNombre());
    System.out.println("Dictado por: " + nombreProfesor);
}
};
