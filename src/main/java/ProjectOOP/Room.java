package ProjectOOP;

public class Room {
    //attributes of room
    private int roomId;
    private RoomType roomType;
    private boolean isOccupied;

//constructor

    public Room(int roomId, RoomType roomType) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.isOccupied = false; //set up default so do not need to pass it as parameter
    }


    //Getters and setters

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

    public boolean getOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }


    //Override to String
    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", roomType=" + roomType +
                ", isOccupied=" + isOccupied +
                '}';
    }
}

