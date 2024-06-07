package calculatorgame;

import java.util.Scanner;

public class CalculatorGameMthOp2 {
    public static void main (String[] args){
        //Add menu to choose games
        //menu();
        System.out.println("Choose which game you want to play");
        Scanner scanner = new Scanner (System.in);
        int usergame = scanner.nextInt();

        //return game
        if (usergame ==

        //Call the record player
       Player_c player2 = createPlayer();
        System.out.println("/n");
        System.out.println("Start of Question 3 addQuestionStatic method");

        //I am only tracking scores not the results of user so no need of this
        // Calling addQuestion method
        //boolean addResultOfUser = addQuestion(int a,int b );

        //addQuiz score
        int scoreOfAddQuiz= addQuiz(5);
       HighScore_c score1 = new HighScore_c(player2, scoreOfAddQuiz);
        System.out.println("The highscore is" + scoreOfAddQuiz);

        //Calling moduloQuestion method
        //I am only tracking scores not the results of user so no need of this
        //boolean moduloResultOfUser = moduloQuestion(2,2);

        //moduloQuiz
        int scoreOfModuloQuiz = moduloQuiz(5);
        HighScore_c score2= new HighScore_c (player2, scoreOfModuloQuiz);
        System.out.println("The highscore is" + scoreOfModuloQuiz );

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
    public static boolean addQuestion(int a, int b){
         int sum = a + b;
        //ask user to add a  and b
        Scanner scanner = new Scanner (System.in);
        System.out.println(" Add  " + a + " and  " + b);

        //capture useranswer
        int userAnswer = scanner.nextInt();

        //check to see userAnswer is correct or not
        if (userAnswer == sum){
            return true;
            //return true if answer is correct
        }
        else  {
            return false; //returns false if answer is incorrect
        }

    }
    // addQuiz score Static method
    public static int addQuiz(int length){
        int a = (int)(Math.random()*100);//mathrandom generate numbe rbetween 0 -0.99 so multiple by 10,100 depending on values needed. Also returns float but need integers
        int  b = (int)(Math.random()*100);
        int score = 0;
        for(int n = 0; n < length; n++){

            //calling main method addQuestion() that calls static function
            boolean addResultOfUser  = addQuestion( a,b ); //need to pass through values

            //to count amount of trues
            if (addResultOfUser ) { //check if true and add score. Userinput == true
                score += 1;
            }
        }
        return score;//return counts of true

    }
    //moduloQuestion Static method
    public static boolean moduloQuestion(int a, int b){
        int modulo = a % b;
        //ask user to add a  and b
        Scanner scanner = new Scanner (System.in);
        System.out.println(" Calculate remainder of dividing " + a + " , " + b);

        //capture useranswer
        int userAnswer = scanner.nextInt();

        //check to see userAnswer is correct or not
        if (userAnswer == modulo){
            return true;
            //return true if answer is correct
        }
        else  {
            return false; //returns false if answer is incorrect
        }

    }
    //moduloQuiz score Static method
    public static int moduloQuiz(int length){
       int  a = (int)(Math.random()*100);
       int  b = (int)(Math.random()*100);
        int score = 0;
        for(int n = 0; n < length; n++){

            //calling main method addQuestion(2,2) that calls static function
            boolean moduloResultOfUser = moduloQuestion( a , b ); //???? why cant i pass values here

            //to count amount of trues
            if (moduloResultOfUser) { //check if true and add score. Userinput == true
                score += 1;
            }
        }
        return score;//return counts of true

    }

    //record is a classes so put outside class,es outside
    record Player_c (String name, int age){
    }
    record HighScore_c (Player_c player, int score) {
    }
}