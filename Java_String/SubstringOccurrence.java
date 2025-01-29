import java.util.Scanner;

public class SubstringOccurrence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();

        System.out.print("Enter the substring: ");
        String substring = sc.nextLine();

        // Call the method to count occurrences of the substring
        int count = countSubstringOccurrences(mainString, substring);
        System.out.println("The substring occurs " + count + " times.");
        sc.close();
    }

    // Method to count occurrences of the substring in the main string
    public static int countSubstringOccurrences(String mainString, String substring) {
        int count = 0;
        int index = 0;

        // Loop to find all occurrences of the substring
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();  // Move the index forward to continue searching
        }
        return count;
    }
}






