package project2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;


public class Hotel {
    private ArrayList<Room> rooms;
    private ArrayList<Customer> customers;
    private ArrayList<Booking> bookings;


    public Hotel(int initialCapacity) {
        rooms = new ArrayList<>(initialCapacity);
        customers = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public void addRoom(int roomNumber, RoomType roomType) {
        Room room = new Room(roomNumber, roomType);
        rooms.add(room);
    }


    public void addCustomer(String customerName, String email) {
        Customer customer = new Customer(customerName, email);
        customers.add(customer);
    }

    public List<Room> getRoomsByType(String roomType) {
        ArrayList<Room> roomsByType = new ArrayList<>();
        for(int i = 0; i < rooms.size(); i++) {
            Room room = rooms.get(i);
            if(room.getRoomType().getName().equals(roomType)) {
                roomsByType.add(room);
            }
        }
        return roomsByType;
    }

    public List<Booking> getBookingsByType(String roomType) {
        ArrayList<Booking> bookingsByType = new ArrayList<>();

        for(Booking booking: bookings) {

            if(booking.getRoom().getRoomType().getName().equals(roomType)) {
                bookingsByType.add(booking);
            }
        }
        return bookingsByType;
    }

    public void addBooking(String custEmail, String roomType, LocalDate checkIn, LocalDate checkOut) {
        // Start out with all rooms by type stored in List available Rooms
        List<Room> availableRooms = getRoomsByType(roomType);
        List<Booking> bookingsByType = getBookingsByType(roomType);

        // If an overlapping booking exists, remove the room from the available rooms list.
        for(Booking booking: bookingsByType) {
            DateRange requestedDates = new DateRange(checkIn, checkOut);
            if(booking.getCheckInCheckOutDates().overlap(requestedDates)) {
                availableRooms.remove(booking.getRoom());
            }
        }

        if(availableRooms.size() > 0) {
            Customer customer = getCustomerByEmail(custEmail);
            Booking newBooking = new Booking(customer, availableRooms.get(0), checkIn, checkOut);
            bookings.add(newBooking);
        }
    }

    public void printBill(String custEmail) {
        for(Booking booking: bookings) {
            System.out.println("Booking Status : " + booking.getBookingStatus());
            if(booking.getCustomer().getEmail().equals(custEmail) && booking.getBookingStatus().equals("CheckedIn")) {
                booking.printBill();
            }
        }
    }
    public void addBreakfast(String custEmail, LocalDate date, int numMeals) {
        for(Booking booking: bookings) {
            if(booking.getCustomer().getEmail().equals(custEmail) && booking.getBookingStatus().equals("CheckedIn")) {
                booking.addBreakfastCharge(date, numMeals, ConstantValues.BREAKFAST);
            }
        }
    }

    public void addRoomService(String custEmail, LocalDate date, int numMeals) {
        for(Booking booking: bookings) {
            if(booking.getCustomer().getEmail().equals(custEmail) && booking.getBookingStatus().equals("CheckedIn")) {
                booking.addRoomServiceCharge(date, numMeals, ConstantValues.ROOMSERVICE);
            }
        }
    }

    public void addLaundryService(String custEmail, LocalDate date, int numItems) {
        for(Booking booking: bookings) {
            if(booking.getCustomer().getEmail().equals(custEmail) && booking.getBookingStatus().equals("CheckedIn")) {
                booking.addLaundryServiceCharge(date, numItems, ConstantValues.LAUNDRY);
            }
        }
    }


    public boolean isRoomAvailable(String roomType, LocalDate checkIn, LocalDate checkOut) {

        // Start out with all rooms by type stored in List available Rooms
        List<Room> availableRooms = getRoomsByType(roomType);
        List<Booking> bookingsByType = getBookingsByType(roomType);

        // If an overlapping booking exists, remove the room from the available rooms list.
        for(Booking booking: bookingsByType) {
            DateRange requestedDates = new DateRange(checkIn, checkOut);
            if(booking.getCheckInCheckOutDates().overlap(requestedDates)) {
                availableRooms.remove(booking.getRoom());
            }
        }

        if(availableRooms.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isRoomClean(String custEmail) {
        for(Booking booking: bookings) {
            if(booking.getCustomer().getEmail().equals(custEmail) &&
                    booking.getBookingStatus().equals("Booked") &&
                    booking.getRoom().isClean()) {
                return true;
            }
        }
        return false;
    }

    public void cleanRoomForCustomer(String custEmail) {
        for(Booking booking: bookings) {
            if(booking.getCustomer().getEmail().equals(custEmail) &&
                    booking.getBookingStatus().equals("Booked")) {
                booking.getRoom().setClean(true);
                return;
            }
        }

    }
    public boolean checkIn(String custEmail) {
        for(Booking booking: bookings) {
            if(booking.getCustomer().getEmail().equals(custEmail) && booking.getBookingStatus().equals("Booked")) {
                booking.checkIn();
                return true;
            }
        }
        return false;
    }

    public boolean checkOut(String custEmail, boolean needsClean) {
        for(Booking booking: bookings) {
            if(booking.getCustomer().getEmail().equals(custEmail) && booking.getBookingStatus().equals("CheckedIn")) {
                booking.setBookingStatus("CheckedOut");
                // clean room if necessary
                booking.getRoom().setClean(needsClean);

                LocalDate checkIn = booking.getCheckInDate();
                LocalDate checkOut = booking.getCheckOutDate();
                long daysStayed = checkIn.until(checkOut, ChronoUnit.DAYS);

                long loyaltyPoints = booking.getCustomer().getLoyaltyPoints() + daysStayed;
                booking.getCustomer().setLoyaltyPoints(loyaltyPoints);

                return true;
            }
        }
        return false;
    }
    public Customer getCustomerByEmail(String custEmail) {
        for(Customer customer: customers) {
            if(customer.getEmail().equals(custEmail)) {
                return customer;
            }
        }
        return null;
    }

    public void updateRoomRate(String roomType, double newRate) {
        for(Room room: rooms) {
            if(room.getRoomType().getName().equals(roomType)) {
                room.getRoomType().setPrice(newRate);
            }
        }
    }
    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + rooms +
                ", customers=" + customers +
                ", bookings=" + bookings +
                '}';
    }
}



