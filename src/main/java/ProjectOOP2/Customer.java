package ProjectOOP2;

public class Customer {
    private String name;
    private String email;
    private int totalNightsStayed; //track how many nights stayed to calculate discount


    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.totalNightsStayed = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalNightsStayed() {
        return totalNightsStayed;
    }

    public void setTotalNightsStayed(int totalNightsStayed) {
        this.totalNightsStayed = totalNightsStayed;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Add a field to keep track of the total number of nights stayed and a method to calculate the discount.
    public void addNightsStayed(int nightsStayed){
        this.totalNightsStayed += nightsStayed;
    }

    public double getLoyalDiscount(){
        return Math.min(totalNightsStayed,20)*0.01; //method compares the days to the maximum allowed then * 10% to get discount
    }
}