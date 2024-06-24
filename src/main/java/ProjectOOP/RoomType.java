package ProjectOOP;

public class RoomType {
    private double price;
    private String type;
    private int capacity;

//constructor

    public RoomType(double price, String type, int capacity) {
        this.price = price;
        this.type = type;
        this.capacity = capacity;
    }

    //getters and setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
