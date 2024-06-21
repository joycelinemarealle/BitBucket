package ProjectOOP;

public class Room {
    //attribute
    private String roomType;
    private double price;

    //constructor

    public Room(String roomType, double price) {
        this.roomType = roomType;
        this.price = price;
    }

    //getters and setters

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Override to String

    @Override
    public String toString() {
        return "Room{" +
                "roomType='" + roomType + '\'' +
                ", price=" + price +
                '}';
    }
}
