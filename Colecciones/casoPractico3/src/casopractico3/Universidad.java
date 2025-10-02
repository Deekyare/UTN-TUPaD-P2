package casopractico3;

import java.util.ArrayList;

/**
 *
 * @author Sil
 */
public class Universidad {

    //UNIVERSIDAD administra el alta/baja y consulta de profesores y cursos.
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
        this.profesores = new ArrayList<>();

    }

    public void agregarProfesor(Profesor p) {
        if (p != null && !this.profesores.contains(p)) {
            this.profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null && !this.cursos.contains(c)) {
            this.cursos.add(c);
        }
    }

    //Usa setProfesor del curso.
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        // Buscar ambos objetos
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        //Validar
        if (curso == null) {
            System.out.println("Error: Curso con código " + codigoCurso + " no encontrado.");
            return;
        }
        if (profesor == null) {
            System.out.println("Error: Profesor con ID " + idProfesor + " no encontrado.");
            return;
        }

        // Asignar La  bidireccional
        // El setProfesor del curso se encarga de quitarlo del antiguo profesor y agregarlo al nuevo.
        curso.setProfesor(profesor);
        System.out.println("ASIGNACION COMPLETADA: Profesor " + profesor.getNombre() + " asignado a " + curso.getNombre() + ".");
    }

    //listarProfesores() / listarCursos()
    public String listarProfesores() {
        // Manejar el caso de lista vacía
        if (profesores.isEmpty()) {
            return "No hay profesores registrados.";
        }

        // Inicializar la cadena de texto para acumular los datos
        String listado = "\n--- Listado de Profesores ---\n";

        // Iterar sobre la lista de profesores
        for (Profesor p : profesores) {
            // Concatenar la información de cada profesor a la cadena 'listado'
            listado = listado + p.getNombre() + " (ID: " + p.getId() + ")"
                    + " - Cursos que dicta: " + p.getCursos().size() + "\n";
        }

        // Devolver la cadena completa
        return listado;
    }

    public void listarCursos() {
        System.out.println("\n--- Listado Detallado de Cursos y sus Profesores ---");

        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
            return;
        }

        // Iterar sobre la lista de cursos
        for (Curso c : cursos) {
            // Usamos el método mostrarInfo del Curso (que imprime su código, nombre y profesor)
            c.mostrarInfo();
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    // Elimina un curso de la Universidad y rompe su relación con el profesor.
    public void eliminarCurso(String codigo) {
        Curso cursoAeliminar = buscarCursoPorCodigo(codigo);

        if (cursoAeliminar != null) {
            // Romper la relación bidireccional antes de eliminar
            if (cursoAeliminar.getProfesor() != null) {
                // Llama a setProfesor(null). Esto dispara la lógica en Curso para
                // pedirle al Profesor que elimine el curso de su lista.
                cursoAeliminar.setProfesor(null);
            }

            // Eliminar el curso de la lista de la Universidad
            this.cursos.remove(cursoAeliminar);
            System.out.println("\nCurso: " + cursoAeliminar.getNombre() + " eliminado exitosamente.\n");
        } else {
            System.out.println("Error: Curso con código " + codigo + " no encontrado.");
        }
    };

    
            
    //Antes de remover, dejar null los cursos que dictaba.
    public void eliminarProfesor(String id) {
        Profesor profesorAeliminar = buscarProfesorPorId(id);

        if (profesorAeliminar != null) {
            // Antes de remover, romper la relación con TODOS sus cursos
            ArrayList<Curso> cursosDictados = profesorAeliminar.getCursos();

            // Recorremos una copia de la lista o usamos un bucle inverso
            // para evitar errores al modificar la lista original durante el bucle.
            for (int i = cursosDictados.size() - 1; i >= 0; i--) {
                Curso c = cursosDictados.get(i);
                // Llama a setProfesor(null). Esto rompe la relación bidireccional.
                c.setProfesor(null);
            }

            // Eliminar el profesor de la lista de la Universidad
            this.profesores.remove(profesorAeliminar);
            System.out.println("\nProfesor " + profesorAeliminar.getNombre() + " eliminado exitosamente.");

        } else {
            System.out.println("Error: Profesor con ID " + id + " no encontrado.");
        }
    }
}
