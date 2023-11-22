import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.HashSet;

public class SpellChecker {
    public static void main(String[] args)  {
        HashSet<String> dictionary = new HashSet<>();
       
        
        try (BufferedReader reader = new BufferedReader(new FileReader("dictionary.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                dictionary.add(line.toLowerCase()); 
            }
        } catch (IOException e) {
            System.err.println("Error reading dictionary.txt: " + e.getMessage());
            return;
        }
       
        try (BufferedReader reader = new BufferedReader(new FileReader("words.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!dictionary.contains(word.toLowerCase())) {
                        System.out.println("Misspelled word: " + word);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading words.txt: " + e.getMessage());
        }
    }

}