package CollectionPractice;

import java.util.*;

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


        //Set implementations
        Set <Person> people = new HashSet<Person>();
        people.add(new Person("George", 13));
        people.add(new Person ("Lola", 10));

        //See if present in Set
        Person toFindInSet = new Person ( "Joy", 27);
        System.out.println(searchIfPresentInSet(people,toFind));


        //Maps

        Map < Integer, Person> peopleMap = new HashMap<> ();
        Person person1  = new Person ("Joy", 27);
        Person person2 = new Person ( "Eva", 27);
        peopleMap.put(1,person1 );
        peopleMap.put(2, person2);


        //Hash Map for Key and Sorted Values
        Map <Integer, SortedSet <Person>>  peopleMap2= new Hashtable<>();

        //Create a key and new empty drawer for person object with key 1
        peopleMap2.putIfAbsent(1, new TreeSet<>());
        peopleMap2.putIfAbsent(2, new TreeSet<>());


        //Add Person objects to SortedSet based on key
        SortedSet <Person> people1 = peopleMap2.get(1);
        people1.add(person1);

        SortedSet <Person> people2 = peopleMap2.get(2);
        people2.add(person2);
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

    //method for sets to check if people in set
    public static boolean searchIfPresentInSet ( Set <Person> people, Person toFind){
       if ( people.contains(toFind)) {
           return true;
       } else{
           return false;
       }
    }
}
