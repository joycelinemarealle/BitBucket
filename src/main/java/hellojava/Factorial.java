 package hellojava;
public class Factorial {
    public static void main(String[] args) {
        //initialize variable
        //for need higher and lower range
        int value = 5;
        int results = 1;
        for (int counter = value; counter > 1; counter--) { //decrement so use --
            results *=  counter;
        }
        System.out.println(results + " The results of the factorial");
    }
}
/*


/* package hellojava;
import java.util.Scanner;
public class Factorial {
    public static void main (String[] args){
        // initialize variable
      //  int toFind = 5; //number to find factorial
       // int result = 1; //storing factorial helps with initializing
       // Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the number to calculate factorial");
       // toFind = scanner.nextInt();

        //make sure that factorial is not equal to 0 or negative
        //while (toFind !=0){
            //System.out.println(result);
           // if ( toFind < 0){
              // System.out.println("Can't find the factorial of negative number");
              // break;

            //else {
                // for loop initial value toFind, last value results >=2
                // start at 5 then 4,then 3,then 2
                // tofind starts at 5. results = 1* 5
                // to find is 4 results was 5 now result = 5*4 =
                // tofind 3 results 5*4 new results = 5*4 *3
                //to find 2 retuls 5*$*3 new results 5*4*3*2
                // no need to calculate 1 since does not matter 0! is one
                //for ( int counter = toFind; counter > 1; counter++){
                    //result = result * counter;
                }
            }
            //System.out.println("Value of facotiral"
                 //   +result);


        }
    }

}
*/