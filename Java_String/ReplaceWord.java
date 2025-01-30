import java.util.Scanner;
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();
        System.out.print("Enter the new word: ");
        String newWord = sc.next();
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + modifiedSentence);
        sc.close();
    }
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        String modifiedSentence = "";
        for (String word : words) {
            if (word.equals(oldWord)) {
                modifiedSentence += newWord + " ";
            } else {
                modifiedSentence += word + " ";
            }
        }
        return modifiedSentence.trim();
    }
}

