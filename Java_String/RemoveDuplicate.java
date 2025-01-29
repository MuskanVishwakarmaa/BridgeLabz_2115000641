import java.util.HashSet;

public class RemoveDuplicate{
    public static void main(String[] args) {
        String input = "programming";
        
        // Create a HashSet to store unique characters
        HashSet<Character> seenCharacters = new HashSet<>();
        
        // StringBuilder to build the result without duplicates
        StringBuilder result = new StringBuilder();
        
        // Iterate through the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // If the character is not in the HashSet, add it to the result and the HashSet
            if (!seenCharacters.contains(ch)) {
                result.append(ch);
                seenCharacters.add(ch);
            }
        }
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result.toString());
    }
}
