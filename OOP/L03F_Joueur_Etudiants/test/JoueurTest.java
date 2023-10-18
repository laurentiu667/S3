import jeu.Joueur;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class JoueurTest {

    Joueur joueurTest;

    @BeforeAll
    public static void setup(){
        System.out.println("===================");
        System.out.println("= DÉBUT DES TESTS =");
        System.out.println("===================");
    }
    @AfterAll
    public static void finTests(){
        System.out.println("=================");
        System.out.println("= FIN DES TESTS =");
        System.out.println("=================");
    }

    @AfterEach
    public void apresChaqueTest(){
        System.out.println("= Test complété =");
    }

    @BeforeEach
    public void initJoueur(){
        this.joueurTest = new Joueur("Laurentiu", 200, 20, "Couteau", 2, "Diamant", 2);
    }

    @Test
    public void testgetCredit(){
        this.joueurTest.setCredits(1000);
        assertEquals(1000, this.joueurTest.getCredits());
    }


}
