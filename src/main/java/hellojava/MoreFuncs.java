package hellojava;

import java.util.Scanner;

public class MoreFuncs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //print out first number
        System.out.println("enter number 1");
        int firstNumber = scanner.nextInt();

        //print out second number
        System.out.println("enter number 2");
        int secondNumber = scanner.nextInt();

        //Print out first and second number
        System.out.println("The result of " + firstNumber + "and " + secondNumber);

        //Refer to the calculator additiona calculation
        // when using Calculator.add a new stack created and passes first number, second number as a and b. then stack breaks
        //returned value saved in calling method MoreFuncs

        int resultOfAdd = Calculator.add(firstNumber,secondNumber);
        System.out.println(resultOfAdd);

        // Refer to the calculator substraction calculation
        System.out.println();
        int resultOfSub = Calculator.sub(firstNumber, secondNumber);
        System.out.println(resultOfSub);

        System.out.println("\nStart of whileloop sum calculation");
        int loopNumber ;
        while(loopNumber <= 100) {
            System.out.println("Get sum of what?");

            int number = scanner.nextInt();

        }
        static int calculatedSum(int max){
            System.out.println("calculateSum loop number" + loopNumber);
            int sum = 0;
            for (int i =0; i<=max; i++);{
                sum += i;
            }
            return sum;
        }
    }
}