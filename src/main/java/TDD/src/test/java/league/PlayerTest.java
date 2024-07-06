package league;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getName() {
        Player player = new Player ("Joy");
        assertEquals("Joy", player.getName());
    }
}