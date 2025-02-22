public class CensorBadWords {
    public static void main(String[] args) {
        // List of bad words to be censored
        String[] badWords = {"damn", "stupid"};

        // Build the regex pattern to match any of the bad words
        String regex = String.join("|", badWords);

        // Hardcoded sentence
        String sentence = "This is a damn bad example with some stupid words.";

        // Replace all occurrences of bad words with '****'
        String censoredSentence = sentence.replaceAll("(?i)\\b(" + regex + ")\\b", "****");

        // Print the censored sentence
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Censored Sentence: " + censoredSentence);
    }
}
