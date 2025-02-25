import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriterExample {
    public static void main(String[] args) {
        String filePath = "src/main/resources/employees.csv"; // CSV file path

        String[] header = {"ID", "Name", "Department", "Salary"};
        String[][] employees = {
                {"201", "Aditya", "IT", "75000"},
                {"202", "Yash", "HR", "68000"},
                {"203", "Anirudh", "Finance", "72000"},
                {"204", "Adarsh", "Marketing", "71000"},
                {"205", "Rashmi", "Operations", "73000"}
        };

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            writer.writeNext(header);
            for (String[] employee : employees) {
                writer.writeNext(employee); // Writing employee records
            }
            System.out.println("CSV file created successfully: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
