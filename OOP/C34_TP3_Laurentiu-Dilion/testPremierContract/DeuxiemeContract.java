import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import codes_secrets.ChiffrementChaine;
public class DeuxiemeContract {

    @BeforeAll
    public static void setup() {
        System.out.println("===================");
        System.out.println("= DÉBUT DES TESTS =");
        System.out.println("===================");
    }

    @AfterAll
    public static void finTests() {
        System.out.println("=================");
        System.out.println("= FIN DES TESTS =");
        System.out.println("=================");
    }

    @AfterEach
    public void apresChaqueTest() {
        System.out.println("= Test complété =");
    }

    @Test
    public void testChiffrer() {
        ChiffrementChaine chiffreur = new ChiffrementChaine();
        chiffreur.setChaineAChiffrer("Bonjour");
        chiffreur.setCleChiffrement(5);

        String chaineChiffree = chiffreur.chiffrer(chiffreur.getChaineAChiffrer(), chiffreur.getCleChiffrement());
        assertEquals("Gtsqtwm", chaineChiffree);
    }

    @Test
    public void testDeChiffrer() {
        ChiffrementChaine chiffreur = new ChiffrementChaine();
        String chaineDechiffree;
        chiffreur.setChaineADechiffrer("Gtsqtwm"); // Définissez la chaîne à déchiffrer
        chiffreur.setCleChiffrement(5);
        chaineDechiffree = chiffreur.dechiffrer(chiffreur.getChaineADechiffrer(), chiffreur.getCleChiffrement());
        assertEquals("Bonjour", chaineDechiffree);
    }


}
