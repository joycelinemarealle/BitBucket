package hotelproject;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Booking> bookingList;
    private List<Customer> customerList;
    private List<Room> roomList;

    //checkin time
    //checkout time

    //collection of booking, customer, rooms

    public Hotel() {
        this.bookingList = new ArrayList<>();
        this.customerList = new ArrayList<>();
        this.roomList = new ArrayList<>();
    }

    //add add method
    public void addRoom(Room room) {
        roomList.add(room); //call method adds room into array called roomList
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer); //call method adds room into array called roomList
    }

    public boolean isRoomAvailable(String roomType) {

        for (int i = 0; i < roomList.size(); i++) {
            Room room = roomList.get(i);
            if (room.getRoomType().getType().equals(roomType)) {
                return true;
            }
        }
        return false;
    }

    public Room findRoomByType(String roomType) {

        for (int i = 0; i < roomList.size(); i++) {
            Room room = roomList.get(i);
            if (room.getRoomType().getType().equals(roomType)) {
                room.setOccupied(true);
                return room;
            }
        }
        return null;
    }
}
