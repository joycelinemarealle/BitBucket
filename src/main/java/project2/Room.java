package project2;

public class Room {
    private int roomNumber;
    private RoomType roomType;
    private boolean isCleanFlag = true;

    public void setClean(boolean isClean) {
        this.isCleanFlag = true;
    }

    public boolean isClean() {
        return isCleanFlag;
    }
    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public Room(int roomNumber, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomType=" + roomType +
                ", isClean=" + isCleanFlag +
                '}';
    }

    // modify toString to include isAvailable
}
