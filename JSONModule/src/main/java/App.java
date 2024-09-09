import java.io.File;
import java.io.IOException;
import java.lang.runtime.ObjectMethods;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args)  {
        Student student = new Student(" Joyceline", "Marealle", 27, true, 100.0);

        //convert java object to JSON
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File ("student.json"), student);

        } catch (IOException e){
            System.out.println( e.toString());
            System.out.println("Could not find file");
        }

    }


}
