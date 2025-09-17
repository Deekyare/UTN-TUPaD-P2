package ejercicio14_dependenciadecreacion;

/**
 *
 * @author Sil
 */
public class Render {

    private String formato;
    private Proyecto proyecto;

    //Constructor
    public Render(String formato) {
        this.formato = formato;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    @Override
    public String toString() {
        return "Render [formato= " + formato + "]";
    }
}
