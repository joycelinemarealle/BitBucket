package calculatorgame;

import java.util.Scanner;

public class CalculatorGameMthOp1 {
    //main method referring to name and age provided in static method
    public static void main (String[] args){

        //Call the record player
        Player_b player1 = createPlayer();
        System.out.println("/n");
        System.out.println("Start of Question 3 addQuestionStatic method");

        //Calling addQuestion method
        boolean addResultOfUser = addQuestion(2,2);
       // System.out.println("add answer" + addResultOfUser ); //return message true or false will be the only answers here

        //addQuiz score
        int scoreOfAddQuiz= addQuiz(4);
        HighScore_b score1 = new HighScore_b (player1, scoreOfAddQuiz);
        System.out.println("The highscore is" + scoreOfAddQuiz);

        //Calling moduloQuestion method
        boolean moduloResultOfUser = moduloQuestion(2,2);

        //moduloQuiz
        int scoreOfModuloQuiz = moduloQuiz(4);
        HighScore_b score2= new HighScore_b (player1, scoreOfModuloQuiz);
        System.out.println("The highscore is" + scoreOfModuloQuiz );

    }
    //create a static method that calls for name and age
    public static Player_b createPlayer() {
        Scanner scanner = new Scanner(System.in);

        // Ask user for name
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        //Ask user for age
        System.out.println("enter your age");
        int age = scanner.nextInt();

        //Return a player record with the information user added
        Player_b p = new Player_b(name, age);
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
        int score = 0;
        for(int n = 0; n < length; n++){

            //calling main method addQuestion(2,2) that calls static function
            boolean addResultOfUser  = addQuestion(2,2); //need to pass through values

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
        int score = 0;
        for(int n = 0; n < length; n++){

            //calling main method addQuestion(2,2) that calls static function
            boolean moduloResultOfUser = moduloQuestion(2,2); //need to pass through values

            //to count amount of trues
            if (moduloResultOfUser) { //check if true and add score. Userinput == true
                score += 1;
            }
        }
        return score;//return counts of true

}

//record is a classes so put outside class,es outside
record Player_b (String name, int age){
}
record HighScore_b (Player_b player, int score) {
}
}

