import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Problem3{
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Define DateTimeFormatter patterns
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        
        // Format the current date in the required formats
        String formattedDate1 = currentDate.format(formatter1);
        String formattedDate2 = currentDate.format(formatter2);
        String formattedDate3 = currentDate.format(formatter3);
        
        // Display the formatted dates
        System.out.println("Date in dd/MM/yyyy format: " + formattedDate1);
        System.out.println("Date in yyyy-MM-dd format: " + formattedDate2);
        System.out.println("Date in EEE, MMM dd, yyyy format: " + formattedDate3);
    }
}
