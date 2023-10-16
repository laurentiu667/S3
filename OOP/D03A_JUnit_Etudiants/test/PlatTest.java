import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import plats_prepares.Plat;
import plats_prepares.Plat.*;

public class PlatTest {
    @Test
    public void testNomEstValide(){
        Plat platTest = new Plat();
        assertEquals(true, platTest.isNomValide("Lasagne"));
    }

    @Test
    public void testNomEstValide2(){
        Plat platTest = new Plat();
        assertEquals(true, platTest.isNomValide("Lalasagneacharlenestpasbonne"));
    }

}
