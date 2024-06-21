package ProjectOOP;

public class Room {
    //attributes of room
    private int roomId;
    private String roomType;
    private double price;
    private boolean isBooked;

//constructor

    public Room(int roomId, String roomType, double price) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.isBooked = false; //set up default so do not need to pass it as parameter
        this.price = price;
    }

    //Getters and setters
    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

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

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    //Override to String

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                ", isBooked=" + isBooked +
                '}';
    }
}

