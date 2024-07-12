import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class App {
    public static void main(String[] args) {
        Student student = new Student("Joyceline", "Marealle", 27, true, 100.0);

       createJsonFile(student);
     Student readStudent =  readJsonFile();
     if (readStudent!=null){
         System.out.println("Student read from JSON" + readStudent.getFirstName());
     }


    }

    public static void createJsonFile(Student student){

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
            return mapper.readValue(reader, Student.class);

        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Could not read from file");
            return null;
        }

    }
}