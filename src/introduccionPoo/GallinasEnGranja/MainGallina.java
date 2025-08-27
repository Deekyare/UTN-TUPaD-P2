package introduccionPoo.GallinasEnGranja;

public class MainGallina {
    public static void main(String[] args) {

        Gallina gallina1 = new Gallina();
        gallina1.idGallina = 1;
        gallina1.edad = 1;
        gallina1.huevosPuestos = 3;

        Gallina gallina2 = new Gallina();
        gallina2.idGallina = 2;
        gallina2.edad = 5;
        gallina2.huevosPuestos = 10;

        System.out.println("--- Gallina 1 ---");
        gallina1.mostrarEstado();
        gallina1.ponerHuevo(3);
        gallina1.envejecer(); // Agregar llamada
        gallina1.mostrarEstado();

        System.out.println("--- Gallina 2 ---");
        gallina2.mostrarEstado();
        gallina2.ponerHuevo(3);
        gallina2.envejecer(); // Agregar llamada
        gallina2.mostrarEstado();

    }

}





