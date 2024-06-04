package calculatorgame;

public class CalculatorGame {

    public static void main(String[] args) {
        Player player1 = new Player ( "Joyceline", 27);
        //record added then defined instance of record  player1
        System.out.println(player1);
        HighScore score1 = new HighScore ( player1, 20);
        System.out.println(score1);
        System.out.println("\nStart of Extension");

    }
}

//recprd is a classs so put outside class,es putside
record Player (String name, int age){
} // need {} when creating record
record HighScore (Player player, int score){
} // need { when creating record