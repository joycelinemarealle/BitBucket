package hotelproject;

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
        //Create new Hotel object

        //Old Hotel
        List<RoomType> roomType = new ArrayList<>(); //created array to add rooms
        RoomType roomType1 = new RoomType(150, "Double Standard", 2,2);
        RoomType roomType2 = new RoomType(200, "Double Deluxe", 2,2);
        ;
        RoomType roomType3 = new RoomType(300, "Junior Suite", 2,1);
        RoomType roomType4 = new RoomType(400, "Grand Suite", 2,1);

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



        //Copy and paste from line 19 to 46 to here
        Hotel newHotel = new Hotel(); //define newHotel objects
        List<RoomType> roomTypeNew  = new ArrayList<>(); //created array to add rooms
        RoomType roomTypen1 = new RoomType(150, "Double Standard", 2,4);
        RoomType roomTypen2 = new RoomType(200, "Double Deluxe", 2,4);
        RoomType roomTypen3 = new RoomType(300, "Junior Suite", 2,1);
        RoomType roomTypen4 = new RoomType(400, "Grand Suite", 2,1);
        RoomType roomTypen5 = new RoomType(225, "Family room", 3,2);

        roomTypeNew.add(roomType1);
        roomTypeNew.add(roomType2);
        roomTypeNew.add(roomType3);
        roomTypeNew.add(roomType4);

        Room room_n1 = new Room(1, roomTypen1);
        Room room_n2 = new Room(2, roomTypen1);
        Room room_n3 = new Room(3, roomTypen1);
        Room room_n4 = new Room(4, roomTypen1);
        Room room_n5 = new Room(5, roomTypen2);
        Room room_n6 = new Room(6, roomTypen2);
        Room room_n7 = new Room(7, roomTypen2);
        Room room_n8 = new Room(8, roomTypen2);
        Room room_n9 = new Room(9, roomTypen5);
        Room room_n10 = new Room(10, roomTypen5);
        Room room_n11 = new Room(11, roomTypen3);
        Room room_n12 = new Room(12, roomTypen4);


        //adding the rooms to hotel
        newHotel.addRoom(room_n1);
        newHotel.addRoom(room_n2);
        newHotel.addRoom(room_n3);
        newHotel.addRoom(room_n4);
        newHotel.addRoom(room_n5);
        newHotel.addRoom(room_n6);
        newHotel.addRoom(room_n7);
        newHotel.addRoom(room_n8);
        newHotel.addRoom(room_n9);
        newHotel.addRoom(room_n10);
        newHotel.addRoom(room_n11);
        newHotel.addRoom(room_n12);


        menuHotel1(hotel);
    }


    public static void menuHotel1(Hotel hotel) {

        Scanner scanner = new Scanner(System.in);

        /*
        Due to time constraint,
        We could not to update the user interface based on hotel 1 and hotel 2
        and room update.We know that we need to inherit from hotel class
         */

        while (true) {
            System.out.println("Type 0 to Exit Menu\n" +
                    "Type 1 to start booking\n" +
                    "Type 2 to check in customer\n" +
                    "Type 3 to check out customer\n" +
                    "Type 4 to update rate of room based on season \n"+
            "Type 5 to create a room\n" +
                    "Type 6 to add room\n" +
                    "Type 7 to remove remove\n");
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                break;
            }
            if (userInput == 1) {

                System.out.println("Which ");
                System.out.println("What type of room would you like to book \n" +
                        "Double Standard, Double Deluxe, Junior Suite, Grand Suite");
                scanner.nextLine();
                String roomTypeInput = scanner.nextLine();
                if (hotel.isRoomAvailable(roomTypeInput)) {
                    Room room = hotel.bookRoomByType(roomTypeInput);
                    //scanner.nextLine();
                    System.out.println("What is your customer's first and last name?");
                    String customerNameInput = scanner.nextLine();
                    // scanner.nextLine();
                    System.out.println("How many people per room? max 2");
                    int numberGuestInput = scanner.nextInt();
                    //scanner.nextLine();

                    System.out.println("What is the additional guest's first and last name?");
                    String guestNameInput = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("What is your customer's email?");
                    String customerEmailInput = scanner.nextLine();
                    //scanner.nextLine();

                    //convert user input to local date
                    System.out.println("What is the checkin Date yyyy-MM-dd");
                    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    String checkInDateInput = scanner.nextLine();
                    LocalDate localcheckIndate = LocalDate.parse(checkInDateInput, formatter1);
                    //scanner.nextLine();

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

                    //cost of Hotel Stay without addons
                    booking.costHotelStay();
                    booking.addCostHotelStay();

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

                    /// to calculate discount
                    //call the updated cost after discount applied
                    double finalCost = hotel.applyDiscount(booking, customerEmailInput);

                    System.out.println("Booking successful for: " + customerNameInput + "\nWith room: " + roomTypeInput + "\nGuests are: " +
                            "\nThis is your Guest: " + guestNameInput + "\nCheckin Date: " + checkInDateInput + "\nCheckout Date: " + localcheckOutDate + "\nTotal cost is: " + booking.getTotalAmount());


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
                    System.out.println("You successfully checked out");
                    System.out.println("Your final bill is: ");
                    System.out.println(hotel.applyDiscount(booking, checkOutEmailInput));
                } else {
                    System.out.println("No booking made for the customer with the specified email");
                }

            } else if (userInput == 4) {
                scanner.nextLine();
                System.out.println("Enter room type you would like to update price for");
                String roomTypeName = scanner.nextLine();
                RoomType roomtype = hotel.findRoomType(roomTypeName);

                if (roomtype != null) { //if roomtype is not absent
                    System.out.println("What is the new price you would like to set?");
                    int newPrice = scanner.nextInt();
                    //set new price
                    hotel.setRoomTypePrice(roomtype, newPrice);
                    System.out.println("You have set new price");
                }

            }

             else if (userInput ==5){
                scanner.nextLine();
                System.out.println("What room type would you like to add eg Family Room?");
                String newRoomType = scanner.next();
                //n.setType(newRoomType);
                System.out.println("You have set new RoomType");
                //do for price
                System.out.println("What is the price of the new room type?");
                int newPrice = scanner.nextInt();
                //n.setPrice(newPrice);
                System.out.println("You have set new price");
                //do for capacity
                System.out.println("What is the capacity for the new room type?");
                int newCapacity = scanner.nextInt();
                //n.setPrice(newCapacity);
                System.out.println("You have set new capacity");
                //do for roomQuantity
                System.out.println("What is the amount of rooms for the new room type?");
                int newRoomQuantity = scanner.nextInt();
                scanner.nextLine();
               // n.setRoomQuantity(newRoomQuantity);
                RoomType n = new RoomType(newPrice , newRoomType , newCapacity, newRoomQuantity);
                for(int i =0; i < newRoomQuantity; i++) {
                    Room room = new Room(0, n); //create new rooms based on
                    hotel.addRoom(room);
                }

            }

             else if( userInput ==6 ){
                scanner.nextLine();
                System.out.println("What room type would you like to update eg Family Room?");
                String newRoomType = scanner.next();
                //check first if roomtype is in system before setting
                if ( hotel.findRoomType(newRoomType).equals(newRoomType)){
                    RoomType n = new RoomType(0 , null , 0,0);
                    n.setType(newRoomType);

                    //do for price
                    System.out.println("What is the price of the new room type?");
                    int newPrice = scanner.nextInt();
                    scanner.nextLine();
                    n.setPrice(newPrice);

                    //do for capacity
                    System.out.println("What is the capacity for the new room type?");
                    int newCapacity = scanner.nextInt();
                    n.setCapacity(newCapacity);

                    //do for roomQuantity
                    System.out.println("What is the amount of rooms for the new room type?");
                    int newRoomQuantity = scanner.nextInt();
                    n.setRoomQuantity(newRoomQuantity);
                } else {
                    System.out.println("Room not found! Create a new roomType");
                }

            }

//             else if (userInput == 7){
//                scanner.nextLine();
//                System.out.println("What room type would you like to remove?");
//                String removeRoomType = scanner.next();
//                if ( hotel.findRoomType(removeRoomType).equals(removeRoomType)){
//                RoomType n = new RoomType( ,  , ,);
//                n.setType(removeRoomType);
//                System.out.println(removeRoomType + "has been successfully removed");
//            }
//


            // ask for room type by name
            // find room type
            // RoomType rt = hotel.getRoomType(name);
            // ask for new price
            // hotel.setRoomTypePrice(rt, price);

        }
    }
}
//Worked on part 7 last but code is not fully working