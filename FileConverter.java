import java.io.*;

public class FileConverter {
    public static void main(String[] args) {
        String inputFile = "input.txt";   
        String outputFile = "output.txt"; 

        try {
            // Convert content: uppercase to lowercase and write to output file
            convertFile(inputFile, outputFile);
            System.out.println("File conversion complete: Uppercase to Lowercase.");
        } catch (IOException e) {
            System.out.println("Error during file conversion: " + e.getMessage());
        }
    }

    // Method to convert uppercase letters to lowercase in a text file
    public static void convertFile(String inputFile, String outputFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile, java.nio.charset.StandardCharsets.UTF_8));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, java.nio.charset.StandardCharsets.UTF_8))) {
            
            int character;
            // Read file character by character
            while ((character = reader.read()) != -1) {
                char charToWrite = Character.toLowerCase((char) character);
                writer.write(charToWrite);
            }
        }
    }
}
