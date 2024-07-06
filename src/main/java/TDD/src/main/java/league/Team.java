package league;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private int phoneNumber;
    private List<Player> players;
    private boolean isActive;

    public Team(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.players = new ArrayList<>();
        this.isActive = true; //assume team is active
    }


    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    //method
    public void createTeam(String name, int phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void addPlayer(Player player){
        players.add(player);

    }

    public void removePlayer(Player player){
        players.remove(player);
    }

    public void transferPlayer(Player player, Team toTeam){
        this.removePlayer(player); //this is instance of team
        toTeam.addPlayer(player);
    }
}
