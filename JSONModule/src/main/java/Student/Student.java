package Student;

public class Student {
    String firstName;
    String lastName;
    int age;
    Boolean feesPaid;
    double marks;


    //to read JSON file need a no - argument constructor
    public Student (){

    }
    public Student(String firstName, String lastName, int age, Boolean feesPaid, double marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.feesPaid = feesPaid;
        this.marks = marks;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(Boolean feesPaid) {
        this.feesPaid = feesPaid;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student.Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", feesPaid=" + feesPaid +
                ", marks=" + marks +
                '}';
    }
}
