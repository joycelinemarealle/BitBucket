package calculatorgame;

import java.util.*;
import java.util.Scanner;

public class CalculatorGameFinal {
    static int index = 0; //Global can call from any method. initialize outside.need static since outside main
    static  HighScore_c[] myScoreArray = new HighScore_c[5];//type of array is HighScore_c tracking all records
    //put outside so can refer to it using any static method
//
    public static void main(String[] args) {
        //Call the record player
        Player_c player1 = createPlayer();
        System.out.println(" ");

        //Main loop for the menu
        Scanner scanner = new Scanner(System.in); //leave it outside the method
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose which Calculator Game you want to play");
            System.out.println("Type 1 for  Addition Quiz");
            System.out.println(" Type 2 for Modulo Quiz");
            System.out.println(" Type 3 for Power Quiz");
            System.out.println(" Type 4 for Boolean Quiz");
            System.out.println(" Type 5 for exit");
            System.out.println("Type 6 to print array of Player and scores");
            System.out.println(" ");

            //user game selection
            int userchoice = (scanner.nextInt());

            // Inform player of current best "score to beat"
            HighScore_c bestScore = findHighestScore();
            if  (bestScore != null) {
                System.out.println ("\nCurrent best score to beat is  " + bestScore.score() + "  by  " + bestScore.player().name());

            }
            else {
                System.out.println("\nNo Scores available yet ");
            }


            //return game user selected
            if (userchoice == 1) {
                int scoreOfAddQuiz = addQuiz(5);
                HighScore_c score1 = new HighScore_c(player1, scoreOfAddQuiz);
                System.out.println("The Addition Quiz Score is " + scoreOfAddQuiz);
                myScoreArray[index] = score1; //track index of array and updates record after each quiz is completed
                index+=1;
                //??if lenght <5 can do index+1

                //??if > length 5 end of array need replace lowest score

                System.out.println(Arrays.toString(myScoreArray));

            } else if (userchoice == 2) {
                int scoreOfModuloQuiz = moduloQuiz(5);
                HighScore_c score1 = new HighScore_c(player1, scoreOfModuloQuiz);
                System.out.println("The moduloQuiz is " + scoreOfModuloQuiz);
                myScoreArray[index] = score1;
                index+=1;
                System.out.println(Arrays.toString(myScoreArray));

            } else if (userchoice == 3) {
                int scoreOfPowerQuiz = powerQuiz(5);
                HighScore_c score1 = new HighScore_c(player1, scoreOfPowerQuiz);
                System.out.println("The Power Quiz Score is " + scoreOfPowerQuiz);
                myScoreArray[index] = score1;
                index+=1;
                System.out.println(Arrays.toString(myScoreArray));
            } else if (userchoice == 4) {
                int scoreOfBooleanQuiz = booleanQuiz(5);
                HighScore_c score1 = new HighScore_c(player1, scoreOfBooleanQuiz);
                System.out.println("The Boolean Quiz Score is " + scoreOfBooleanQuiz);
                myScoreArray[index] = score1;
                index+=1;
                System.out.println(Arrays.toString(myScoreArray));
            } else if ( userchoice==6){
                System.out.println(Arrays.toString(myScoreArray));
            }
            else {
                exit = true;
                System.out.println("Exiting Calculator Game. Goodbye");
                //exit game
            }
        }
        //scanner.close(); //close after exit
    }

    /*create an array length 5
     * tracks quiz array stores records
     * option in menu*/
    //type array

    // add entire record in array

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
        System.out.println(" \nCalculate remainder of dividing " + a + " , " + b);

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
        int power = (int) Math.pow(a, b); //convert from double to integer

        //ask user to add a  and b
        Scanner scanner = new Scanner(System.in);
        System.out.println(" \nCalculate the power of " + a + " to " + b);

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
            boolean powerResultOfUser = powerQuestion(a, b);
            //to count amount of trues
            if (powerResultOfUser) { //check if true and add score. Userinput == true
                score += 1;
            }
        }
        return score;//return counts of true

    }

    //boolean static method
    public static boolean booleanQuestion(boolean a, boolean b) {
        boolean formula = a && b; //test for AND boolean logic

        //ask user to input
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nYour answer (true/false) " + a + " and " + b);

        //validate user result if true or false typed. Prompt to type two options
        /*prompt user for true or false
         * if user string input true or false
         * then convert string to boolean
         * if not send message user to type true or false */
// intialize variable
        boolean  booleanResultOfUserBol ;
        do {
            String booleanResultOfUserStr = scanner.nextLine();
            if (booleanResultOfUserStr.equalsIgnoreCase("true") || booleanResultOfUserStr.equalsIgnoreCase("false")) { //if typed true or false conver to boolean
                booleanResultOfUserBol = Boolean.parseBoolean(booleanResultOfUserStr); //convert from String
                break; //Exit the loop if the input is valid
            } else {
                System.out.println("Answer not recognized.Type true or false");
            }
        }while (true) ;// Infinite loop until a valid input is provided

        //test if user is correct
        if (booleanResultOfUserBol == formula) {
            return true;
        } else {
            return false;
        }

    }
    //booleanQuiz Score Static method
    public static int booleanQuiz ( int length){
        int score = 0;

        for (int n = 0; n < length; n++) {
            Random random = new Random();
            boolean a = random.nextBoolean();
            boolean b = random.nextBoolean();

            //refer to booleanQuestion static method
            boolean booleanResultOfUserBol = booleanQuestion(a, b);

            if (booleanResultOfUserBol) { //is correct
                score += 1;
            }
        }
        return score;
    }

    //Static method that finds highest score in the HighScores list and prints it
    //using a For - each Loop
    public static HighScore_c findHighestScore() {

        //Initialize variabel to keep track highest score
        HighScore_c highestScore = null; //initialize to zero the record

        for (HighScore_c score : myScoreArray) { //stores elements of type HighScore_c every element in array myScoreArray [for (Type variable : collection) {]
            //to track maximum. record need not to be null and same time score.score() > than highestScore.score() this tracks the score value in record

            if (score != null ) {  // Check if the current score is not null to avoid error if no score is in array

                if (highestScore == null || score.score( ) > highestScore.score()){ // Check if the current score is not null and if it's higher than the highest score found so far

                    highestScore = score; //update record to match temporary record called score as you go through the for each loop
                }

            }
            //return highestScore

        }
        return highestScore;
    }
}

//record is a classes so put outside class,es outside
record Player_c(String name, int age) {
}

record HighScore_c(Player_c player, int score) {
}