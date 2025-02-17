import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderVsInputStreamReader {

    public static void main(String[] args) throws IOException {
        String filePath = "Read.txt";
        
        // Measure time for FileReader (Character Stream)
        long startFileReader = System.nanoTime();
        readFileUsingFileReader(filePath);
        long endFileReader = System.nanoTime();
        System.out.println("FileReader Time: " + (endFileReader - startFileReader) / 1_000_000 + " ms");

        // Measure time for InputStreamReader (Byte Stream)
        long startInputStreamReader = System.nanoTime();
        readFileUsingInputStreamReader(filePath);
        long endInputStreamReader = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (endInputStreamReader - startInputStreamReader) / 1_000_000 + " ms");
    }

    // Method to read file using FileReader
    private static void readFileUsingFileReader(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        int data;
        while ((data = fileReader.read()) != -1) {
        }
        fileReader.close();
    }

    // Method to read file using InputStreamReader
    private static void readFileUsingInputStreamReader(String filePath) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
        int data;
        while ((data = inputStreamReader.read()) != -1) {
        }
        inputStreamReader.close();
    }
}
