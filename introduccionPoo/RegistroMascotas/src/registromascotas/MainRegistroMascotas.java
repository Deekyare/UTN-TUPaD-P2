package registromascotas;

public class MainRegistroMascotas {

    public static void main(String[] args) {
        //Creación e inicialización de la instancia "Mascotas"
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Orion";
        mascota1.especie = "Gato";
        mascota1.edad = 3;

        //Llamada a los métodos
        mascota1.mostrarInfo();
        mascota1.cumplirAnios(2);
        mascota1.mostrarInfo();
    }
    
}
