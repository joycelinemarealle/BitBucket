package calculatorgame;
import java.util.Scanner;

public class CalculatorGameStaticMethod {
    //main method referring to name and age provided in static method
    //
    public static void main (String[] args){
        //do not need to define input inside createPlayer() not passing anything
        // no need to define variable likes a and b because no calculatio to be done a+b
        //initialize variable so add Payer_a since this captures String and int asking user for their age and name
        // the three names in main player 1, player2 player3 are not connected to variables in static method p
        Player_a player1 = createPlayer();
        Player_a player2 = createPlayer();
        Player_a player3 = createPlayer();

        System.out.println("/n");
        System.out.println("Start of Question 3 addQuestionStatic method");

        //confirming if user sum and sum of numbers is correct
        //the result is a boolean since true or false
        // can call the two numbers defined from static
        boolean resultofuser = addQuestion(2,2);

        //return message true or false will be the only answers here
        System.out.println("Is this answer correct" + resultofuser);
    }
    //create a static method that calls for name and age
    // have defined a variable as Player_a which includes string and int
    //then call function
    //since defined it will return values
    public static Player_a createPlayer() {
        Scanner scanner = new Scanner(System.in);

        // Ask user for name
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        //Ask user for age
        System.out.println("enter your age");
        int age = scanner.nextInt();

        //Return a player record with the information user added
        //write only once no need to create new objects each time
        //// the three names in main player 1, player2 player3 are not connected to variables in static method p
        Player_a p = new Player_a(name, age);
       // System.out.println(player1);
       //return can only return one value
        return p; //????only prints one player1 so how about the rest??
        //to return three pplayers will need to print out three time

    }

    //second Static method
    //the method returns true or false so boolean
    public static boolean addQuestion(int a, int b){

        //initialize the two numbers user will see and be asked to add
        // no need to define a and b again already defined type variable
        int sum = a+b;
                // initialize the isCorrect as true. Need to define type
        boolean isCorrect = true;

        //ask user to add a  and b
        Scanner scanner = new Scanner (System.in);
        System.out.println(" Add " + a + " , " + b + " numbers together");

        //capture useranswer
        int userAnswer = scanner.nextInt();

        //check to see userAnswer is correct or not
        if (userAnswer == sum){
           return isCorrect;
            //return true if answer is correct

        }
        else  {
            return false; //returns false if answer is incorrect

        }

    }
}

//record is a classes so put outside class,es outside
record Player_a (String name, int age){
} // need {} when creating record

/*record HighScore_a (Player_a player, int score){
} // need { when creating record*/