package league;

public class Player {
    private String name;
    private int phoneNumber;
    private boolean freeAgent;


    public Player(String name) {
        this.name = name;
        this.freeAgent = true; //set true initially
    }

    public Player(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.freeAgent = true; //set true initially
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

    public boolean isFreeAgent() {
        return freeAgent;
    }

    public void setFreeAgent(boolean freeAgent) {
        this.freeAgent = freeAgent;
    }

}
