package project2;

public class Customer {
    private String customerName;
    private String email;
    private String guestName;

    private long loyaltyPoints;

    public Customer(String customerName, String email) {
        this.customerName = customerName;
        this.email = email;
        this.guestName = null;
        this.loyaltyPoints = 0;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setLoyaltyPoints(long loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public long getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", guestName='" + guestName + '\'' +
                '}';
    }
}

