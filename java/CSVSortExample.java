import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class CSVSortExample {
    public static void main(String[] args) {
        String filePath = "src/main/resources/employees.csv"; // CSV file path

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();

            String[] header = records.remove(0);
            records.sort(Comparator.comparingDouble(row -> -Double.parseDouble(row[3])));

            // Print the top 5 highest-paid employees
            System.out.println(String.join(", ", header));
            for (int i = 0; i < Math.min(5, records.size()); i++) {
                System.out.println(String.join(", ", records.get(i)));
            }

        } catch (IOException | CsvException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
