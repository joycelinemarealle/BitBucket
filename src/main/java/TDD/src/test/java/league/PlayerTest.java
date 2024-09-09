package league;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getName() {
        Player player = new Player ("Joy");
        assertEquals("Joy", player.getName());
    }

    @Test
    void getPhoneNumber() {
        Player player = new Player ("Joy", 123456789);
        assertEquals(123456789, player.getPhoneNumber());
    }

    @Test
    void isFreeAgent() {
        Player player = new Player("Joy");
        assertTrue(player.isFreeAgent());
    }
}