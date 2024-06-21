package ProjectOOP;

import java.util.ArrayList;
import java.util.List;

public class HotelBookingSystemTest {
    public static void main(String[] args) {


        Hotel hotel = new Hotel ("Luxury Hotel"); //define objects to use methods in hotel class

        //Hotel rooms
       Room room1 = new Room ( 1, "Double Standard", 150);
       Room room2 = new Room ( 2, "Double Standard", 150);
       Room room3 = new Room ( 3, "Deluxe Double", 200);
       Room room4 = new Room ( 4, "Deluxe Double", 200);
       Room room5 = new Room ( 5, "Junior Suite", 300);
       Room room6 = new Room ( 6, "Grand Suite", 400);

       //adding the six rooms in
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);
        hotel.addRoom(room5);
        hotel.addRoom(room6);

/*while true ask Main menu secl 1 book room 2.see confirmation 3.eexist, 4 enter choice*/


    }
}
