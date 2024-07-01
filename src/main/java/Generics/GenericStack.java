package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenericStack<T> {
    List<T> list = new ArrayList<>();

    // put onto stack
    void push(T item) {
        list.add(item);
    }

    //return top of stack
    T top() {
        T x = list.get(list.size() - 1);
        return x;

    }

    // pop and discard top of stack
    void pop() {
        list.remove(top());
    }

    // number of elements in stack
    int size() {
        int n = list.size();
        return n;
    }


    @Override
    public String toString() {
        return "GenericStack{" +
                "list=" + list +
                '}';
    }
}

//public class <T> emptyAndaGetGreatest (){}
/* top is the last that went in so will be at the top of stack
     per array will be last in array. Size is n-1 since index start at 0
     */

/*For push use list method to add so when use push method it add items to stack.
No use of building in function */