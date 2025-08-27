package encapsulamiento2;

/*
Intentar modificar el año con un valor inválido y luego con
uno válido, mostrar la información final.
*/

public class MainLibro {
    
 public static void main(String[] args) {
     
        //Creación de la instancia "Libro"
         Libro libro1 =  new Libro();

        libro1.getTitulo();
        libro1.getAutor();
        libro1.getAnioPublicacion();

        System.out.println("--- Datos del libro ---"+ "\nNombre: "+libro1.getTitulo()+ "\nAutor: "+libro1.getAutor()+"\nAño: "+libro1.getAnioPublicacion());

        libro1.setAnioPublicacion(-200);

        System.out.println("--- Datos del libro con valor invalido ---"+ "\nNombre: "+libro1.getTitulo()+ "\nAutor: "+libro1.getAutor()+"\nAño: "+libro1.getAnioPublicacion());

        libro1.setAnioPublicacion(2020);

        System.out.println("--- Datos del libro con valor valido ---"+ "\nNombre: "+libro1.getTitulo()+ "\nAutor: "+libro1.getAutor()+"\nAño: "+libro1.getAnioPublicacion());

    }
}
