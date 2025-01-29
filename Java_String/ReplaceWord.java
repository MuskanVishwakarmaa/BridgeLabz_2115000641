import java.util.Scanner;
public class ReplaceWord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();
        System.out.print("Enter the new word: ");
        String newWord = sc.next();

        // Call the replaceWord method to replace the word in the sentence
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // Display the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);
        sc.close();
    }

    // Method to replace a given word with another word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Using regular expression to match the whole word
        String regex = "\\b" + oldWord + "\\b";  // \b ensures that only whole words are replaced
        return sentence.replaceAll(regex, newWord);
    }
}
