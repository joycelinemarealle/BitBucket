package hotelproject;

public class Customer {
    private String name;
    private String email;
    private int loyaltyPoint;


    public void addLoyaltyPoints(int points) {
        this.loyaltyPoint += points;
    }
    public int getLoyaltyPoint() {
        return loyaltyPoint;
    }
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLoyaltyPoint(int loyaltyPoint) {
        this.loyaltyPoint = loyaltyPoint;
    }

    //methods to calcu
}
