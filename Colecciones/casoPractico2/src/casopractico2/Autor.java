package casopractico2;

/**
 *
 * @author Sil
 */
public class Autor {
    
    private String id;
    private String nombre;
    private String nacionalidad;
    
    //Constructor 
    public Autor(String id, String nombre, String nacionalidad){
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad; 
    }

    //Muestra la información del autor en consola
    public void mostrarInfo() {
        System.out.println("Autor:  Id = " + id + ", Nombre: " + nombre + ", Nacionalidad: " + nacionalidad);
    }

    @Override
    public String toString() {
        return "\nAutor: id" + id + ", Nombre: " + nombre + ", Nacionalidad: " + nacionalidad;
    }
    
    
}
