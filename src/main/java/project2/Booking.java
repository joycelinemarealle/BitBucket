package project2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {


    private Customer customer;
    private Room room;
    private DateRange checkInOutDates;
    private double roomPrice;
    private List<Charge> charges = new ArrayList<>();
    private String bookingStatus = "Booked";  // Booking Status can be : Booked, CheckedIn, CheckedOut

    public Booking(Customer customer, Room room, LocalDate checkInDate, LocalDate checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInOutDates = new DateRange(checkInDate, checkOutDate);

        for (LocalDate date = checkInDate; date.isBefore(checkOutDate); date = date.plusDays(1))
        {
            double discount = (double) customer.getLoyaltyPoints() / 100   * this.room.getRoomType().getPrice();
            double newPrice = this.room.getRoomType().getPrice() - discount;
            Charge charge = new Charge(date, "RoomCharge", newPrice);
            charges.add(charge);
        }

    }

    public void checkIn() {
        bookingStatus = "CheckedIn";
    }

    public void addBreakfastCharge(LocalDate date, int numOfPeople, double price) {
        Charge charge = new Charge(date, "Breakfast", price * numOfPeople);
        charges.add(charge);

    }

    public void addRoomServiceCharge(LocalDate date, int numOfMeals, double price) {
        Charge charge = new Charge(date, "Room Service", price * numOfMeals);
        charges.add(charge);
    }

    public void addLaundryServiceCharge(LocalDate date, int numOfItems, double price) {
        Charge charge = new Charge(date, "Laundry Service", price * numOfItems);
        charges.add(charge);
    }
    public void printBill() {
        System.out.println("Below are the charges for: " + customer.getCustomerName());

        for(Charge charge : charges) {
            System.out.println(charge);
        }
    }
    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public DateRange getCheckInCheckOutDates() {
        return checkInOutDates;
    }
    public LocalDate getCheckInDate() {
        return checkInOutDates.getStartDate();
    }

    public LocalDate getCheckOutDate() {
        return checkInOutDates.getEndDate();
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "customer=" + customer +
                ", room=" + room +
                ", checkInDate=" + checkInOutDates.getStartDate() +
                ", checkOutDate=" + checkInOutDates.getEndDate() +
                ", bookingStatus=" + bookingStatus +
                '}';
    }
}

record Charge(LocalDate date, String type, double charge) {}
