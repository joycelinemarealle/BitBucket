package TDDLabs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerTest {

    @Test
    public void getName() {
        Player player1 = new Player(" Joy ");
        assertEquals("Joy", player1.getName());
    }
}
