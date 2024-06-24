package hotelproject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {  //testing comment //bacon
    public static void main(String[] args) {

    //booking Menu
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(); //define new hotel objects
       // do




        List<RoomType> roomType = new ArrayList<>(); //created array to add rooms
        RoomType roomType1 = new RoomType(150, "Double Standard", 2);
        RoomType roomType2 = new RoomType(200, "Double Deluxe", 2);;
        RoomType roomType3 = new RoomType(300, "Junior Suite", 2);
        RoomType roomType4 = new RoomType(400, "Grand Suite", 2);

        roomType.add(roomType1);
        roomType.add(roomType2);
        roomType.add(roomType3);
        roomType.add(roomType4);



        Room room1 = new Room(1, roomType1);
        Room room2 = new Room(1, roomType1);
        Room room3 = new Room(1, roomType2);
        Room room4 = new Room(1, roomType2);
        Room room5 = new Room(1, roomType3);
        Room room6 = new Room(1, roomType4);

        //adding the rooms to hotel
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);
        hotel.addRoom(room5);
        hotel.addRoom(room6);

        menuHotel1(hotel);





    }



    public static  void startingMenu(){
       // System.out.println("Booking for Hotel 1");
        //System.out.println("Booking for Hotel 2");

    }

    public static void menuHotel1(Hotel hotel) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Type 0 to Exit Menu\n" +
                    "Type 1 to start booking\n" +
                    "Type 2 to check in customer\n" +
                    "Type 3 to check out customer\n");
            int userInput = scanner.nextInt();
            if (userInput == 0){
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

                    // set room attribute isOccupied to true
                    room.setOccupied(true);
                    room.setClean(true);

                    if (room.setClean(true)){
                        System.out.println("Room clean and available");

                    }
                    else{
                        System.out.println("Room unavailable not clean");

                    }
                    // Create a booking!
                    //new booking objects
                    Booking bookings = new Booking(customer, room, guestNameInput, localcheckIndate, localcheckOutDate);
                    System.out.println("Booking successful for:" + customerNameInput + "With room:" + roomTypeInput + "Guests are:" + guestNameInput + "Checkin Date:" + checkInDateInput + "Checkout Date:" + localcheckOutDate);

                    //add to hotel
                    hotel.addBooking(bookings);
                }
            } else if (userInput == 2) {
                System.out.println(" What is the customer's email address?");
                scanner.nextLine();
                Scanner checkinscanner = new Scanner(System.in);
                String checkInEmailInput = scanner.nextLine();

                if (hotel.isEmailInSystem(checkInEmailInput)) {
                    Booking booking = hotel.checkInCustomer(checkInEmailInput);
                    System.out.println("You successfully checked in");
                } else {
                    System.out.println("No booking made for the customer with the specified email");
                }

            }
            //user ==3
            else if (userInput == 3) {
                System.out.println(" What is the customer's email address?");
                scanner.nextLine();
                Scanner checkinscanner = new Scanner(System.in);
                String checkOutEmailInput = scanner.nextLine();

                if (hotel.isEmailInSystem2(checkOutEmailInput)) {
                    Booking booking = hotel.checkOutCustomer(checkOutEmailInput);
                    System.out.println("You successfully checked in");
                } else {
                    System.out.println("No booking made for the customer with the specified email");
                }

            }

        }
    }
}
//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//convert user input to local date
//LocalDate checkInLocalDate = LocalDate.parse(checkInDateInput,formatter);
