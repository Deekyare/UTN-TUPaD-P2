package introduccionPoo.NaveEspacial;

public class MainNaveEspacial {
    public static void main() {
        NaveEspacial naveEspacial1 = new NaveEspacial();

        naveEspacial1.nombre = "Galactica";
        naveEspacial1.combustible = 50;

        naveEspacial1.despegar();
        naveEspacial1.mostrarEstado();
        naveEspacial1.avanzar(50);
        naveEspacial1.recargarCombustible(0);
        naveEspacial1.recargarCombustible(15);
        naveEspacial1.mostrarEstado();

    }
}
