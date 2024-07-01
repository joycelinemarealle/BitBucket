package Generics;

import java.util.Stack;

public class StackDriver {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();

        stack.push("World");
        stack.push("Hello");
        System.out.println(stack);
        System.out.println(stack.top() + " Top word"); // Expected: "Hello"

        stack.pop();;
        System.out.println(stack + " Removed Top word : Hello");
        System.out.println(stack.top()); // Expected: "World"
        System.out.println(stack.size()); // Expected: 1
    }
}
