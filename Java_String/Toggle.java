import java.util.Scanner;
public class Toggle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Call the method to toggle the case of each character
        String toggledString = toggleCase(input);
        System.out.println("String after toggling the case: " + toggledString);
        sc.close();
    }

    // Method to toggle the case of each character in the string
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        
        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Toggle the case using Character methods
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch)); // Convert to lowercase if uppercase
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch)); // Convert to uppercase if lowercase
            } else {
                result.append(ch); // Non-alphabet characters remain unchanged
            }
        }
        return result.toString();
    }
}
