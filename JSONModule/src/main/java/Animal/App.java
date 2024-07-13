package Animal;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.*;
import java.io.IOException;

public class App {


    public static void main(String[] args) {


        System.out.println(readJSONString());

    }

    public static Animal readJSONString() {
        try {
            //JSON string
            String input = "{\"type\":\"Cat\",\"name\":\"fluffles\",\"age\":3}";
            ObjectMapper mapper = new ObjectMapper();

            //convert JSON to java object
            Animal animal = mapper.readValue(input, Animal.class);

            //only convert if animal object not null
            if (animal != null) {
                System.out.println(Animal.class);
            }
            return animal;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("String not found");
            return null;
        }

    }


}
