package hotelproject;

import java.time.LocalDate;

public class Booking {
    private Customer customer;
    private Room rooms;
    private String guest;
    private LocalDate checkIndate;
    private LocalDate checkOutdate;
    private boolean isCheckedIn;
    private boolean isCheckOut;

    public Booking(Customer customer, Room rooms, String guest, LocalDate checkIndate, LocalDate checkOutdate) {
        this.customer = customer;
        this.rooms = rooms;
        this.guest = guest;
        this.checkIndate = checkIndate;
        this.checkOutdate = checkOutdate;
        this.isCheckedIn = false;
        this.isCheckOut = false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRooms() {
        return rooms;
    }

    public void setRooms(Room rooms) {
        this.rooms = rooms;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public LocalDate getCheckIndate() {
        return checkIndate;
    }

    public void setCheckIndate(LocalDate checkIndate) {
        this.checkIndate = checkIndate;
    }

    public LocalDate getCheckOutdate() {
        return checkOutdate;
    }

    public void setCheckOutdate(LocalDate checkOutdate) {
        this.checkOutdate = checkOutdate;
    }

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        isCheckedIn = checkedIn;
    }

    public boolean isCheckOut() {
        return isCheckOut;
    }

    public void setCheckOut(boolean checkOut) {
        isCheckOut = checkOut;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "customer=" + customer +
                ", rooms=" + rooms +
                ", guest='" + guest + '\'' +
                ", checkIndate=" + checkIndate +
                ", checkOutdate=" + checkOutdate +
                ", isCheckedIn=" + isCheckedIn +
                ", isCheckOut=" + isCheckOut +
                '}';
    }
}
