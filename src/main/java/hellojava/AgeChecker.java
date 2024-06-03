package hellojava;

import java.util.Scanner;

public class AgeChecker {// do not need to say AgeChecker.Java since know class file is java. File means class which is a Java file
    public static void main(String [] args) {// space before {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Age?");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are old enough");
        }
        else  {
            int X = 18 - age;
            System.out.println("You must be " + X + " years older to enter"); //tab it
        }
       if ( age == "exit"){ //convert int to String for it to ready
           break;
       }
        }
    }

