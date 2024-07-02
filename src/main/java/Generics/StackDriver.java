package Generics;

import java.util.Stack;

public class StackDriver {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<String>();

        stack.push("World");
        stack.push("Hello");
        System.out.println(stack);
        System.out.println(stack.top() + " Top word"); // Expected: "Hello"

        stack.pop();;
        System.out.println(stack + " Removed Top word : Hello");
        System.out.println(stack.top()); // Expected: "World"
        System.out.println(stack.size()); // Expected: 1


        //emptyandgreatest
        GenericStack <Integer> intStack = new GenericStack<Integer>();
        intStack.push(5);
        intStack.push(3);
        intStack.push (7);
        System.out.println(emptyAndaGetGreatest(intStack) + " is the greatest number"); //expected 7

        //check is stack is empty
        System.out.println(stack.size());  //expected 1



    }

    //empty stack and return greatest
    public static <T extends Comparable<T>> T emptyAndaGetGreatest (GenericStack<T> numList){

    /* check top
    then pop top
    compare last top to current top
    repeat until stack empty
   */

        // while size of stack > 0
        // pop
        // get top into temp
        // compare temp with greatest
        // set greatest if temp is bigger
        // loop

        T greatest = numList.top();

        // while size of stack > 0
        while( numList.size() > 0){
           numList.pop();

        // get top into temp
             T temp = numList.top();

             // compare temp with greatest
            if ( greatest.compareTo(temp) < 0){ //if greatest is smaller so set temp as greatest
                greatest = temp;
            }
        }
        return greatest;
    }

}
/*T top1 =  numList.top();
        numList.pop();

        T top2 = numList.top();
        numList.pop();

        if (top1.compareTo(top2) <0 ){
            return top2;
        }
        for (T num : numList){
            num = numList.top();
            numList.pop();
            num =numList.top();
            if (num.compareTo(num) <0  ){
                return num;
            }
        }
        return null;*/