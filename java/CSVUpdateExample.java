import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.io.*;
import java.util.List;

public class CSVUpdateExample {
    public static void main(String[] args) {
        String inputFilePath = "src/main/resources/employees.csv";  // Original CSV file
        String outputFilePath = "src/main/resources/updated_employees.csv";  // Updated CSV file

        try (CSVReader reader = new CSVReader(new FileReader(inputFilePath));
             CSVWriter writer = new CSVWriter(new FileWriter(outputFilePath))) {

            List<String[]> records = reader.readAll();

            for (int i = 1; i < records.size(); i++) {
                String[] row = records.get(i);
                if (row[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(row[3]);
                    salary *= 1.10; // Increase by 10%
                    row[3] = String.format("%.2f", salary);
                }
            }

            writer.writeAll(records); // Save updated records
            System.out.println("Salaries updated and saved to " + outputFilePath);

        } catch (IOException | CsvException e) {
            System.err.println("Error processing the file: " + e.getMessage());
        }
    }
}
