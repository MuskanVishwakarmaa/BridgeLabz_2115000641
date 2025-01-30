import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        sc.close();
    }
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] charArray1 = new char[str1.length()];
        char[] charArray2 = new char[str2.length()];
        int index1 = 0, index2 = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                charArray1[index1++] = str1.charAt(i);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != ' ') {
                charArray2[index2++] = str2.charAt(i);
            }
        }
        Arrays.sort(charArray1, 0, index1);
        Arrays.sort(charArray2, 0, index2);
        return Arrays.equals(charArray1, charArray2);
    }
}
