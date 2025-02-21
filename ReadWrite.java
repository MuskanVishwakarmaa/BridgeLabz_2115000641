import java.io.*;

public class ReadWrite {
    public static void main(String[] args) {
        // Specify source and destination file paths
        String sourceFile = "source.txt";  
        String destinationFile = "destination.txt"; 

        // Check if the source file exists
        File srcFile = new File(sourceFile);
        if (!srcFile.exists()) {
            System.out.println("Error: Source file does not exist.");
            return; // Exit the program
        }

        // Ensure the destination file exists or create it
        File destFile = new File(destinationFile);
        try {
            if (!destFile.exists()) {
                destFile.createNewFile(); // Creates the destination file if it does not exist and copy it
                System.out.println("Note: Destination file was created.");
            }
        } catch (IOException e) {
            System.out.println("Error: Could not create destination file.");
            return;
        }

        // File handling using FileInputStream and FileOutputStream
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            
            // Buffer to hold data while transferring
            byte[] buffer = new byte[1024];  
            int bytesRead;

            // Read from source and write to destination
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
