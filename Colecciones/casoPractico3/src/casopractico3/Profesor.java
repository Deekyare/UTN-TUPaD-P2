package casopractico3;

import java.util.ArrayList;

/**
 *
 * @author Sil
 */
public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    //Dicta muchos cursos, bidireccional con curso
    private ArrayList<Curso> cursos; //Cursos que dicta

    //Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        //Inicialización del ArrayList, profesor contiene cursos
        this.cursos = new ArrayList<>();
    }

    // Getter para Cursos
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;

    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    //Metodos
    //Agrega el curso a su lista si no está y sincroniza el lado del curso. sincronizacion inversa
    public void agregarCurso(Curso c) {
        if (c != null && !this.cursos.contains(c)) {
            this.cursos.add(c);
        }
        // Sincronización Inversa: Le decimos al curso quién es su profesor.
        c.setProfesor(this);

    }

    //Quita el curso y sincroniza el lado del curso (dejar profesor en null si corresponde).
    public void eliminarCurso(Curso c) {
        //borrar el curso de la lista
        boolean borrado = this.cursos.remove(c);
        //Si se borró, tmb hay q sacarlo del lado del curso
         // VALIDACIÓN ANTI-BUCLE (Si falta, se forma un bucle)
        // Si el curso aún no apunta a(this), entonces lo hago apuntar.
        if (c.getProfesor() != this) {
        c.setProfesor(null);
    }}

    //Muestra códigos y nombres.
    public String listarCursos() {
        if (cursos.isEmpty()) {
            return "No hay cursos registrados.";
        }

        // Usar una variable String para acumular la lista
        String listaCursos = "";

        // Iterar y añadir información a la cadena
        for (Curso curso : cursos) {
            // Asegúrate de separar código y nombre y usar los getters
            listaCursos += "\n- " + curso.getCodigo() + ": " + curso.getNombre();
        }

        return listaCursos;
    }

    //Imprime datos del profesor y cantidad de cursos.
    public void mostrarInfo() {
        System.out.println("Información del Profesor: \nCodigo:" + this.getId() + "\nNombre del Profesor: " + this.getNombre() + "\nCantidad de cursos: " + this.getEspecialidad());

    }
;

}
