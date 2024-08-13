package Arrays;

import java.util.Arrays;

public class Arrayclass {

    //add static method
    public static int sumArray(int[] myintArray){ //?? why not used another int[] myArray
        //could even say int[] myBanana
        //but need it in for loop myArray.length so need it like not another variable
        int result = 0;
        for (int i = 0; i < myintArray.length; i++){ //need myArray in for loop
            result += i;
        }
        return result;

    }
    public static void main (String[] args){
        //creating empty array. Define what type of variablea nd number
        String strArray[] = new String[4];
        strArray[0] = "Hell";
        strArray[1] = "World";
        strArray[2] = "Hello";
        strArray[3] = "World";


        int myintArray[] = {5,3,17,20};
        int result = sumArray(myintArray); //?? why not call name of function.sumarray. this is because it is in the same file + class
        //all each class file
        System.out.println(myintArray);

        //using for loops to list out print out
        //you cant just system.out.println say myIntArray
        // use arrays.toString
        // length is i-1
        for ( int i =0; i < myintArray.length; i++){
            System.out.println(myintArray[i] + " using for loop to print out");
        }



        //for comprehension if no particular length needed to be used
        for(int element: myintArray){
            System.out.println(element +" print out element using cleaner method");
        }
        //if want to print out can convert Array to String
        System.out.println(Arrays.toString(myintArray));

        System.out.println();
        int mySum= myintArray[0] + myintArray[3];
        System.out.println(mySum);

        System.out.println(myintArray[0] + myintArray[3]);
        myintArray[0] = 2;
        System.out.println(myintArray);
    }
}
