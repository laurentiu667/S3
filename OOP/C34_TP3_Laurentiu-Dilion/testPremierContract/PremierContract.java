import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import validations_speciales.Validation;

public class PremierContract {

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
    public void testValidationCodeClientValide() {
        assertTrue(Validation.validerCodeClient("ABC12345678"));
    }

    @Test
    public void testValidationCodeClientInvalide() {
        assertFalse(Validation.validerCodeClient("XYZ98765432# "));
    }

    @Test
    public void testValidationNumeroDeSerieValide() {
        assertTrue(Validation.validerNumeroDeSerie("DEF567890-G"));
    }

    @Test
    public void testValidationNumeroDeSerieInvalide() {
        assertFalse(Validation.validerNumeroDeSerie("PQR123456  "));
    }

    @Test
    public void testValidationTelephoneValide() {
        assertTrue(Validation.validerTelephone("(123)456-7890"));
    }

    @Test
    public void testValidationTelephoneInvalide() {
        assertFalse(Validation.validerTelephone("[456] 789-0123 "));
    }
}