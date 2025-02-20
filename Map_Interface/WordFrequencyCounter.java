import java.io.*;
import java.util.*;


public class WordFrequencyCounter {
    public static void main(String[] args) {
        String filePath = "text.txt";  


        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Error: File not found at " + filePath);
            return;
        }


        Map<String, Integer> wordFrequency = countWordFrequency(filePath);
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> wordFrequency = new HashMap<>();


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;


            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");


                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }


        return wordFrequency;
    }
}

