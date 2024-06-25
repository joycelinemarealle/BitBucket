package ProjectOOP2;

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
    private int totalAmount = 0; //total bill initial is zero

    //define prices for additional services
    private static final int BREAKFAST_COST_PER_DAY =10;
    private static  final int ROOM_SERVICE_COST_PER_MEAL = 20;
    private static final int LAUNDRY_COST_PER_ITEM = 5;


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
        int costOfBreakfast = (BREAKFAST_COST_PER_DAY * totalDaysInHotel * this.getNumberOfGuest());
        return costOfBreakfast;
    }

    public void addCostOfBreakfast() {
        int totalDaysInHotel = (int) ChronoUnit.DAYS.between(checkIndate, checkOutdate);
        int costOfBreakfast = (BREAKFAST_COST_PER_DAY* totalDaysInHotel * this.getNumberOfGuest());
        totalAmount += costOfBreakfast;
    }

    public int costOfRoomService() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many meals for room service?");
        int numberMealInput = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How many people for room service");
        int numberPeopleInput = scanner.nextInt();
        int costOfRoomService = (ROOM_SERVICE_COST_PER_MEAL* numberMealInput * numberPeopleInput);
        return costOfRoomService;
    }

    public void addCostOfRoomService() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many meals for room service?");
        int numberMealInput = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How many people for room service");
        int numberPeopleInput = scanner.nextInt();
        int costOfRoomService = (ROOM_SERVICE_COST_PER_MEAL * numberMealInput * numberPeopleInput);
        totalAmount += costOfRoomService;
    }

    public int costOfLaundry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items for laundry");
        int laundryItemsInput = scanner.nextInt();
        int costOfLaundryService = (LAUNDRY_COST_PER_ITEM * laundryItemsInput);
        return costOfLaundryService;
    }
    public void addCostOfLaundry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items for laundry");
        int laundryItemsInput = scanner.nextInt();
        int costOfLaundryService = (LAUNDRY_COST_PER_ITEM* laundryItemsInput);
        totalAmount += scanner.nextInt();
    }

    public int getTotalAmount () {
        return totalAmount;
    }

    //apply Loyalty discount
    public void applyLoyaltyDiscount(){
        double discount = customer.getLoyalDiscount();
        totalAmount -= (int) (totalAmount * discount); //totalAmount is final bill - totalAmount *discount //change to int since totlaamount defined as int
    }

    //call method from customer that updates number of days stayed during checkouts for future reference
    public void updateCustomerLoyaltyNights(){
        int nightsStayed = (int) ChronoUnit.DAYS.between(checkIndate, checkOutdate);
        customer.addNightsStayed(nightsStayed);
    }

    @Override
    public
    String toString() {
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