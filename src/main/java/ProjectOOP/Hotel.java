package ProjectOOP;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    //attributes list of rooms and bookings
   private String name;
    private List<Room> rooms;  //make array that carries elements of type Room
    private List<Booking> bookings;


     //constructor
    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();  // the room objects stored in arrayList that implements List interface
        this.bookings = new ArrayList<>(); //defined here as new ArrayList so not passed as parameters
    }

    //methods
    //to add room in menu
    public void addRoom( Room room){
        rooms.add(room); //rooms array list .method of add and parametr is room of type Room
    }


    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
