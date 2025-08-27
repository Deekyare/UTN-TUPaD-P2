package encapsulamiento2;
/*
Crear una clase Libro con atributos privados: titulo, autor,
añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación
para añoPublicacion.
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con
uno válido, mostrar la información final.
*/

public class Libro {
//Atributos privados
    private String titulo = "Harry Potter";
    private String autor = "J.K. Rowling";
    private int anioPublicacion = 1997;


    //Métodos
    //Getters
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAnioPublicacion(){
        return anioPublicacion;
    }

    //Setter para anioPublicación
    public void setAnioPublicacion(int anioPublicacion){
        int anioActual = 2025;
        if (anioPublicacion >= 1500 && anioPublicacion <= anioActual){
            this.anioPublicacion = anioPublicacion;
        }



    }


}
