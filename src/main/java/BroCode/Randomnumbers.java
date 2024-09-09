package BroCode;
//iimport
import java.util.Random;
public class Randomnumbers {
    public static void main(String[] args){
      //random numbers
        Random random = new Random(); //can generate random values. Not true random but Pseudo random numbers
        //if want 6 since rolling a dice
        //computer always start at 0 so if put 6 0,1,2,3,4,5 6 itself not show
        int x = random.nextInt(6);
        System.out.println(x);
        //need to limit the size of random number

    }
}
