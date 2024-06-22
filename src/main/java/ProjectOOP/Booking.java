package ProjectOOP;

import java.time.LocalDate;
import java.util.UUID;

public class Booking {

    //attributes
    private String bookingId; //unique identity per booking for easy reference
    private Customer customer; //links customer to booking
    private Room room; //links room to booking
    private String guestName; //tracks another guest who is not the registered customer
    private String checkInDate;
    private String checkOutDate;
//missing cost of booking?? + change local date
    //constructor

    public Booking( Customer customer,Room room, String guestName, String checkOutDate, String checkInDate) {
        this.bookingId = UUID.randomUUID().toString(); //universal unique identifier UUID so randomly generated and converted to string
        this.guestName = guestName;
        this.room = room;
        this.customer = customer;
        this.checkOutDate = checkOutDate;
        this.checkInDate = checkInDate;
    }


    //Getters and Setters

    public String getBookingId() {

        return bookingId;
    }

    public void setBookingId(String bookingId) {

        this.bookingId = bookingId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {

        this.guestName = guestName;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {

        this.room = room;
    }

    public Customer getCustomer() {

        return customer;
    }

    public void setCustomer(Customer customer) {

        this.customer = customer;
    }

    public String getCheckInDate() {

        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {

        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {

        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {

        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", customer=" + customer +
                ", room=" + room +
                ", guestName='" + guestName + '\'' +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                '}';
    }
}
