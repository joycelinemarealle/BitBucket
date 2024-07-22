import gilts.Gilt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GiltTest {

    @Test
    void createGiltCheckPrincipal() {
        Gilt g = new Gilt(1.25, 100.00, 20);
        assertEquals(100.00, g.getPrincipal(),0.01);
    }
}
