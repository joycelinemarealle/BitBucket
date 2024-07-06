package TDDLabs;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private int phoneNumber;
    private List<Player> players;
    private boolean active ;

    public Team(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.players = new ArrayList<>(); //new array
        this.active = true;  //assume active team
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void addPlayer (Player player){
        this.players.add(player);
    }

    public void removePlayer (Player player){
        this.players.remove(player);
    }
}
