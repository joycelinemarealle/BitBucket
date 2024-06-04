package hellojava;

public class Primenumbers {
    public static void main (String[] args){
        //testing for prime numbers

        //initialize isPrime true, test it to code breaks when proved false
        //skip 1 and start at 2 since 1 not an applicable range since prime divided by 1 and itself
       //assume true prime until proven otherwise

        // for values from 1 to 100
        for (int i =2 ; i < 50; i++){
            //the boolean has to be in the outer loop and refresshed everytime.
            // So when hit 4
            boolean isPrime = true;
            // for the divisor run from  1 to less than i for instance if i = 7 divde 7 by 1,2,3,4,56
            for (int j = 2; j < i; j++){
                if ( i % j == 0){
                    isPrime = false;
                    break; // break through inner loop only not the outerloop
                }
                //if true meaning isPrime
            }
            //if want to print only prime. if want to print all and check outerloop  System.out.println(i + " is prime" + isPrime);
            if (isPrime){
                System.out.println(i + " is prime? " + isPrime);
            }

        }
    }
       // int n1 = 23;
       // int n2 = 30;
        //int n3 = 567
       // boolean isPrime =true;
       // for ( int n = 2; n < 60; n++)
       // for (int d = 2; d < n; d++);
       // if ( n % d == 0){
       //     isPrime = false;
         //   break ;
}
        //else (isPrime){
        //    System.out
       // }
    //}
//}
