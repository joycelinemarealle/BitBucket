package Collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
//
        /*Call generateNumber method
        * count = amount of random number eg 5 numbers
        * max = maximum range want to generate random number eg 1-10*/
        List <Integer> randomNumbersList = generateNumberList(5,10);

        //Call sum method
        int sum = sumNumberList(randomNumbersList);

        //Call product method
        int product = multiplyNumberList(randomNumbersList);

        //Ratio of sum and product static method
        double ratio = (double) sum / product;

        System.out.println("\nThe List is " + randomNumbersList +
                "\nSummed: " + sum +
                "\nMultiplied: " + product +
                "\nRatio  of Summed to Multiplied: " + ratio);
    }

    //Random number generator
    public static List<Integer> generateNumberList(int count, int max){
        List <Integer> randomNumberList = new ArrayList<>();
        for (int i = 0; i < count ; i++){
            int num = (int)(Math.random()* max) +1;
            randomNumberList.add(num);
        }
        return randomNumberList;
    }

    //Sum static method
    public static int sumNumberList(List<Integer> randomNumbersList) {
        int sum = 0;
        for (Integer randomNum : randomNumbersList) {
            sum += randomNum;
        }
        return sum;
    }

    //Product static method
    public static int multiplyNumberList(List<Integer> randomNumbersList) {
        int product = 1;
        for (Integer randomNum : randomNumbersList) {
            product *= randomNum;
            //multiply all numbers
        }
        return product;
    }


}

/* //adding 5 random number in ArrayList
//        List<Integer> randomNumbersList = new ArrayList<>();
//        /* creating random numbers between 1-10
//        Math.random generates btn 0-0.99, *10 is 9.9 int rounds down to 9 then add 1 to get to 10
//         */
//        for (int i = 0; i < 5; i++) {
//            int num = ((int) (Math.random() * 10) + 1);
//            randomNumbersList.add(num);
//        }*/

/*  List<Integer> numbersList = new ArrayList<>();

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
        System.out.println("The sum of numbers in array is " + sum1);*/