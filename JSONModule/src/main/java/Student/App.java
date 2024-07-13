package Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class App {
    public static void main(String[] args) {

        //instance of a Student
        Student student = new Student("Joyceline", "Marealle", 27, true, 100.0);

        //create JSON file
       createJsonFile(student);

       //read JSON file
       System.out.println(readJsonFile());



    }

    public static  void createJsonFile(Student student){

        // Convert Java object to JSON
        try {
            ObjectMapper mapper = new ObjectMapper();
             mapper.writeValue(new File("student.json"), student);


        } catch (IOException e) {
            System.out.println(e.toString());
            System.out.println("Could not write to file");
        }

    }

    public static Student readJsonFile(){
        //read json file

        try{
            BufferedReader reader = new BufferedReader(new FileReader("student.json"));
            ObjectMapper mapper = new ObjectMapper();
            Student readStudent =  mapper.readValue(reader, Student.class);
            if (readStudent!=null){
                System.out.println(Student.class);
            }
            return readStudent;

        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Could not read from file");
            return null;
        }

    }
}