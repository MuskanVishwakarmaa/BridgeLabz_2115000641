import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

public class CSVValidationExample {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");

    public static void main(String[] args) {
        String filePath = "src/main/resources/employee_data.csv"; // Updated CSV file path

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();

            // Read and skip header row
            records.remove(0);

            System.out.println("Validating records...\n");

            for (String[] row : records) {
                String email = row[4];  // Email column index
                String phone = row[5];  // Phone column index

                boolean isEmailValid = EMAIL_PATTERN.matcher(email).matches();
                boolean isPhoneValid = PHONE_PATTERN.matcher(phone).matches();

                if (!isEmailValid || !isPhoneValid) {
                    System.out.println("Invalid Record: " + String.join(", ", row));
                    if (!isEmailValid) {
                        System.out.println("  ❌ Invalid Email: " + email);
                    }
                    if (!isPhoneValid) {
                        System.out.println("  ❌ Invalid Phone Number: " + phone);
                    }
                }
            }

        } catch (IOException | CsvException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
