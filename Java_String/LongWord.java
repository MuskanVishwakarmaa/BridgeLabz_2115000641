import java.util.Scanner;

public class LongWord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        // Split the sentence into words using space as the delimiter
        String[] words = sentence.split(" ");
        
        // Initialize variables to store the longest word and its length
        String longestWord = "";
        
        // Loop through the words to find the longest one
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word in the sentence is: " + longestWord);
        sc.close();
    }
}
