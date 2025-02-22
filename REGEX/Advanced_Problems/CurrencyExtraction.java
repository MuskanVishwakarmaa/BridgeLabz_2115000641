import java.util.Scanner;
import java.util.regex.*;

public class CurrencyExtraction {
    public static void main(String[] args) {
        // Regex to match currency values (e.g., $45.99 or 10.50)
        String regex = "(\\$\\d+(\\.\\d{2})?|\\d+(\\.\\d{2})?)";

        try (Scanner sc = new Scanner(System.in)) {
            // Take user input for the text
            System.out.println("Enter text: ");
            String text = sc.nextLine();
            
            // Compile the regex and create a matcher
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            
            // Find matches and join them in a single step
            String result = matcher.results()
                                    .map(MatchResult::group)  // Get each matched currency value
                                    .reduce((a, b) -> a + ", " + b)  // Concatenate the results
                                    .orElse("");  // If no matches, return empty string
            
            // Output the result
            System.out.println(result.isEmpty() ? "No currency values found." : result);
        }
    }
}