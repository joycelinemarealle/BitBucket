package JavaIOFileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputOutput {
    public static void main(String[] args) {

        String path = "C:\\files\\Alice.txt";
        System.out.println("The total word count is " + wordCount(path));
    }

    //Static method for wordCount
    public static int wordCount(String path) {
        int wordTotal;
        try (BufferedReader br = Files.newBufferedReader(Path.of(path))) {
            String line;
            wordTotal = 0;

            //read every line and then store in string line
            while ((line = br.readLine()) != null) {

                /*words in a word array get length of word array in each line and add */
                String[] words = line.split(" ");
                wordTotal = wordTotal + words.length;

            }

        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
        return wordTotal;
    }
}
/*
* Store txt in folder in This PC\Local disk\Users\JoycelineMarealle\files
* split lines
* count words in each line
* add the words to get total*
//        Path path = Paths.get("C:\\Users\\JoycelineMarealle\\files\\Alice.txt");
//        Path path2 = Path.of("/Users", "JoycelineMarealle", "files", "Alice.txt"); */