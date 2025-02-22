import java.util.Scanner;
import java.util.regex.*;
import java.util.HashSet;
import java.util.Set;

public class RepeatingWords {
    public static void main(String[] args) {
        String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";  
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Sentence: ");
            String sentence = sc.nextLine();

            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(sentence);

            // Store matched words in a set to avoid duplicates
            Set<String> repeatingWords = new HashSet<>();

            // Find all matches and add them to the set
            while (matcher.find()) {
                repeatingWords.add(matcher.group(1).toLowerCase());  
            }

            // Output the repeating words as a comma-separated list
            System.out.println(repeatingWords.isEmpty() ? "No repeating words found." : String.join(", ", repeatingWords));
        }
    }
}
