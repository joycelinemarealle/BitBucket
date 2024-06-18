package Interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentTester {
    public static void main(String[] args) {

        //have the students
        Student s1 = new Student ("Joyceline", "Marealle", 23);
        Student s2 = new Student ("Lion", "Simba", 10 );
        Student s3 = new Student ("Adam", "Simba", 50);

        //add to Lists
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        //collection
        Collections.sort(students);
        System.out.println(students.toString());
    }
}
