package hellojava;

public class LoopStaticMethod {
    public static void main (String[] args){

        // Loop to test the formula and manual sum calculation
        for ( int v = 1; v <=100; v++){
            int formula = (v * (v + 1)) / 2;

            //manual sum based on the formula calculation
            //calling function location is LoopStaticMethod
            //name of function in static method sumTo
            //the variable in calling function transfered to static is v
            int  manualSum= LoopStaticMethod.sumTo(v);

            if (formula != manualSum){
                System.out.println("Error formula and manual sum not equal");
            }
            else {
                System.out.println( manualSum + "The Formula and Manual sum produce same results");
            }
        }
    }



    //static method is not within a method but only a class
    //public static initialize function (passing initialized variables){}

    // Static method to calculate the sum of numbers from 1 to n
    //static method outside main but still inside class
    //it is like a function in python
    public static int sumTo (int n) {
        int sum = 0;
        //start at one as function in static method
        for (int i = 1; i <= n; i++) {
            sum += i;

        }
        return sum;
    }
}
