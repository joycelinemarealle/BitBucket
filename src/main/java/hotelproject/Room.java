package hotelproject;

public class Room {
    //attributes
    private int roomId;
    private RoomType roomType;
    private boolean isOccupied;
    private boolean isClean;

    public Room(int roomId, RoomType roomType) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.isOccupied = false;
        this.isClean = true;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isClean() {
        return isClean;
    }

    public boolean setClean(boolean clean) {
        isClean = clean;
        return clean;
    }
}




