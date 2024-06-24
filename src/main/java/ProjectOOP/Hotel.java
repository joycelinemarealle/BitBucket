package ProjectOOP;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    //attributes list of rooms and bookings
    private String name;
    private List<Room> roomList;  //make array that carries elements of type Room
    private List<Booking> bookingList;
    private List<Customer> customerList;


    //constructor
    public Hotel(String name) {
        this.name = name;
        this.roomList = new ArrayList<>();  // the room objects stored in arrayList that implements List interface
        this.bookingList = new ArrayList<>(); //defined here as new ArrayList so not passed as parameters
        this.customerList = new ArrayList<>(); //capturers new customers coming to hotels
    }


    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRooms() {

        return roomList;
    }

    public void setRooms(List<Room> roomList) {

        this.roomList = roomList;
    }

    public List<Booking> getBookings() {

        return bookingList;
    }

    public void setBookings(List<Booking> bookings) {

        this.bookingList = bookings;
    }

    //Method to manage/add room in roomList
    public void addRoom(Room room) {
        roomList.add(room); //adds room of type Room into array called roomList

    }

    //Method to add customers to customerList
    public void addCustomers(Customer customer) {
        customerList.add(customer);
    }

    //Method to add booking to bookingList
    public void addBooking(Booking booking) {

        bookingList.add(booking);
    }


    //method checks all rooms in the roomList array if available
    public boolean isRoomAvailable(String roomTypeInput) {
        for (int i = 0; i < roomList.size(); i++) {
            Room room = roomList.get(i); //goes through the roomList and view every element which is a room of Type Room
            if (room.getRoomType().getType().equals(roomTypeInput)) { //compares what receptionist input to what is in the system. Back trace where type of room defined
                return true;
            }
        }
        return false; //if not available return false

    }


    //method to book room if available
    public Room bookRoomIfAvailable(String roomTypeInput) {  //return is a room of Type Room
        //check each room in the roomList
        for (int i = 0; i < roomList.size(); i++) {
            Room room = roomList.get(i);
            if (room.getRoomType().getType().equals(roomTypeInput)) {
                room.setOccupied(true); //booking so now room occupied
                return room;
            }
        }
        return null; //captures bothe scenario when room to book and when not

    }

    //method to checkin

    public void checkIn(String bookingIdInput) {
        //1.Check bookingId if it already exists in the bookingList
        for (int i = 0; i < bookingList.size(); i++) {
            Booking booking = bookingList.get(i); //each element is a booking of type Booking are in bookingList
            if (booking.getBookingId().equals(bookingIdInput)) {    //2 Compare bookingId in system  to the id receptionist type in
                if (!booking.isCheckedIn()) {      //3 Check if guest has not checked in yet
                    booking.setCheckedIn(true);    //4 Update booking status to checked in using setCheckedin
                    System.out.println("Customer has check-in out successfully");
                } else {
                    System.out.println("CheckedIn failed. The guest has already checked in"); //Guest has already checked in
                    return; //exit the method after reporting failure
                }

            }
            }
        //captures both scenarios. if booking id does not match
        System.out.println("check-in failed. The booking Id does not exit");
        }



    //method to checkout
    public void checkOut(String bookingId) {
        for (int i = 0; i < bookingList.size(); i++) {  //1 Check booking id in booking list
            Booking booking = bookingList.get(i); //checks every booking in the bookingList
            if (booking.getBookingId().equals(bookingId)) {   //2 check if booking id in matches what receptionist has typed in
                if (!booking.isCheckedOut()) {    //3 check if guest has already checked out
                    booking.setCheckedOut(true);  //4 update booking status if condition met
                    System.out.println("Customer has checked out successfully");
                    return; //Exit the method after successful checkin. Breaks out of loop
                } else {
                    System.out.println("Check-out failed. The guest has already checked out");
                    return; //exit the method after reporting failure. Breaks out of loop
                }

            }
        }

        System.out.println("Check-out failed. The booking ID does not exist");
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", roomList=" + roomList +
                ", bookingList=" + bookingList +
                ", customerList=" + customerList +
                '}';
    }
}
