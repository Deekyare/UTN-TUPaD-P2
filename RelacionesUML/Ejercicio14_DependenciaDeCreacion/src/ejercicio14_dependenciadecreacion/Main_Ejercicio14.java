package ejercicio14_dependenciadecreacion;

/**
 *
 * @author Sil
 */
public class Main_Ejercicio14 {

    public static void main(String[] args) {

        Proyecto proyecto1 = new Proyecto("Video explicativo sobre dependencias de creación", "45:00");

        EditorVideo editado1 = new EditorVideo();
        editado1.Exportar("mp4", proyecto1);

    }

}
