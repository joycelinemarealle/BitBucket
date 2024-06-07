/*package calculatorgame;

import java.util.Scanner;

public class CalculatorGametest {
    public static void main (String [] args){
        //Call the record player
        CalculatorGameMthOp2.Player_c player1 = createPlayer();
        System.out.println("/n");
        System.out.println("Start of Question 3 addQuestionStatic method");

        //Calling moduloQuestion method
        boolean moduloResultOfUser = moduloQuestion(2,2);

        //moduloQuiz
        int scoreOfModuloQuiz = moduloQuiz(4);
        HighScore_c score2= new CHighScore_c(player1, scoreOfModuloQuiz);
        System.out.println("The highscore is" + scoreOfModuloQuiz );

    }
    //static method
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
    record Player_c (String name, int age){
    }
    record HighScore_c (CalculatorGameMthOp2.Player_c player, int score) {
    }
}
*/