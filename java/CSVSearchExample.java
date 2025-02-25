import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CSVSearchExample {
    public static void main(String[] args) {
        String filePath = "src/main/resources/employees.csv"; // CSV file path
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name to search: ");
        String searchName = scanner.nextLine().trim();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            boolean found = false;

            for (int i = 1; i < records.size(); i++) {
                String[] row = records.get(i);
                String name = row[1].trim();

                if (name.equalsIgnoreCase(searchName)) {
                    System.out.printf("Employee Found: Name: %s, Department: %s, Salary: %s%n", row[1], row[2], row[3]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee not found.");
            }
        } catch (IOException | CsvException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
