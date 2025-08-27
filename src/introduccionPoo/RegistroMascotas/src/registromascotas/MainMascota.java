package registromascotas;

public class MainMascota {
    public static void main(String[] args) {
        //Creación e inicialización de la instancia "Mascotas"
        Mascotas mascota1 = new Mascotas();
        mascota1.nombre = "Orion";
        mascota1.especie = "Gato";
        mascota1.edad = 3;

        //Llamada a los métodos
        mascota1.mostrarInfo();
        mascota1.cumplirAnios(2);
        mascota1.mostrarInfo();
    }
}