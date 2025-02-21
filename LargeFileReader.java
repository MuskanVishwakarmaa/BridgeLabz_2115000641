import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        String filePath = "large_file.txt"; 

        // Call the method to read the file and print lines containing "error"
        readFileAndPrintErrors(filePath);
    }

    // Method to read a file line by line and print lines containing "error"
    public static void readFileAndPrintErrors(String filePath) {
        // Use BufferedReader for efficient reading of large files
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Check if the line contains the word "error" (case insensitive)
                if (line.toLowerCase().contains("error")) {
                    // Print the line containing "error"
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
