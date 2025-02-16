public class SearchWord {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; // Return the first matching sentence
            }
        }
        return "Not Found"; // If no sentence contains the word
    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is a powerful programming language.",
            "The weather today is sunny and warm."
        };

        String word = "Java"; // Word to search for
        String result = findSentenceWithWord(sentences, word);

        System.out.println("Sentence containing '" + word + "': " + result);
    }
}
