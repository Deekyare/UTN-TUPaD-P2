package ejercicio14_dependenciadecreacion;

/**
 *
 * @author Sil
 */
public class EditorVideo {

    public void Exportar(String formato, Proyecto proyecto) {
        //Método de dependencia de creacion
        Render render1 = new Render(formato);
        render1.setProyecto(proyecto);
       
        System.out.println(render1);
        System.out.println(proyecto);
        //Salida por consola - Datos asociados
        System.out.println("\n---Salida mostrando los datos de forma asociada---");
        System.out.println("El formato del render número 1 es: " + render1.getFormato());
        System.out.println("El nombre del proyecto es: "+ render1.getProyecto().getNombre() + ". Con una duración de: " + render1.getProyecto().getDuracionMin() + ".");

    }
}
