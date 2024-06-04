package hellojava;

import java.util.Scanner;

public class AgeChecker {// do not need to say AgeChecker.Java since know class file is java. File means class which is a Java file
    public static void main(String [] args) { // space before {
        Scanner scanner = new Scanner(System.in);
            String userInput =  ""; //define variable received fromuser
            while (!userInput.equals("exit")) {
                System.out.println("What is your age?");
                //read as string
                userInput = scanner.nextLine(); //get String from user

                if (userInput.equalsIgnoreCase("exit")) {   //ignore it EXIt type exIT all version capture
                    break; //end of exit typed
                }
                else{
                int age = Integer.parseInt(userInput); //changing userinput to int
                int X = 18 - age; //can initialize up to save memory because this will use more memory. after age is defined

                    if (age > 18) {
                        System.out.println("You are old enough");
                    }
                    else { //cant define int in the conditions eg else if(int x) wrong
                    System.out.println("You must be " + X + " years older to enter"); //tab it
                    }
                }
            }
    }

}

