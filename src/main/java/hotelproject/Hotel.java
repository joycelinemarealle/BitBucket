package hotelproject;

import java.awt.print.Book;
import java.time.temporal.ChronoUnit;
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

    public void addBooking(Booking bookings) {
        bookingList.add(bookings); //call method adds room into array called roomList
    }


    public boolean isRoomAvailable(String roomTypeInput) {

        for (int i = 0; i < roomList.size(); i++) {
            Room room = roomList.get(i);
            if (room.getRoomType().getType().equals(roomTypeInput) && !room.isOccupied()) { //room available if not occupied and also is clean
                return true;
            }
        }
        return false;
    }

    public Room bookRoomByType(String roomTypeInput) {
        for (int i = 0; i < roomList.size(); i++) {
            Room room = roomList.get(i);
            if (room.getRoomType().getType().equals(roomTypeInput) && !room.isOccupied()  ) { //room available if not occupied
                room.setOccupied(true);
                return room;
            }
        }
        return null;
    }

    public boolean isEmailInSystem(String checkInEmailInput) {
        for (int i = 0; i < bookingList.size(); i++) {
            Booking booking = bookingList.get(i);
            if (booking.getCustomer().getEmail().equals(checkInEmailInput)) {
                return true;
            }
        }
        return false;
    }

    public Booking checkInCustomer(String checkInEmailInput) {
        for (int i = 0; i < bookingList.size(); i++) {
            Booking booking = bookingList.get(i);
            if (booking.getCustomer().getEmail().equals(checkInEmailInput) ) {
                if(! booking.getRoom().isClean()) {
                    System.out.println("Cleaning is necessary! Staff is cleaning room before Customer checks in.");
                    booking.getRoom().setClean(true);
                }
                booking.setCheckedIn(true);
                return booking;
            }
        }
        return null;
    }
    public boolean isEmailInSystem2(String checkOutEmailInput) {
        for (int i = 0; i < bookingList.size(); i++) {
            Booking booking = bookingList.get(i);
            if (booking.getCustomer().getEmail().equals(checkOutEmailInput)) {
                return true;
            }
        }
        return false;
    }

    public Booking checkOutCustomer(String checkOutEmailInput) {
//        double diff = ChronoUnit.DAYS.between(b.getCheckIndate(), b.getCheckOutdate());
        for (int i = 0; i < bookingList.size(); i++) {
            Booking booking = bookingList.get(i);
            if (booking.getCustomer().getEmail().equals(checkOutEmailInput)) {
                booking.setCheckOut(true);
                booking.getRoom().setClean(false); //dirty needs to be cleaned
                return booking;
            }
        }
        return null;
    }

    //method to find customer to calculate loyalty
    public Booking findBookingByEmail(String customerEmailInput) {
        for (int i = 0; i < bookingList.size(); i++) {
            Booking booking = bookingList.get(i);
            if (booking.getCustomer().getEmail().equals(customerEmailInput)) {
                return booking;
            }
        }
        return null;
    }


    //calculate days if email in booking
//    public int calculateBookingCost(Booking booking) {
//        Booking booking = findBookingByEmail(customerEmailInput);
//        if(booking != null) {
//            int nightsStay = booking.calculateNightsStayed();
//        }
//    }

    //calculate discount
    public  double calculateDiscount (Booking booking) {
        // double bookingCost = booking.getTotalAmount();
        int nightsStayed = booking.getCustomer().getLoyaltyPoint();
        double discount = 0.0;
        if (nightsStayed >= 20) {
            discount = 0.20;  //20% cap
        } else {
            discount = nightsStayed * 0.01; //1% discount per day
        }
        return discount;
    }

    //apply discount to final bill
    public double applyDiscount(Booking booking, String customerEmailInput){
        double discount = calculateDiscount(booking);
        double total = booking.getTotalAmount();
        double finalAmount = total - (total * discount);
        booking.getCustomer().setLoyaltyPoint(0);
        return finalAmount;

    }


    @Override
    public String toString() {
        return "Hotel{" +
                "bookingList=" + bookingList +
                ", customerList=" + customerList +
                ", roomList=" + roomList +
                '}';
    }
}

