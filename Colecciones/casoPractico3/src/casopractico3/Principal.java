package casopractico3;

/**
 *
 * @author Sil
 */
public class Principal {

    public static void main(String[] args) {
        Universidad universidad1 = new Universidad ("universidad1");
        
        //Crear al menos 3 profesores y 5 cursos.
        
        //crear profesores
        Profesor profesor1 = new Profesor("PRO01", "Tiburcio Valle", "Geografía");
        Profesor profesor2 = new Profesor("PRO02", "Amadeo Corona", "Historia");
        Profesor profesor3 = new Profesor("PRO03", "Catalina Herrera", "Artes");
        
        //Crear cursos
        Curso curso1 = new Curso ("CUR01", "Geografia I");
        Curso curso2 = new Curso ("CUR02", "Diseño Moderno");
        Curso curso3 = new Curso ("CUR03", "Culturas Antiguas");
        Curso curso4 = new Curso ("CUR04", "Historia Egipcia");
        Curso curso5 = new Curso ("CUR05", "Manualidades II");

        System.out.println("-- Agregación de Profesores --");
        //Agregar profesores y cursos a la universidad.
        universidad1.agregarProfesor(profesor1);
        System.out.println("\n-Se agregó al profesor: "+profesor1.getNombre());
        universidad1.agregarProfesor(profesor2);
        System.out.println("-Se agregó al profesor: "+profesor2.getNombre());
        universidad1.agregarProfesor(profesor3);
        System.out.println("-Se agregó al profesor: "+profesor3.getNombre());
        System.out.println("-- \nAgregación de Cursos --");
        universidad1.agregarCurso(curso1);
        System.out.println("\n-Nuevo Curso Registrado: "+curso1.getNombre());
        universidad1.agregarCurso(curso2);
        System.out.println("-Nuevo Curso Registrado: "+curso2.getNombre());
        universidad1.agregarCurso(curso3);
        System.out.println("-Nuevo Curso Registrado: "+curso3.getNombre());
        universidad1.agregarCurso(curso4);
        System.out.println("-Nuevo Curso Registrado: "+curso4.getNombre());
        universidad1.agregarCurso(curso5);
        System.out.println("-Nuevo Curso Registrado: "+curso5.getNombre());
        
        //Asignar profesores a cursos usando asignarProfesorACurso(...).
        System.out.println("\nAsignaciones de cursos a profesores");
        profesor1.agregarCurso(curso1);
        System.out.println("\n-Se asigno el curso: "+curso1.getNombre() + ", al profesor: "+profesor1.getNombre());
        profesor3.agregarCurso(curso2);
        profesor3.agregarCurso(curso5);
        System.out.println("-Se asigno el curso: "+curso2.getNombre()+" y "+ curso5.getNombre()+ ", al profesor: "+profesor2.getNombre());
        profesor2.agregarCurso(curso3);
        profesor2.agregarCurso(curso4);
        System.out.println("-Se asigno el curso: "+curso3.getNombre() +" y "+ curso4.getNombre()+ ", al profesor/a: "+profesor3.getNombre());
        
        //Listar cursos con su profesor y profesores con sus cursos.
        universidad1.listarCursos();
        
        //Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        System.out.println("\nASIGNACION-REASIGNACIÓN");
        universidad1.asignarProfesorACurso("CUR01","PRO02");
        universidad1.listarCursos();
        
        //Remover un curso y confirmar que ya no aparece en la lista del profesor.
        universidad1.eliminarCurso("CUR04");
        universidad1.listarCursos();
        
        //Remover un profesor y dejar profesor = null
        universidad1.eliminarProfesor("PRO02");
        universidad1.listarCursos();
        
        //Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println(universidad1.listarProfesores());
        
        
    }
    
}
