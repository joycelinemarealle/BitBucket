package Collections;

import java.util.ArrayList;
import java.util.List;

class Fruit {}
class Apple extends Fruit {}
class Banana extends Fruit {}

class RedApple extends Apple {}
class GreenApple extends Apple {}
public class TestErasure {


    // public static <T1, T2, TResult> TResult doSomething(T1 a, T2 b) {

    // }

    public static void main(String[] args) {
        // print("Hi");
        // print(new Message());


        // String s = "Hello World";

        // Class<? extends String> stringClazz = s.getClass();


        String[] strings = new String[10];
        strings[0] = "Hi";
        strings[1] = "Bye";

        Object[] arr = strings;
        arr[3] = 42;
        arr[4] = "Bang!";

        for(String s : strings) {
            System.out.println(s);
        }
        

        List<Apple> apples = new ArrayList<>();

        printFruit(apples);

        List<Object> objs = new ArrayList<>();
        List<Fruit> fruits = new ArrayList<>();
        List<Apple> apples2 = new ArrayList<>();
        List<GreenApple> greenApples = new ArrayList<>();


        addItem(apples2);
        

    }

    // Puts principal
    public static void addItem(List<? super Apple> l) {
    
        l.add(new RedApple());
        l.add(new GreenApple());
    }

    // Gets principal
    public static void printFruit(List<? extends Fruit> l) {

        Fruit f = l.get(1);

        // for(Fruit f : l) {
        //     System.out.println(f);
        // }
    }
    static void print(Integer i) {

    }
    static void print(Double d) {

    }
    static <T> void print(T t) {
        System.out.println(t);
    }
}
class Message {
    @Override
    public String toString() {
        return "Bye";
    }
}
