import java.util.Scanner;
public class CompareString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        // Call the method to compare the two strings lexicographically
        int result = compareStringsLexicographically(str1, str2);
        
        // Display the result based on the comparison
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are lexicographically equal");
        }
        sc.close();
    }

    // Method to compare two strings lexicographically without using built-in compare methods
    public static int compareStringsLexicographically(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        
        // Compare characters at each position
        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            
            if (ch1 < ch2) {
                return -1; // str1 is lexicographically smaller
            } else if (ch1 > ch2) {
                return 1; // str1 is lexicographically greater
            }
        }
        
        // If strings are identical up to the minimum length, the shorter string comes first
        if (str1.length() < str2.length()) {
            return -1;
        } else if (str1.length() > str2.length()) {
            return 1;
        }
        return 0;
    }
}
