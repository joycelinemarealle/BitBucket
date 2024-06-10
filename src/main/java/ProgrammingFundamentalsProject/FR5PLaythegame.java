package ProgrammingFundamentalsProject;

import java.util.Arrays;

public class FR5PLaythegame {
    static int[] lotteryNumbersArray = new int[6];

    public static void main(String[] args) {

        //Call static method
        capturedLotteryNumbers();
        System.out.println("Lottery numbers" + Arrays.toString(lotteryNumbersArray));
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

}
/*generate random number
 * check if number already in array
 * if not then add to array*/
/* for ( int k ; k = playerarray.length k++){
        if(playerrarry[i ] == computer array (any value)){
            win a price
                    if 1 mathc
                if 2
                    if 3
                    if 4
                    if 5
                    if 6*/

// FR5 Play the Game
//values in player array compared to
//for all values in player array
//compare to computer array
/*in static method compare users output and compute output
 * if any exist capture
 * if 1,2,3,4,5,6 mention applicable price*/