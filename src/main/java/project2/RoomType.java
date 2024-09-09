package project2;

public class RoomType {
    private String name;
    private Double price;
    private int capacity;

    public RoomType(String name, Double price, int capacity) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", capacity=" + capacity +
                '}';
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
