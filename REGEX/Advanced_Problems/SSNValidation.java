import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSNValidation{

    public static void main(String[] args) {
        String validSSN = "123-45-6789";
        String invalidSSN = "123456789";
        
        System.out.println(validateSSN(validSSN));
        System.out.println(validateSSN(invalidSSN));
    }

    // Method to validate SSN and return result
    private static String validateSSN(String input) {
        String ssn = extractAndValidateSSN(input);
        
        if (ssn != null) {
            return "\"" + ssn + "\" is valid";
        } else {
            return "\"" + input + "\" is invalid";
        }
    }

    // Method to extract and validate SSN in one step
    private static String extractAndValidateSSN(String input) {
        Pattern pattern = Pattern.compile("\\b\\d{3}-\\d{2}-\\d{4}\\b");
        Matcher matcher = pattern.matcher(input);
        
        if (matcher.find()) {
            String ssn = matcher.group();
            // Validate SSN format (XXX-XX-XXXX)
            if (ssn.matches("^\\d{3}-\\d{2}-\\d{4}$")) {
                return ssn;
            }
        }
        return null;
    }
}