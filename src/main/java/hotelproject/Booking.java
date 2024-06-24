package hotelproject;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Booking {
    private Customer customer;
    private Room room;
    private String guest;
    private LocalDate checkIndate;
    private LocalDate checkOutdate;
    private int numberOfGuest;
    private boolean isCheckedIn;
    private boolean isCheckOut;
    private int totalAmount = 0;

    public Booking(Customer customer, Room room, String guest, LocalDate checkIndate, LocalDate checkOutdate, int numberOfGuest) {
        this.customer = customer;
        this.room = room;
        this.guest = guest;
        this.checkIndate = checkIndate;
        this.checkOutdate = checkOutdate;
        this.numberOfGuest = numberOfGuest;
        this.isCheckedIn = false;
        this.isCheckOut = false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
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

    public int getNumberOfGuest() {
        return numberOfGuest;
    }

    public void setNumberOfGuest(int numberOfGuest) {
        this.numberOfGuest = numberOfGuest;
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

    public int costHotelStay() {
        int totalDaysInHotel = (int) ChronoUnit.DAYS.between(checkIndate, checkOutdate);
        int costHotelStay = totalDaysInHotel * this.getRoom().getRoomType().getPrice();
        return costHotelStay;
    }

    public void addCostHotelStay() {
        int totalDaysInHotel = (int) ChronoUnit.DAYS.between(checkIndate, checkOutdate);
        int costHotelStay = totalDaysInHotel * this.getRoom().getRoomType().getPrice();
        totalAmount += costHotelStay;
    }

    public int costOfBreakfast() {
        int totalDaysInHotel = (int) ChronoUnit.DAYS.between(checkIndate, checkOutdate);
        int costOfBreakfast = (10 * totalDaysInHotel * this.getNumberOfGuest());

        return costOfBreakfast;
    }

    public void addCostOfBreakfast() {
        int totalDaysInHotel = (int) ChronoUnit.DAYS.between(checkIndate, checkOutdate);
        int costOfBreakfast = (10 * totalDaysInHotel * this.getNumberOfGuest());

        totalAmount += costOfBreakfast;
    }

    public int costOfRoomService() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many meals for room service?");
        int numberMealInput = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How many people for room service");
        int numberPeopleInput = scanner.nextInt();
        int costOfRoomService = (20 * numberMealInput * numberPeopleInput);
        return costOfRoomService;
    }

    public void addCostOfRoomService() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many meals for room service?");
        int numberMealInput = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How many people for room service");
        int numberPeopleInput = scanner.nextInt();
        int costOfRoomService = (20 * numberMealInput * numberPeopleInput);
        totalAmount += costOfRoomService;
    }

    public int costOfLaundry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items for laundry");
        int laundryItemsInput = scanner.nextInt();
        int costOfLaundryService = (5 * laundryItemsInput);
        return costOfLaundryService;
    }
    public void addCostOfLaundry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items for laundry");
        int laundryItemsInput = scanner.nextInt();
        int costOfLaundryService = (5 * laundryItemsInput);
        totalAmount += scanner.nextInt();
    }

    private int getTotalAmount () {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "customer=" + customer +
                ", room=" + room +
                ", guest='" + guest + '\'' +
                ", checkIndate=" + checkIndate +
                ", checkOutdate=" + checkOutdate +
                ", numberOfGuest=" + numberOfGuest +
                ", isCheckedIn=" + isCheckedIn +
                ", isCheckOut=" + isCheckOut +
                ", totalAmount=" + totalAmount +
                '}';
    }
}


