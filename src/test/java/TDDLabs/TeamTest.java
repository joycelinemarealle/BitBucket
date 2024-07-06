package TDDLabs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeamTest {

    @Test
    public void createTeamTest() {
        Team team = new Team ("Lakers", 123456789);
        assertEquals( "Lakers", team.getName());
        assertEquals( 123456789, team.getPhoneNumber());
    }

    @Test
    public void addPlayerTest(){
        Team team = new Team ("Lakers", 123456789);
        Player player = new Player("Joy" ,123456789);
        team.addPlayer(player);
        assertTrue(team.getPlayers().contains(player));
    }

    @Test
    public void removePlayerTest(){
        Team team = new Team ("Lakers", 123456789);
        Player player = new Player ("Joy", 123456789);
        team.addPlayer(player);
        team.removePlayer(player);
        assertFalse(team.getPlayers().contains(player)); //check that player not in players list
    }

    @Test
    public void markInactiveTest(){
        Team team = new Team ("Lakers", 123456789);
        team.setActive(false); //intial active is true so set to false then test
        assertFalse(team.isActive());
    }

    @Test
    public void restoreInactiveTest(){
        Team team = new Team("Lakers", 123456789);
        team.setActive(false); //set to false to show inactive then true and test
        team.setActive(true);
        assertTrue(team.isActive());
    }


}
