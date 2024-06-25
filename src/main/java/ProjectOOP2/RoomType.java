package ProjectOOP2;

public class RoomType {
    private int price;
    private String type;
    private int capacity;

    public RoomType(int price, String type, int capacity) {
        this.price = price;
        this.type = type;
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
