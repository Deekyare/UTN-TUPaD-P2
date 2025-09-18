
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
        FirmaDigital firma1 = new FirmaDigital("@1234","15/09/2025", usuario1);
        
       // Agregación: La FirmaDigital se relaciona con el Usuario.
       documento1.setFirmaDigital(firma1);
     

        // Salidas por consola
        System.out.println(documento1);
        System.out.println("Firma del documento Hash: " + documento1.getFirmaDigital().getCodigoHash());
        System.out.println("Usuario: " + usuario1.getNombre());
        System.out.println("La firma digital de: " + firma1.getUsuario().getNombre() + " es " + firma1.getCodigoHash());
    }
}
