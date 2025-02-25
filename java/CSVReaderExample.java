import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVReaderExample {
    public static void main(String[] args) {
        String filePath = "src/main/resources/students.csv"; // Path to CSV file

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            System.out.println("Student Details:");
            for (int i = 1; i < records.size(); i++) {
                String[] row = records.get(i);
                System.out.printf("ID: %s, Name: %s, Age: %s, Marks: %s%n", row[0], row[1], row[2], row[3]);
            }
        } catch (IOException | CsvException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
