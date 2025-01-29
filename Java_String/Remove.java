import java.util.Scanner;
public class Remove{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char charToRemove = sc.next().charAt(0);
        
        // Call the method to remove the specific character
        String modifiedString = removeCharacter(input, charToRemove);
        System.out.println("Modified String: " + modifiedString);
        sc.close();
    }

    // Method to remove all occurrences of a specific character from the string
    public static String removeCharacter(String str, char charToRemove) {
        // Use String's replace method to remove all occurrences of the specified character
        return str.replace(Character.toString(charToRemove), "");
    }
}
