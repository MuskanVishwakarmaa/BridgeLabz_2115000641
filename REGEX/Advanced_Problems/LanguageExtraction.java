import java.util.Scanner;
import java.util.regex.*;

public class LanguageExtraction {
    public static void main(String[] args) {
        String regex = "\\b(Java|Python|JavaScript|Go|C|Ruby|Kotlin)\\b";
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter text: ");
            String text = sc.nextLine();
            
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            
            // Find matches and directly join them in a single step
            String result = matcher.results()
                                    .map(matchResult -> matchResult.group())
                                    .reduce((a, b) -> a + ", " + b) 
                                    .orElse(""); 
            
            System.out.println(result.isEmpty() ? "No programming languages found." : result);
        }
    }
}