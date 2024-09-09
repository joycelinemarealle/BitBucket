package calculatorgame;

import java.util.Scanner;

public class BooleanLogic {
    public static void main(String[] args) {
        //initialize variable answer true or false so Boolean use wrapper since can work with it than a primite
        Boolean userInput = true;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You live in Brooklyn? Answer true or false");
            //change string to Boolean??? is there way to get directly a boolean from userInput?/
            userInput = Boolean.valueOf(scanner.nextLine());

            //convert from String to Boolean so can use it i
            if (userInput ) {
                System.out.println(userInput + " Good! You live in Brooklyn.You are eligible");
            } else{
                System.out.println(userInput + "You need to live in Brooklyn to be eligibel");
            }
        }
    }
}