package oop;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String fName, String lName, int a) {
        this.firstName = fName;
        this.lastName = lName;
        this.age = a;
    }
    public Person(String fName, String lName) {
        this(fName, lName, 100);
    }
    public Person(String fName) {
        this(fName, "Doe");
    }
    public Person() {
        this("Jane");
    }

}
