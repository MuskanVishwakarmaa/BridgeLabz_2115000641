import java.util.Scanner;

public class CreditCardValidation {
    public static void main(String args[]) {
        // Combined regex for Visa and MasterCard validation
        String visaRegex = "^4\\d{15}$";  // Visa starts with 4 and has exactly 16 digits
        String masterCardRegex = "^5\\d{15}$";  // MasterCard starts with 5 and has exactly 16 digits
        
        // Read card number input from user
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Credit Card Number: ");
            String cardNumber = sc.nextLine();
            
            // Validate the card type based on regex patterns
            if (isValidCard(cardNumber, visaRegex)) {
                System.out.println("Valid Visa Card");
            } else if (isValidCard(cardNumber, masterCardRegex)) {
                System.out.println("Valid MasterCard");
            } else {
                System.out.println("Invalid Card Number");
            }
        }
    }

    // Method to validate card based on provided regex
    private static boolean isValidCard(String cardNumber, String regex) {
        return cardNumber.matches(regex);
    }
}