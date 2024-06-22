package ProjectOOP;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Call Menu
        menuOption();

    }

    //static method for menu
    public static void menuOption(){
        //Menu option
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Luxury hotel management System.What would you like to do?\n" +
                "Type 1 for adding a new room" +
                "\nType 2 for booking" +
                "\nType 3 ---");

        int menuOptionInput = scanner.nextInt();

        //using switch for menu
        switch (menuOptionInput){
            case 1:
                addRoom();
                break;

            case 2:
                makeBooking();
                break;
        }

    }
    //static method to add rooms

    public static void addRoom(){
        Hotel hotel = new Hotel("Luxury Hotel"); //define objects to use methods in hotel class

        //Four types of hotel rooms
        RoomType roomType1 = new RoomType(150, "Double Standard", 2);
        RoomType roomType2 = new RoomType(200, "Deluxe Double", 2);
        RoomType roomType3 = new RoomType(300, "Junior Suite", 2);
        RoomType roomType4 = new RoomType(400, "Grand Suite", 2);


        //6 Hotel rooms
        Room room1 = new Room(1, roomType1);
        Room room2 = new Room(2, roomType1);
        Room room3 = new Room(3, roomType2);
        Room room4 = new Room(4, roomType2);
        Room room5 = new Room(5, roomType3);
        Room room6 = new Room(6, roomType4);

        //Adding six rooms to hotel
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);
        hotel.addRoom(room5);
        hotel.addRoom(room6);

    }
    //public static method for booking
    public static void makeBooking() {

        Scanner scanner = new Scanner(System.in);
        //add type of room
        System.out.println("What type of Room would you like to book?\n" +
                "Type one of the following:\n" +
                "Double Standard\n" +
                "Deluxe Double\n" +
                "Junior Suite\n" +
                "Grand Suite");
        scanner.nextLine();
        String roomTypeInput = scanner.nextLine();
        scanner.nextLine();

        //check if room is in system
        Hotel hotel = new Hotel("Luxury Hotel");
        if (hotel.isRoomAvailable(roomTypeInput)) {
            Room room = hotel.bookRoomIfAvailable(roomTypeInput);
            scanner.nextLine();

            //add customer if room available
            System.out.println("Provide First and Last Name of Customer");
            String customerNameInput = scanner.nextLine();
            scanner.nextLine();

            //add customer email address if room available
            System.out.println("Provide email address of Customer");
            String customerEmailInput = scanner.nextLine();
            scanner.nextLine();

            //add additional guest name
            System.out.println("Provide First and Last Name of Additional Guest");
            String guestNameInput = scanner.nextLine();
            scanner.nextLine();

            //Ask about checkin and check out date
            System.out.println("What is the checkin Date yyyy-MM-dd?");
            String checkInInput = scanner.nextLine();

            System.out.println("What is the checkout Date yyyy-MM-dd?");
            String checkOutInput = scanner.nextLine();

            //create customer
            Customer customer = new Customer(customerNameInput, customerEmailInput);

            //add customer to hotel 's customerList
            hotel.addCustomers(customer);

            //Room assigned to customer. Set room attribute is Occupied to true.
            room.setOccupied(true);

            //create and record booking
            //new booking object
            Booking booking = new Booking(customer, room, customerNameInput, checkOutInput, checkOutInput);
            hotel.addBooking(booking);

            //print out confirmation
            System.out.println("Booking successfully created for " + customerNameInput + "with booking id " + booking.getBookingId() +
                    "for Room Number " + room.getRoomId());

        } else {
            System.out.println("Sorry, no rooms available for the selected type of room. Please choose another");
        }
        scanner.close();

    }

}




