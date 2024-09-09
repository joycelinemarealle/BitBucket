package ProjectOOP2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class App {  //testing comment //bacon
    public static void main(String[] args) {

        //booking Menu
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(); //define new hotel objects

        List<RoomType> roomType = new ArrayList<>(); //created array to add rooms
        RoomType roomType1 = new RoomType(150, "Double Standard", 2);
        RoomType roomType2 = new RoomType(200, "Double Deluxe", 2);
        ;
        RoomType roomType3 = new RoomType(300, "Junior Suite", 2);
        RoomType roomType4 = new RoomType(400, "Grand Suite", 2);

        roomType.add(roomType1);
        roomType.add(roomType2);
        roomType.add(roomType3);
        roomType.add(roomType4);

        Room room1 = new Room(1, roomType1);
        Room room2 = new Room(2, roomType1);
        Room room3 = new Room(3, roomType2);
        Room room4 = new Room(4, roomType2);
        Room room5 = new Room(5, roomType3);
        Room room6 = new Room(6, roomType4);

        //adding the rooms to hotel
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);
        hotel.addRoom(room5);
        hotel.addRoom(room6);

        menuHotel1(hotel);
    }

    public static void startingMenu() {
        // System.out.println("Booking for Hotel 1");
        //System.out.println("Booking for Hotel 2");

    }

    public static void menuHotel1(Hotel hotel) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Type 0 to Exit Menu\n" +
                    "Type 1 to start booking\n" +
                    "Type 2 to check in customer\n" +
                    "Type 3 to check out customer\n" +
                    "Type 4 to view final bill");
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                break;
            }
            if (userInput == 1) {
                System.out.println("What type of room would you like to book \n" +
                        "Double Standard, Double Deluxe, Junior Suite, Grand Suite");
                scanner.nextLine();
                String roomTypeInput = scanner.nextLine();
                if (hotel.isRoomAvailable(roomTypeInput)) {
                    Room room = hotel.bookRoomByType(roomTypeInput);
                    scanner.nextLine();
                    System.out.println("What is your customer's first and last name?");
                    String customerNameInput = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("How many people per room? max 2");
                    int numberGuestInput = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("What is the additional guest's first and last name?");
                    String guestNameInput = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("What is your customer's email?");
                    String customerEmailInput = scanner.nextLine();
                    scanner.nextLine();

                    //convert user input to local date
                    System.out.println("What is the checkin Date yyyy-MM-dd");
                    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    String checkInDateInput = scanner.nextLine();
                    LocalDate localcheckIndate = LocalDate.parse(checkInDateInput, formatter1);
                    scanner.nextLine();

                    System.out.println("What is the checkout Date yyyy-MM-dd");
                    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    String checkOutDateInput = scanner.nextLine();
                    LocalDate localcheckOutDate = LocalDate.parse(checkOutDateInput, formatter2);

                    // Create a customer object
                    Customer customer = new Customer(customerNameInput, customerEmailInput);

                    // Add Customer to Hotel customer'slist
                    hotel.addCustomer(customer);

                    // Create a booking!
                    //new booking objects
                    Booking booking = new Booking(customer, room, guestNameInput, localcheckIndate, localcheckOutDate, numberGuestInput);

                    // call the add the cost of the hotel stay
                    booking.costHotelStay();
                    booking.addCostHotelStay();

                    // call the apply discount to hotel stay cost to apply discount when new booking made
                   booking.applyLoyaltyDiscount();

                    //add to hotel
                    hotel.addBooking(booking);

                    System.out.println("Would you like Breakfast? Type b \n");
                    String addOnInput = scanner.nextLine();
                    if (addOnInput.equals("b")) {
                        booking.costOfBreakfast();
                        booking.addCostOfBreakfast();
                    }

                    System.out.println("Would you like Room Service. Type r? \n");
                    addOnInput = scanner.nextLine();
                    if (addOnInput.equals("r")) {
                        booking.costOfRoomService();
                        booking.addCostOfRoomService();
                    }

                    System.out.println("Would you like Laundry . Type l? \n");
                    addOnInput = scanner.nextLine();
                    if (addOnInput.equals("l")) {
                        booking.costOfLaundry();
                        booking.addCostOfLaundry();

                    }

                    System.out.println("Booking successful for:" + customerNameInput + "With room:" + roomTypeInput + "Guests are:" +
                            "This is your Guest" + guestNameInput + "Checkin Date:" + checkInDateInput + "Checkout Date:" +
                            localcheckOutDate + "Total cost after discount is, " + booking.getTotalAmount());


                }
                System.out.println("No available rooms of that Type");

            } else if (userInput == 2) {
                System.out.println(" What is the customer's email address?");
                scanner.nextLine();
                Scanner checkinscanner = new Scanner(System.in);
                String checkInEmailInput = scanner.nextLine();

                if (hotel.isEmailInSystem(checkInEmailInput)) {
                    Booking booking = hotel.checkInCustomer(checkInEmailInput);
                    System.out.println("You successfully checked in");

                } else {
                    System.out.println("Checkin failed. No booking made for the customer with the specified email");
                }

            }
            //user ==3
            else if (userInput == 3) {
                System.out.println(" What is the customer's email address?");
                scanner.nextLine();
                Scanner checkinscanner = new Scanner(System.in);
                String checkOutEmailInput = scanner.nextLine();

                if (hotel.isEmailInSystem(checkOutEmailInput)) {
                    Booking booking = hotel.checkOutCustomer(checkOutEmailInput);
                    System.out.println("You successfully checked out");
                } else {
                    System.out.println("Checkout failed. No booking made for the customer with the specified email");
                }

            } else if (userInput ==4){
                System.out.println("What is the customer's email address?");
                String customerEmail = scanner.nextLine();

                if(hotel.isEmailInSystem(customerEmail)){
                    Booking booking = hotel.findBookingByEmail(customerEmail);
                    System.out.println("the final bill for " + booking.getCustomer().getName() + "is" + booking.getTotalAmount());
                } else{
                    System.out.println("Booking not found for the specified email");
                }
            }

        }
    }
}

/* Loyalty Points Steps
1 Add fields to the Customer class to track loyalty points.Add a field to keep track of the total number of nights stayed
 and a method to calculate the discount.
2 Update the Booking class to add loyalty points upon checkout.
3 Update the Hotel class to calculate discounts based on loyalty points.
4 Update the App class to display and apply discounts during booking.
Complete Booking and Update Loyalty Points: Added booking.updateLoyaltyNights(); in the checkOutCustomer method to update the customer's total nights stayed when they check out.

Calculate Discount: Added a calculateDiscount method to calculate the discount based on the customer's loyalty points.



*/