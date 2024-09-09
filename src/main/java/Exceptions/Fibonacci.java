package Exceptions;

import java.util.ArrayList;
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
            System.out.println("The fib number for" + " n: " + number + " is " + fibNumber);

        } catch (FibonacciException e) {
            System.err.println(e.getMessage()); //use system.err to print out error
        }

        //Call static method fiblist and pass n_list
        List<Integer> n_list = List.of(1,5,3,2,5,-3,-2,1,-4);
        List<Integer> fibList = fibList(n_list);

    }

    public static int fib(int n) {

        if (n < 0) {
            throw new FibonacciException(n);

        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }


//List takes references hence Integer
public static List<Integer> fibList(List<Integer> n_list) {
    List<Integer> resultList = new ArrayList<>();

    //Get all the number List to get fibonacci
    for (int x : n_list) {

        try {
            resultList.add(fib(x));
        } catch (FibonacciException e) {
            System.err.println(e.getMessage());
            resultList.add(null); //add null to inidcate error for that index
        }


    }

    return resultList;

}
}

/* How to get it to print the n
How to get message in the FibException class instead in the Fib method
created a new class FibonacciException that extends exception when do that?
* changing to unchecked called Fibonacci Exception?
* */