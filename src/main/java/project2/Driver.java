package project2;

import java.time.LocalDate;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RoomType roomType1 = new RoomType("Double Standard", 150.0, 2);
        RoomType roomType2 = new RoomType("Deluxe Double", 200.0, 2);
        RoomType roomType3 = new RoomType("Junior Suite", 300.0, 2);
        RoomType roomType4 = new RoomType("Deluxe Suite", 300.0, 2);

        Hotel hotel = new Hotel(6);
        hotel.addRoom(1, roomType1);
        hotel.addRoom(2, roomType1);
        hotel.addRoom(3, roomType2);
        hotel.addRoom(4, roomType2);
        hotel.addRoom(5, roomType3);
        hotel.addRoom(6, roomType4);

        System.out.println("--------------------------------------------");
        System.out.println("Welcome to the Hotel Management System!!");
        System.out.println("Please select from the following options:");
        System.out.println("--------------------------------------------");

        while(true) {
            System.out.println("(1) Book a Room");
            System.out.println("(2) Check in");
            System.out.println("(3) Check out");
            System.out.println("(4) Add a Service");
            System.out.println("(5) Print Bill");
            System.out.println("(6) Modify Room Rate");
            System.out.println("(10) Exit");

            // Create switch instead

            int choice = sc.nextInt();
            if(choice == 10 ) {
                break;
            }

            if (choice == 1) {
                addBooking(hotel);
            } else if (choice == 2) {
                checkIn(hotel);
            }
            else if (choice == 3) {
                checkOut(hotel);
            }
            else if (choice == 4) {
                addService(hotel);
            }
            else if (choice == 5) {
                printBill(hotel);
            }
            else if (choice == 6) {
                modifyRoomRate(hotel);
            }

        }
        System.out.println("Hotel : " + hotel.toString());
    }

    public static void addService(Hotel hotel) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your customer's email address?");
        String customerEmail = sc.nextLine();

        System.out.println("What service would you like to add ?");
        System.out.println("(1) Breakfast ");
        System.out.println("(2) Room Service ");
        System.out.println("(3) Laundry Service");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Please enter the date for service? ( yyyy-mm-dd )");
        String checkInDateString = sc.nextLine();
        System.out.println(checkInDateString);
        LocalDate serviceDate = LocalDate.parse(checkInDateString);

        if(choice == 1) {
            System.out.println("How many people will be having breakfast?");
            int numPeople = sc.nextInt();
            sc.nextLine();
            hotel.addBreakfast(customerEmail, serviceDate, numPeople);
        } else if (choice == 2 ) {
            System.out.println("How many people will be having Room Service?");
            int numPeople = sc.nextInt();
            System.out.println("How many meals per person?");
            int mealsPerPerson = sc.nextInt();
            int mealsRequested = numPeople * mealsPerPerson;
            hotel.addRoomService(customerEmail, serviceDate, mealsRequested);
        } else if (choice == 3) {
            System.out.println("How many items are you dropping off for laundry?");
            int numItems = sc.nextInt();
            hotel.addLaundryService(customerEmail, serviceDate, numItems);
        }

    }
    public static void addBooking(Hotel hotel) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your customer's email address?");
        String customerEmail = sc.nextLine();

        System.out.println("Have they stayed at the hotel before? (Please enter Y/N)");
        String answer = sc.nextLine();

        if(answer.equals("N")) {
            System.out.println("What is their name? Please enter as: [FirstName Lastname]");
            String customerName = sc.nextLine();
            hotel.addCustomer(customerName, customerEmail);
        }
        // else lookup customer name.
        else {
            Customer customer = hotel.getCustomerByEmail(customerEmail);
            System.out.println("Welcome back to your customer: " + customer.getCustomerName() + "!!");
            System.out.println("They have " + customer.getLoyaltyPoints() + " loyalty points.");
        }



        System.out.println("What kind of room would they like to book? ");
        System.out.println("Choose (1) for Double Standard");
        System.out.println("Choose (2) for Deluxe Double");
        System.out.println("Choose (3) for Junior Suite");
        System.out.println("Choose (4) for Deluxe Suite");
        int choice = sc.nextInt();
        sc.nextLine();

        String roomChoice = switch (choice) {
            case 1 -> "Double Standard";
            case 2 -> "Deluxe Double";
            case 3 -> "Junior Suite";
            case 4 -> "Deluxe Suite";
            default -> null;
        };

        System.out.println("Please provide check in date. ( yyyy-mm-dd ).");
        String checkInDateString = sc.nextLine();
        LocalDate checkInDate = LocalDate.parse(checkInDateString);

        System.out.println("Please provide check out date. ( yyyy-mm-dd ).");
        String checkOutDateString = sc.nextLine();
        LocalDate checkOutDate = LocalDate.parse(checkOutDateString);

        if(hotel.isRoomAvailable(roomChoice, checkInDate, checkOutDate)) {
            hotel.addBooking(customerEmail, roomChoice, checkInDate, checkOutDate);
            System.out.println("Hotel has added a booking for : " + customerEmail);
        } else {
            System.out.println("A " + roomChoice + "is not available for dates: " + checkInDate.toString() + " to " + checkOutDate.toString());
        }



    }
    public static void checkIn(Hotel hotel) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your email address?");
        String custEmail = sc.nextLine();
        boolean isRoomClean = hotel.isRoomClean(custEmail);
        if(! isRoomClean) {
            System.out.println("Your room needs to be cleaned! Please CheckIn later");
            hotel.cleanRoomForCustomer(custEmail);
        }
        boolean isCheckedIn = hotel.checkIn(custEmail);
        if(isCheckedIn) {
            System.out.println(custEmail + " is now checked in!");
        } else {
            System.out.println("The customer is not checked in! Please check their email, and try again.");
        }
    }

    public static void checkOut(Hotel hotel) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the customer's email address?");
        String custEmail = sc.nextLine();
        System.out.println("Would you like to have the room cleaned after checkout?");
        String callCleaner = sc.nextLine();
        boolean needsClean = false;

        if(callCleaner.equals("Yes")) {
            needsClean = true;
        }

        boolean isCheckedOut = hotel.checkOut(custEmail, needsClean);
        if(isCheckedOut) {
            System.out.println(custEmail + " is now checked out!");
        } else {
            System.out.println("You are not checked out! Please check your email, and try again.");
        }
    }


    public static void printBill(Hotel hotel) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the customer's email address?");
        String custEmail = sc.nextLine();
        hotel.printBill(custEmail);
    }

    public static void modifyRoomRate(Hotel hotel) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What room rate would you like to update ?");
        System.out.println("Choose (1) for Double Standard");
        System.out.println("Choose (2) for Deluxe Double");
        System.out.println("Choose (3) for Junior Suite");
        System.out.println("Choose (4) for Deluxe Suite");
        int choice = sc.nextInt();
        sc.nextLine();

        String roomChoice = switch (choice) {
            case 1 -> "Double Standard";
            case 2 -> "Deluxe Double";
            case 3 -> "Junior Suite";
            case 4 -> "Deluxe Suite";
            default -> null;
        };
        System.out.println("What is the new price?");
        double newPrice = sc.nextDouble();
        hotel.updateRoomRate(roomChoice, newPrice);
    }


}