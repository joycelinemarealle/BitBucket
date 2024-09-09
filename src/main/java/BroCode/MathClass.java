package BroCode;
import java.util.Scanner;
public class MathClass {
    public static void main(String[] args){
        double x = 3.14;
        double y = -10;

        //max method
        //make sure using the right math method of the variable type doubles, int,

        //max
        double max = Math.max(x,y);

        //min
        double min = Math.min(x,y);

        //absolute
        double abs = Math.abs(y);

        //squarerrot
        double sqroot = Math.sqrt(x);

        //round
        double round = Math.round(x);

        //Print out
        System.out.println(max + " max value");
        System.out.println(min + " min value");
        System.out.println(abs+ " absolute value");
        System.out.println(sqroot + " square root");
        System.out.println(round + " round");

        //if need absolute value

        System.out.println("\nStart of Program that calculate hypotenuse. Ask user for x and y");
       //initialize the three vlaues
        //need scanner to get user input

        double a ;
        double b ;
        double c ;

        //user input
        Scanner scanner = new Scanner (System.in);

        //prompt for a and b
        System.out.println("Enter value for a");
        //need double value
        a = scanner.nextDouble();

        System.out.println("Enter value for b");
        b= scanner.nextDouble();

        //Hypotenuse fo
        c = Math.sqrt((a*a) + (b*b) );

        System.out.println("the hypotenuse is " + c);



    }
}
