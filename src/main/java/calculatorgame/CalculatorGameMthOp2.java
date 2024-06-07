package calculatorgame;

import java.util.Scanner;

public class CalculatorGameMthOp2 {
    public static void main(String[] args) {

        //Call the record player
        Player_c player1 = createPlayer();
        System.out.println("/n");

        //Main loop for the menu
        Scanner scanner = new Scanner(System.in); //leave it outside the method
        boolean exit = false;
        while (!exit) {
            System.out.println("Choose which Calculator Game you want to play");
            System.out.println("Type 1 for  Addition Quiz");
            System.out.println(" Type 2 for Modulo Quiz");
            System.out.println(" Type 3 for Multiplication Quiz");
            System.out.println(" Type 4 for Exit");
            System.out.println(" ");

            //user game selection
            int userchoice = (scanner.nextInt());

            //return game user selected
            if (userchoice == 1) {
                int scoreOfAddQuiz = addQuiz(5);
                HighScore_c score1 = new HighScore_c(player1, scoreOfAddQuiz);
                System.out.println("The Addition Quiz Score is " + scoreOfAddQuiz);

            } else if (userchoice == 2) {
                int scoreOfModuloQuiz = moduloQuiz(5);
                HighScore_c score2 = new HighScore_c(player1, scoreOfModuloQuiz);
                System.out.println("The moduloQuiz is " + scoreOfModuloQuiz);

            }
            else if (userchoice ==3){
                int scoreOfPowerQuiz = powerQuiz(5) ;
                HighScore_c score1 = new HighScore_c(player1, scoreOfPowerQuiz);
                System.out.println("The Addition Quiz Score is " + scoreOfPowerQuiz);
            }
            else {
                exit = true;
                System.out.println("Exiting Calculator Game. Goodbye");
                //exit game
            }
        }
        scanner.close(); //close after exit
    }

    //create a static method that calls for name and age
    public static Player_c createPlayer() {
        Scanner scanner = new Scanner(System.in);

        // Ask user for name
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        //Ask user for age
        System.out.println("enter your age");
        int age = scanner.nextInt();

        //Return a player record with the information user added
        Player_c p = new Player_c(name, age);
        return p;
    }

    //addQuestion Static method
    public static boolean addQuestion(int a, int b) {
        int sum = a + b;
        //ask user to add a  and b
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Add  " + a + " and  " + b);

        //capture useranswer
        int userAnswer = scanner.nextInt();

        //check to see userAnswer is correct or not
        if (userAnswer == sum) {
            return true;
            //return true if answer is correct
        } else {
            return false; //returns false if answer is incorrect
        }

    }

    // addQuiz score Static method
    public static int addQuiz(int length) {

        int score = 0;
        for (int n = 0; n < length; n++) {
            int a = (int) (Math.random() * 100);//mathrandom generate numbe rbetween 0 -0.99 so multiple by 10,100 depending on values needed. Also returns float but need integers
            int b = (int) (Math.random() * 100); // create in loop since want n times

            //calling main method addQuestion() that calls static function
            boolean addResultOfUser = addQuestion(a, b); //need to pass through values

            //to count amount of trues
            if (addResultOfUser) { //check if true and add score. Userinput == true
                score += 1;
            }
        }
        return score;//return counts of true

    }

    //moduloQuestion Static method
    public static boolean moduloQuestion(int a, int b) {
        int modulo = a % b;
        //ask user to add a  and b
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Calculate remainder of dividing " + a + " , " + b);

        //capture useranswer
        int userAnswer = scanner.nextInt();

        //check to see userAnswer is correct or not
        if (userAnswer == modulo) {
            return true;
            //return true if answer is correct
        } else {
            return false; //returns false if answer is incorrect
        }

    }

    //moduloQuiz score Static method
    public static int moduloQuiz(int length) {

        int score = 0;
        for (int n = 0; n < length; n++) {
            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);

            //calling main method addQuestion(2,2) that calls static function
            boolean moduloResultOfUser = moduloQuestion(a, b); //???? why cant i pass values here

            //to count amount of trues
            if (moduloResultOfUser) { //check if true and add score. Userinput == true
                score += 1;
            }
        }
        return score;//return counts of true

    }

    //powerQuestion Static method
    public static boolean powerQuestion(int a, int b) {
        int power = (int) Math.pow(a,b); //convert from double to integer

        //ask user to add a  and b
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Calculate the power of " + a + " to " + b);

        //capture useranswer
        int userAnswer = scanner.nextInt();

        //check to see userAnswer is correct or not
        if (userAnswer == power) {
            return true;
            //return true if answer is correct
        } else {
            return false; //returns false if answer is incorrect
        }

    }

    //powerQuiz score Static method
    public static int powerQuiz(int length) {
        int score = 0;
        for (int n = 0; n < length; n++) {

            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);

            //calling main method addQuestion(2,2) that calls static function
            boolean powerResultOfUser = powerQuestion(a, b); //???? why cant i pass values here

            //to count amount of trues
            if (powerResultOfUser) { //check if true and add score. Userinput == true
                score += 1;
            }
        }
        return score;//return counts of true

    }
    //record is a classes so put outside class,es outside
    record Player_c(String name, int age) {
    }

    record HighScore_c(Player_c player, int score) {
    }
}