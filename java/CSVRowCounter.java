import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVRowCounter {
    public static void main(String[] args) {
        String filePath = "src/main/resources/employees.csv"; // Path to CSV file

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            int rowCount = records.size() - 1;
            System.out.println("Total Records (excluding header): " + rowCount);
        } catch (IOException | CsvException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
