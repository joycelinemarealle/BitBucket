package BroCode;
import java.util.Scanner;
public class Brocode {
    public static void main(String[] args) {

        String x = "water";
        String y = "Kool- Aid";
        String temp; //temp to store all x in temp
        temp = x;
        x = y; //now x can be filed with y since x is empty
        System.out.println("x:" + x);
        System.out.println("y:" + y);

        System.out.println("\nUser input");

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        //testing prime number
        System.out.println("\n Testing a prime");
        boolean isPrime = true;
        for ( int i = 2; i < 100; i++){
            for (int j = 2; j < i; j ++){
                if (i % j == 0 ) {
                    isPrime = false;
                }
            if (isPrime){
                System.out.println(i + "Is prime");
            }

            }
        }

    }
}
