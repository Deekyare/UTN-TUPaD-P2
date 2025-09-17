package ejercicio1;

/**
 *
 * @author Sil
 */
public class Pasaporte {

    private String numero;
    private String fechaEmision;

    //Composicion Pasaporte crea y es dueño de la foto
    private Foto foto;

    //Asociacion bidireccional con clase "titular"
    private Titular titular;

    //Constructor que tambien crea al objeto foto
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {

        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); //Aqui se crea la foto 
        // Método para establecer la relación con el titular
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        //Validacion antibucle
         if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    // Getters y Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }


    @Override
    public String toString() {
        return "Pasaporte [numero=" + numero + ", fechaEmision=" + fechaEmision + "]";
    }
}
