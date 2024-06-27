package JavaIOFileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class InputOutput {
    public static void main(String[] args) {
    // C:\\Users\\JoycelineMarealle\\files\\Alice.txt

//        Path path = Paths.get("C:\\Users\\JoycelineMarealle\\files\\Alice.txt");
//        Path path2 = Path.of("/Users", "JoycelineMarealle", "files", "Alice.txt");

        try (BufferedReader br = Files.newBufferedReader(Path.of("C:\\files\\Alice.txt"))){

        //try (BufferedReader br = Files.newBufferedReader (path)){
           String line;
           int wordCount = 0;
           int lineCount = 0;


           //read every line and then store in string line
           while ((line = br.readLine()) != null){

               /*words in a word array
               * get length of word array in each line and add */
               String[] words = line.split(" ");
               wordCount = wordCount + words.length;

            }
            System.out.println("The total word count is " + wordCount);
       } catch ( FileNotFoundException e){
           e.printStackTrace();

       } catch (IOException e){
           e.printStackTrace();
       }
    }
}
/*
* Store txt in folder in This PC\Local disk\Users\JoycelineMarealle\files
* split lines
* count words in each line
* add the words to get total*/