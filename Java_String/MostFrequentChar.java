import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentChar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Call the method to find the most frequent character
        char result = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: '" + result + "'");
        sc.close();
    }

    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter(String str) {
        // Create a map to store frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Loop through the string and populate the frequency map
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        
        // Variables to store the most frequent character and its frequency
        char mostFrequentChar = str.charAt(0);
        int maxFrequency = 0;
        
        // Loop through the map to find the character with the highest frequency
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        return mostFrequentChar;
    }
}
