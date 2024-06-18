package hellojava;

import java.util.Scanner;

public class AgeChecker {

    // do not need to say AgeChecker.Java since know class file is java. File means class which is a Java file
    public static void main(String [] args) { // space before {
        Scanner scanner = new Scanner(System.in);
            String userInput =  ""; //define variable received fromuser
             boolean digitValue = true; //meaning digit value inserted. The non digit accepted is only exit anything else error
            while (!userInput.equals("exit")) {
                System.out.println("What is your age?");
                //read as string
                userInput = scanner.nextLine(); //get String from user

                if (userInput.equalsIgnoreCase("exit")) {   //ignore it EXIt type exIT all version capture
                    break; //end of exit typed
                }
                //check if input from user has digit
                //if not means a a non digit other than exit
                //regex to search for digits in the value user types in

                // assume a digit and test for applicable conditions
                //define ditiValue before for readibility if (userInput.matches("//d+) still works but break it down
                digitValue = userInput.matches("\\d+");
                if (digitValue){
                    int age = Integer.parseInt(userInput); //changing userinput to int
                    int X = 18 - age; //can initialize up to save memory because this will use more memory. after age is defined

                    if (age > 18) {
                                System.out.println("You are old enough");
                    }
                    else { //cant define int in the conditions eg else if(int x) wrong
                                System.out.println("You must be " + X + " years older to enter"); //tab it
                    }

                }
                // not a digit typed in so prompt user to insert a number of ext
                //digitValue false
                else {
                    System.out.println("Insert a number for age or type 'exit");
                }

            }
    }

}

