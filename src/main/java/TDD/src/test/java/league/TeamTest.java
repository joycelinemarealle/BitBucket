package league;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {
    @Test
    void createTeam() {
        Team team = new Team("Lakers", 12345);
        team.createTeam("Lakers", 12345678);
        assertEquals("Lakers", team.getName());
        assertEquals(12345678, team.getPhoneNumber());
    }

    @Test
    void addPlayer() {
        Team team = new Team ("Lakers", 123456789);
        Player player = new Player ("Joy");
        team.addPlayer(player);

        assertTrue(team.getPlayers().contains(player));
    }


    @Test
    void removePlayer() {
        Team team = new Team ("Lakers", 123456789);
        Player player = new Player ("Joy");
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

    @Test

    public void transferPlayerTest(){
        Team teamA = new Team("Lakers", 123);
        Team teamB = new Team ( "Warrior", 456);
        Player player = new Player ("Joy", 789);

        teamA.addPlayer(player); //add player
        teamA.transferPlayer(player,teamB); //removes from A and transfersgit" to team B
        assertTrue(teamB.getPlayers().contains(player));
        assertFalse(teamA.getPlayers().contains(player));


    }
}