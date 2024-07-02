package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Generics {
    public static void main(String[] args) {
        List<Integer> intsList = Arrays.asList(1, 5, 7, 2, 3);
        List<String> strsList = Arrays.asList("Java", "World", "Hello");
        System.out.println(reverse(intsList)); // Expected: [3, 2, 7, 5, 1]
        System.out.println(reverse(strsList)); // Expected: ["Hello", "World", "Java"]
    }

    public static <T> List<T> reverse(List<T> list){
        List <T> reverseList= new ArrayList<>();
        for (int t = list.size()-1; t >= 0 ;t--){
            reverseList.add(list.get(t));
        }
        return reverseList;
    }
}

/*never call class List
* int t index not T
* need <T> to tell Java
* returning a List of type <T> method takes in List <T>
create a array List reverse List
index from size of list to t>=0 ; t--
* add each element in the new reverse list*/