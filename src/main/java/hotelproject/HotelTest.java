package hotelproject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelTest {  //testing comment //bacon
    public static void main(String[] args) {

    //booking Menu
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(); //define new hotel objects
       // do


       menuHotel1(hotel);













        List<RoomType> roomType = new ArrayList<>(); //created array to add rooms

        RoomType roomType1 = new RoomType(150, "Double Standard", 2);
        RoomType roomType2 = new RoomType(200, "Double Deluxe", 2);;
        RoomType roomType3 = new RoomType(300, "Junior Suite ", 2);
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


    }
    public static  void startingMenu(){
        System.out.println("Booking for Hotel 1");
        //System.out.println("Booking for Hotel 2");


    }

    public static void menuHotel1(Hotel hotel){
        System.out.println("type 1 to start booking");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        //if check
        if (userInput ==1){
            System.out.println("What type of room would you like to book \n" +
                    "Double Standard, Deluxe Double, Junior Suite, Grand Suite");
            String roomTypeInput = scanner.nextLine();
            if(hotel.isRoomAvailable(roomTypeInput)) {
                Room room = hotel.findRoomByType(roomTypeInput);
                scanner.nextLine();
                System.out.println("What is your guest first and last name");
                String guestNameInput = scanner.nextLine();

                System.out.println("What is the checkin Date yyyy-MM-dd");
                 String checkInDateInput = scanner.nextLine();

                scanner.nextInt();

                System.out.println("What is the checkout Date yyyy-MM-dd");
                String checkOutDateInput = scanner.nextLine();

                // Create a customer
                // Add Customer to Hotel customer list
                // set room attribute isOccupied to true
                // Create a booking!




                //add booking id
            //


        }
    }






}
//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

//convert user input to local date
//LocalDate checkInLocalDate = LocalDate.parse(checkInDateInput,formatter);
