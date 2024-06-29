package CollectionPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Integer> myNumList = new ArrayList<>();
        myNumList.add(7);

        for ( Integer i : myNumList){
            System.out.println(i);
        }

        //ArrayList
        List <Person> myList = new ArrayList<>();
        myList.add(new Person("Alice", 30));
        myList.add(new Person ("Joy", 27));

        //find is people in list
        Person toFind = new Person("Alice", 27);

        boolean searchPerson = searchList(myList, toFind);
        System.out.println(searchPerson);

        //search by name if perosn in list
        String nameToFind = "Alice";
        boolean searchByName = searchByName(myList,"Alice");
        System.out.println(searchByName);


        //LinkedList
        List <Person> listOfPeople = new LinkedList<>();
        listOfPeople.add(new Person("Eve", 27));
        listOfPeople.add(new Person("Elton", 28));


        //Check if name exists. Use same static methods since takes in List which includes Linked +Array
        System.out.println(searchByName(listOfPeople, "Elton"));

    }

//search if person in it
    public static boolean searchList ( List <Person> listOfPeople, Person toFind){
       if( listOfPeople.contains(toFind)){
           return true;
       } else {
           return false;
       }

    }

    //method to search by name
    public static boolean searchByName ( List <Person> listOfPeople, String nametoFind){
        for ( Person p : listOfPeople){
            if ( p.name.equalsIgnoreCase(nametoFind)){
                return true;
            }
        }
        return false;

    }
}
