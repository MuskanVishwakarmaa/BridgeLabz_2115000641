import java.io.*;
import java.util.Arrays;

public class LargeCSVReader {
    public static void main(String[] args) {
        String filePath = "src/main/resources/students.csv"; // CSV File Path
        int batchSize = 100; // Process in chunks of 100 lines
        int totalRecords = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int count = 0;

            String header = br.readLine();
            System.out.println("Header: " + header);

            while ((line = br.readLine()) != null) {
                System.out.println(Arrays.toString(line.split(",")));

                count++;
                totalRecords++;

                if (count == batchSize) {
                    System.out.println("Processed " + totalRecords + " records so far...");
                    count = 0;
                }
            }

            System.out.println("Finished processing " + totalRecords + " records.");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
