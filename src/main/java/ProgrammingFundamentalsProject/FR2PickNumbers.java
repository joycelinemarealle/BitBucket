package ProgrammingFundamentalsProject;

import java.util.*;

public class FR2PickNumbers {
    //Global can be accessed by any method //create new array and initialize index // static int i = 0; dont need. do not want variable each time
    static int[] playerRandomArray = new int[6];//create new array of type int

    public static void main(String[] args) {

        //Ask user to choose random number 6 times
        System.out.println("\nChoose 6 random numbers between 1- 49");

        //Call static method that captures users in array. No need parameters since not returning anything
        capturedPlayerNumbersArray();
        System.out.println("\nYou picked the following numbers\n" + Arrays.toString(playerRandomArray));
    }

    //Static method to generate 6 random numbers
    //Pass array into static method
    public static void capturedPlayerNumbersArray() {   //add void since not returning anything //no parameters added since no calculations done
        Scanner scanner = new Scanner(System.in);
        //Capture player 6 random numbers between 1-49 //repeat 6 times so use for loop. Number of times length of array

        for (int i = 0; i < playerRandomArray.length; i++) {
            System.out.println("Enter a number:");
            int numberChosenByPlayer = 0; //initialize variable
            boolean playerNumberIsNew; //intialize variable

            do {
                playerNumberIsNew = true;// set the condition to true - assuming they are going to enter a new number
                numberChosenByPlayer = scanner.nextInt(); //in static method allow to ask 6 times
                for (int j = 0; j < playerRandomArray.length; j++) {
                    if (playerRandomArray[j] == numberChosenByPlayer) { // it's in there
                        System.out.println("The number is already chosen. Choose another number");
                        playerNumberIsNew = false; // set the condition to false because they didn't provide a new number
                        break;
                    }
                }
            } while (!playerNumberIsNew); // ?? While not newNumber ( not true) means when duplicate number entered do ..

            playerRandomArray[i] = numberChosenByPlayer; // if we've got here then the user has entered a number not in the array //insert number into array input = to what players adds


        }
    }
}

/* ///while true keep asking until a valid input is used. while true
            // boolean condition that says  if number has been added assume new number true
            // when boolean condition false break
            //while not number will always loop around
*/
//test if existing already in array
//needed nested array since need to check elements already in array if use i it will always be empty since checking

            /*for (int j = 0; j < i; j++) {
                if (numberChosenByPlayer == playerRandomArray[j]) { // printout message to type number + scanner to ask for number
                    System.out.println("The number is already chosen. Choose another number");
                    numberChosenByPlayer = scanner.nextInt();
                    break;
                } else {
                    playerRandomArray[i] = numberChosenByPlayer; //insert number into array input = to what players adds as numbers
                } //???it gets the duplicate number
            }*/
            /*make sure number between 1-49
            * test to see if already in array* use do while loop
            if yes then ask uswer again
            if not then number added in array/
             */

// get user input ??make sure limit 49 error maybe when >49???
// check existing values
// insert numbe


    /*public static int randomNumberPlayer(int length) {
        //initialize variable //Generate random values between 1-49
        //repeat 6 times so use for loop
        for (int i = 0; i < length; i++) {
            int a = (int) (Math.random() * 49) + 1; //generates random numbers up to double 49.0 when converted to int becomes 48 as int approximates down . so add 1 to get to 49.
        }
        return a;*/
/*empty array
 * go for loop
 * while loop
 * random from cmputre
 * check if number already there in all array*/