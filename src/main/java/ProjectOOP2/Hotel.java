package ProjectOOP2;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Booking> bookingList;
    private List<Customer> customerList;
    private List<Room> roomList;
    private final LocalTime checkInStartTime = LocalTime.of(15,0); //3pm
    private final LocalTime checkOutEndTime = LocalTime.of(12,0); //12pm

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
        LocalTime now = LocalTime.now(); //gets current local time
        if(now.isBefore(checkInStartTime)){ //checks if current time is before the set check in start time
            System.out.println("Check-in is only allowed after 3pm");
            return null; // returns null if check in not successful
        }

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
//    public boolean isEmailInSystem2(String checkOutEmailInput) {
//        for (int i = 0; i < bookingList.size(); i++) {
//            Booking booking = bookingList.get(i);
//            if (booking.getCustomer().getEmail().equals(checkOutEmailInput)) {
//                return true;
//            }
//        }
//        return false;
//    }

    public Booking checkOutCustomer(String checkOutEmailInput) {
        LocalTime now = LocalTime.now(); //gets current time
        if(now.isBefore(checkOutEndTime)){ //checks if current time is before set checkOut End time
            System.out.println("Late checkout! Additional fees apply");
        }
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

//    //method to find booking by email
 public Booking findBookingByEmail(String customerEmail){
     for (int i = 0; i < bookingList.size(); i++){
         Booking booking = bookingList.get(i);
         if ( booking.getCustomer().getEmail().equals(customerEmail)){
          return booking;
          }
      }
      return null;
   }

   //method to calculate discount based on loyalty points

    public double calculateDiscount (Customer customer){
        return customer.getLoyalDiscount();
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