package introduccion.poo.RegistroMascotas;

public class mascotaMain {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Orion";
        mascota1.especie = "Gato";
        mascota1.edad = 3;

        //Métodos
        mascota1.mostrarInfo();
        mascota1.cumplirAnios(2);
        mascota1.mostrarInfo();
    }
}
