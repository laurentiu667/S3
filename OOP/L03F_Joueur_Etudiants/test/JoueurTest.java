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
        this.joueurTest = new Joueur("Laurentiu", 1000, 20, "Couteau", 2, "Diamant", 2);
    }

    @Test  // Test 1.
    public void testGetCredits(){
        this.joueurTest.setCredits(1000);
        assertEquals(1000, joueurTest.getCredits());
    }


    @Test // Test 2.a
    public void testCoutAmeliorerArmureNiveauPositif(){
        assertEquals(30, joueurTest.coutAmeliorerArmure(10));
    }

    @Test  // Test 2.b
    public void testCoutAmeliorerArmureNiveauNul(){
        assertEquals(0, joueurTest.coutAmeliorerArmure(0));
    }

    @Test // Test 2.c
    public void testCoutAmeliorerArmureNiveauNegatif(){
        assertEquals(30, joueurTest.coutAmeliorerArmure(-10));
    }


}
