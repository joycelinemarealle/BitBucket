package Exceptions;

import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Test the fib method
        try {
            System.out.println("Type in an integer to calculate Fibonacci number");
            int number = scanner.nextInt();
            int fibNumber = fib(number);
            System.out.println("The fib number for" + " n: " + number +  " is " + fibNumber);

        } catch (FibonacciException e){
            System.err.println(e.getMessage()); //use system.err to print out error
        }

    }

    public static int fib(int n)  {

        if ( n <0){
            throw new FibonacciException("Tried to Fibonacci with n = [n]", n);

        }
        else if  (n == 0 || n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

////List takes references hence Integer
//public static List <Integer> fibList (List<Integer> n_list){
//
//
//
//
//}

/* How to get it to print the n
How to get message in the FibException class instead in the Fib method
created a new class FibonacciException that extends exception when do that?
* changing to unchecked called Fibonacci Exception?
* */