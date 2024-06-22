package ProjectOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelBookingSystemTest {
    public static void main(String[] args) {


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

        //Menu option
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Luxury hotel management System.What would you like to do?\n" +
                "Type 1 for booking");

        int menuOptionInput = scanner.nextInt();

        if (menuOptionInput ==1 ){

            //add type of room
            System.out.println("What type of Room would you like to book?\n" +
                    "Type one of the following:\n" +
                    "Double Standard\n" +
                    "Deluxe Double\n" +
                    "Junior Suite\n" +
                    "Grand Suite");

            String roomTypeInput = scanner.nextLine();

            //check if room is in system
            if (hotel.isRoomAvailable(roomTypeInput)){
                Room room = hotel.bookRoomIfAvailable(roomTypeInput);
                scanner.nextLine();

                //add customer if room available
                System.out.println("Provide First and Last Name of Customer");
                S
            }
            //check if room available


            String roomTypeInput = scanner.nextLine();
            scanner.nextLine();


            System.out.println("");

        }



    }
}
