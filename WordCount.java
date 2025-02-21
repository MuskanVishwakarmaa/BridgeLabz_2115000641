import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String filePath = "sample.txt"; 

        // Call the method to count words and display the top 5 frequent words
        countWordsAndDisplayTop5(filePath);
    }

    // Method to count words in the file and display the top 5 frequent words
    public static void countWordsAndDisplayTop5(String filePath) {
        // Use a HashMap to store the words and their frequencies
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Use BufferedReader to read the file efficiently
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Split the line into words using space and punctuation delimiters
                String[] words = line.split("\\W+");
                
                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase(); // Convert to lowercase for case-insensitive counting
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1); // Update word frequency
                    }
                }
            }

            // Sort the words based on frequency in descending order
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
            sortedWords.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

            // Display the top 5 most frequent words
            System.out.println("Top 5 Most Frequent Words:");
            for (int i = 0; i < Math.min(5, sortedWords.size()); i++) {
                Map.Entry<String, Integer> entry = sortedWords.get(i);
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
