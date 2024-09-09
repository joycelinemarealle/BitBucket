package hellojava;

import java.util.Scanner;

public class AgeCheckeroriginal {
    // do not need to say AgeChecker.Java since know class file is java. File means class which is a Java file
    public static void main(String[] args) { // space before {
        Scanner scanner = new Scanner(System.in);
        //ask user for input of age
        System.out.println("What is your Age?");
        //initialize values used
        int age = scanner.nextInt();
        //X defined after age is defined
        int X = 18 - age;
        //if age >= 18 print statement
        if (age >= 18) {
            System.out.println("You are old enough");
        }
        // cannot initialize int X in the else condition . need to initialize at the top
        else  {
            System.out.println("You must be" + X + " years older to enter"); //tab it


        }
    }
}