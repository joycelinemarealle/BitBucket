package ProjectOOP;

import java.time.LocalDate;

public class Booking {

    //attributes
    private int bookingId; //unique identity per booking for easy reference
    private String guestName; //tracks another guest who is not the registered customer
    private Room room; //links room to booking
    private Customer customer; //links customer to booking
    private LocalDate checkinDate;
    private LocalDate checkoutDate;

    //constructor

    public Booking(int bookingId, String guestName, Room room, Customer customer, LocalDate checkinDate, LocalDate checkoutDate) {
        this.bookingId = bookingId;
        this.guestName = guestName;
        this.room = room;
        this.customer = customer;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    //Getters and Setters

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
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

    public LocalDate getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(LocalDate checkinDate) {
        this.checkinDate = checkinDate;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }
}
