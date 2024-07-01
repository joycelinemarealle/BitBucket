package JavaIOFileHandling;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;


public class InputOutput {
    public static void main(String[] args) {

        String path = "C:\\files\\Alice.txt";

        int wordCount = wordCount(path);
        System.out.println("The total word count is " + wordCount);

        Map <String, Integer> wordFrequency = wordFrequency(path);
        System.out.println("The hashmap of word half Frequencies is " +  wordFrequency);

    }

    //Static method for wordCount
    public static int wordCount(String path) {
        int wordTotal = 0; //initialize wordTotal here
        try (BufferedReader br = Files.newBufferedReader(Path.of(path))) {
            String line ;

            //read every line and then store in string line
            while ((line = br.readLine()) != null) {

                //words in a word array get length of word array in each line and add
                String[] words = line.split(" ");
                wordTotal = wordTotal + words.length;

            }

        } catch (IOException e) {


            e.printStackTrace();
            return 0;
        }
        return wordTotal;
    }

    //Static method
    public static Map <String, Integer >  wordFrequency(String path) {
        Map<String, Integer> wordFrequencyAmount = new HashMap<>();

        int halfCount = 0;
        String half = "half";
        try (BufferedReader br = Files.newBufferedReader(Path.of(path))) {
            String line ;

            //read every line
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");

                //for every word in words array find half ignore case Half= half
                for (String w : words) {
                    if (w.equalsIgnoreCase(half))
                        halfCount += 1;
                }
                wordFrequencyAmount.put(half, halfCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return wordFrequencyAmount;
    }
}

  /*every line split by space
             put words in array
             conver
             then find  word half in every line
             then add the word and count to hash map
              */
/*
* Store txt in folder in This PC\Local disk\Users\JoycelineMarealle\files
* split lines
* count words in each line
* add the words to get total*
//        Path path = Paths.get("C:\\Users\\JoycelineMarealle\\files\\Alice.txt");
//        Path path2 = Path.of("/Users", "JoycelineMarealle", "files", "Alice.txt"); */