import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVFilterExample {
    public static void main(String[] args) {
        String filePath = "src/main/resources/students.csv"; // CSV file path

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            System.out.println("Students with marks > 80:");

            for (int i = 1; i < records.size(); i++) {
                String[] row = records.get(i);
                int marks = Integer.parseInt(row[3]);

                if (marks > 80) {
                    System.out.printf("ID: %s, Name: %s, Age: %s, Marks: %s%n", row[0], row[1], row[2], row[3]);
                }
            }
        } catch (IOException | CsvException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
