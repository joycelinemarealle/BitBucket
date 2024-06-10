package ProgrammingFundamentalsProject;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class LotterySystemProject {
    //Global can be accessed by any method //create new array and initialize index // static int i = 0; dont need. do not want variable each time
    static int[] playerRandomArray = new int[6];//create new array of type int
    static int[] computerRandomArray = new int[6];
    static int[] lotteryNumbersArray = new int[6];

    public static void main(String[] args) {

        // FR1 Over 18s only
        System.out.println("\nStart of FR1 Over 18s only!");

        // create new object
        Scanner scanner = new Scanner(System.in);

        // Ask user for name
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        //Loop until a valid date is added and user > age

        LocalDate birthDate = null; //initialize birthdate as empty. put outside loop so accessible when calculating age
        boolean dateIsValid = false; //assume false until proven otherwise when a valid output is added

        // Ask user for date in format Month-day-year format
        while (!dateIsValid) { //always run when datewhile dateIsValid not true
            System.out.println("\nEnter your date of birth in MONTH-DAY-YEAR format. For example 12-13-1980");
            String birthDateStr = scanner.nextLine(); // initialze name variable + get string date from user

            //Parse and Validate the date format
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy"); //object for date formatter
                birthDate = LocalDate.parse(birthDateStr, formatter); //converts user string to date format, if converted then date valid
                dateIsValid = true; //date format is valid

                //If date valid now Calculate age
                LocalDate today = LocalDate.now(); //?? how to check date is June 10th 2024
                Period age = Period.between(birthDate, today); //calculate time difference (yrs, month,days ) between birthdate date now
                int years = age.getYears();

                //Test to see if 18 years and above
                if (years >= 18) {
                    System.out.println("\nYour age is " + years + " years");
                    break; //exit loop if age > 18
                } else {
                    System.out.println("\nYou need to be 18 years old to participate in the Lottery System. ");
                    birthDateStr = scanner.nextLine(); // Ask again user to their date of birth
                }

                //if date not valid then print error and prompt user to enter valid date
            } catch (DateTimeParseException e) {
                System.out.println("Invalid Date. Enter a valid date");
                continue; //skip to the top to ask user for birthdate
            }
        }

        //FR2 Pick Numbers
        System.out.println("\nFR2Start of Pick numbers");

        //Call static method that captures users in array. No need parameters since not returning anything
        computerArray();
        System.out.println("\n Computer generated your ticket. Your Ticket Number is " + Arrays.toString(computerRandomArray)); //print out the array with 6 random numbers
    }

    //Call static method for Lottery Numbers
    capturedLotteryNumbers();
        System.out.println("Lottery numbers"+Arrays.toString(lotteryNumbersArray));

    //count to see if user ticket matches that of Lottery
    int numberOfMatches = numberOfMatchesOfLottery();
        System.out.println(numberOfMatches);
}
//ask user if want to choose random or let computer generate?
// Random Generator Menu options

public static int[] ticketArray() {
    //ask user if want to choose random or let computer generate?
    // Random Generator Menu options
    System.out.println("Select 1 if want to generate your own 6 random numbers");
    System.out.println("Select 2 if want computer to generate your 6 random numbers");
    Scanner scanner = new Scanner(System.in);
    int playerchoice = scanner.nextInt();

    //Depending on number selected, pick appropriate random generator
    if (playerchoice == 1) {
        //Ask user to choose random number 6 times
        System.out.println("\nChoose 6 random numbers between 1- 49");

        //Call static method that captures users in array. No need parameters since not returning anything
        capturedNumbersArray();
        System.out.println("\nYou added your own random numbers. Your Ticket Number is " + Arrays.toString(playerRandomArray));
    } else if (playerchoice == 2) {
        //FR3 Lucky dip
        System.out.println("\nStart of Lucky Dip");

        //Call static method that captures users in array. No need parameters since not returning anything
        computerArray();
        System.out.println("\n Computer generated your ticket. Your Ticket Number is " + Arrays.toString(computerRandomArray)); //print out the array with 6 random numbers
    }
}

//FR3 Lucky dip
        System.out.

println("\nStart of Lucky Dip");

//Call static method that captures users in array. No need parameters since not returning anything
computerArray();
        System.out.

println("\n Computer generated your ticket. Your Ticket Number is "+Arrays.toString(computerRandomArray)); //print out the array with 6 random numbers
        }


public static void capturedNumbersArray() {   //add void since not returning anything //no parameters added since no calculations done
    Scanner scanner = new Scanner(System.in);
    //Capture player 6 random numbers between 1-49 //repeat 6 times so use for loop. Number of times length of array

    for (int i = 0; i < playerRandomArray.length; i++) {
        System.out.println("Enter a number:");
        int numberChosenByPlayer = 0; //initialize variable
        boolean newNumber; //intialize variable
        do {
            newNumber = true;// set the condition to true - assuming they are going to enter a new number
            numberChosenByPlayer = scanner.nextInt(); //in static method allow to ask 6 times
            for (int j = 0; j < playerRandomArray.length; j++) {
                if (playerRandomArray[j] == numberChosenByPlayer) { // it's in there
                    System.out.println("The number is already chosen. Choose another number");
                    newNumber = false; // set the condition to false because they didn't provide a new number
                    break;
                }
            }
        } while (!newNumber); // ?? While not newNumber ( not true) means when duplicate number entered do ..

        playerRandomArray[i] = numberChosenByPlayer; // if we've got here then the user has entered a number not in the array //insert number into array input = to what players adds


    }
}

//Static method Lucky Dip
public static void computerArray() { //add void since not returning anything //no parameters added since no calculations done

    for (int n = 0; n < computerRandomArray.length; n++) {
        int computerNumber = 0;
        boolean computerRandomNumberIsnew; //initialize boolean

        do {
            computerRandomNumberIsnew = true;
            computerNumber = (int) (Math.random() * 49) + 1; //find random number //Math random generates upto 0.99 *49 gets to 48.99 int truncated down to 48. then add 1 to get to 49
            //System.out.println("\nRandom number by computer " + computerNumber);

            //test if in array already
            for (int k = 0; k < computerRandomArray.length; k++) {
                if (computerNumber == computerRandomArray[k])
                    computerRandomNumberIsnew = false;
                break;
            }
        } while (!computerRandomNumberIsnew); //if computer random number not new keep on generating number

        //If got here means new number were added to array
        computerRandomArray[n] = computerNumber; //capture computer random number in array

    }
}

//Static Random number for Lottery System
public static void capturedLotteryNumbers() { //add void since not returning anything
    System.out.println("Lottery number:");
    int lotteryRandomNumber = 0;
    boolean lotteryNumberIsNew;

    for (int k = 0; k < lotteryNumbersArray.length; k++) {
        do {
            lotteryNumberIsNew = true; //assume true until proven otherwise

            lotteryRandomNumber = (int) (Math.random() * 49) + 1;

            //check if number created already in array
            for (int l = 0; l < lotteryNumbersArray.length; l++) {
                if (lotteryRandomNumber == lotteryNumbersArray[l]) {
                    lotteryNumberIsNew = false;
                    break;
                }
            }

        } while (!lotteryNumberIsNew);   //if lottery random number is not new then keep on generating random number until get new then put array
        lotteryNumbersArray[k] = lotteryRandomNumber; //Got here because new number generated . noe add to array
    }

}

//Static method to do number of counts
public static numberOfMatchesOfLottery() {
    int count = 0;
    for (int a = 0; a < lotteryNumbersArray.length; a++) {
        if ((lotteryNumbersArray[a] == computerRandomArray[a]) || (lotteryNumbersArray[a] == playerRandomArray[a])) {
            count += 1;
        }
    }
    return count;
}
}


//FR3 Lucky dip Static Method

/*Capture user age
 * Convert user string age to date format
 * validate date
 * calculate age
 * test if greater than 18 year old */