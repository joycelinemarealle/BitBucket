package hellojava;

public class Factorial2 {
    public static void main (String[] arg){
        // while loop has three conditons end point 5, initial 1, then iterations either ++ then --
        int toFind = 5;
        int result = 1;
        while (toFind != 0) {
            if ( toFind < 0){
                System.out.println("Error put a positive value");
                break;
            }
            result = result * toFind;
            toFind--;

        }
        System.out.println( result +" result of factorial ");

    }
}
