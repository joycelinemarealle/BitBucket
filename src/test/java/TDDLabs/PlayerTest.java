package TDDLabs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerTest {

    @Test
    public void getName() {
        Player player = new Player(" Joy ");
        assertEquals("Joy", player.getName());
    }

    @Test
    public void getPhoneNumber() {
        Player player = new Player("Joy", 123456789);
        assertEquals(123456789, player.getPhoneNumber());

    }

    @Test
    public void isFreeAgent() {
        Player player = new Player("Joy");
        assertEquals( true,  player.isFreeAgent());
    }

}
