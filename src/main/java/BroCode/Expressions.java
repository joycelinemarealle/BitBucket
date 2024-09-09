package BroCode;

public class Expressions {
    public static void main (String[] args){
        //Expresions
        double friends = 10;
        //friends ++;
        System.out.println(friends);
        // a/b rounds off 10/3 get 3 not 3.33
        // can cast a value as double to get decimal
        //convert int to double

        friends =  (double) friends / 3;
        //make sure division is equal to doub;e
        System.out.println(friends + "double before division ensures that answer is decimal");
    }
}
