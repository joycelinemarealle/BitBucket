package ProgrammingFundamentalsProject;

import java.util.Arrays;

public class FR3Luckydip {
    //Global empty array for 6 elements
    static int[] computerRandomArray = new int[6]; //set computer array

    public static void main(String[] args) {
        //Call static method that captures users in array. No need parameters since not returning anything
        computerNumbersArray();
        System.out.println("\nArray of computer random generated number" + Arrays.toString(computerRandomArray)); //print out the array with 6 random numbers
    }

    //Static method Lucky Dip
    public static void computerNumbersArray() { //add void since not returning anything //no parameters added since no calculations done

        for (int n = 0; n < computerRandomArray.length; n++) {
            int computerNumber = 0;
            boolean computerRandomNumberIsnew; //initialize boolean

            do {
                computerRandomNumberIsnew = true;
                computerNumber = (int) (Math.random() * 49) + 1; //find random number //Math random generates upto 0.99 *49 gets to 48.99 int truncated down to 48. then add 1 to get to 49
                System.out.println("\nRandom number by computer " + computerNumber);

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
}

/*random numbers 1-49
 * check if in there already
 * if not then add in array*/