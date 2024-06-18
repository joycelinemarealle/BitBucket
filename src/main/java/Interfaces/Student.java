package Interfaces;

public class Student implements Comparable<Student> { //has Comparable method insert the class student. Hit alt + enter to implement mehethods
    //data attributes
    String firstname;
    String surname;
    int studentId;

    //constructor
    public Student( String firstname , String surname, int studentId){
        this.firstname = firstname;
        this.surname= surname;
        this.studentId = studentId;
    }

    //Getter and setters

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    //to print


    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", studentId=" + studentId +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //4
        return Integer.compare(this.studentId, o.studentId);

       /* int surnameComparision= this.surname.compareTo(o.surname); //captures result if surname
        if (surnameComparision !=0){
            return surnameComparision; //not equal so can compare by surnmae . Will be -1 or +1. 0 mean equal
        }
        return this.firstname.compareTo(o.firstname);
*/
        //if result == 0 then both surname are the same then check first names
    }
}
