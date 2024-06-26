package Collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList<>();

        //Adding numbers to ArrayList
        numbersList.add(5);
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(0);
        numbersList.add(3);

        //print sum of numbers in List
        int sum1 = 0;
        for (Integer number : numbersList) {
            sum1 += number;
        }
        System.out.println("The sum of numbers in array is " + sum1);

        //adding 5 random number in ArrayList
        List<Integer> randomNumbersList = new ArrayList<>();

        /* creating random numbers between 1-10
        Math.random generates btn 0-0.99, *10 is 9.9 int rounds down to 9 then add 1 to get to 10
         */

        for (int i = 0; i < 5; i++) {
            int num = ((int) (Math.random() * 10) + 1);
            randomNumbersList.add(num);
        }
        System.out.println("\nThe random numbers  is " + randomNumbersList);

        //sum of random Numbers
        int sum2 = 0;
        for (Integer randNumber: randomNumbersList){
            sum2 += randNumber;
        }

        System.out.println("\nThe sum of the random numbers in the randomNumber List is " + sum2);
    }
}
