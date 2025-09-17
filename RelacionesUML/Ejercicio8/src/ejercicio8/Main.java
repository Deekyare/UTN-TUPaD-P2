
package ejercicio8;

/**
 *
 * @author Sil
 */
public class Main {

    
    public static void main(String[] args) {
         // Crear los objetos
        Documento documento1 = new Documento ("Nombrando las vocales"," a - e - i - o - u ");
        Usuario usuario1 = new Usuario("Silvia G","silvia@giar");
        
       // Agregación: La FirmaDigital se relaciona con el Usuario.
        FirmaDigital firmaDelDocumento = documento1.getFirmaDigital();
        firmaDelDocumento.setUsuario(usuario1);

        // Salidas por consola
        System.out.println(documento1);
        System.out.println("Firma del documento: " + documento1.getFirmaDigital().getCodigoHash());
        System.out.println("Usuario: " + firmaDelDocumento.getUsuario().getNombre());
        System.out.println("La firma digital de: " + firmaDelDocumento.getUsuario().getNombre() + " es " + firmaDelDocumento.getCodigoHash());
    }
}
