import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Problem2{
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Date input from user (in the format yyyy-MM-dd)
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();
        
        // Parse the input string to LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Add 7 days, 1 month, and 2 years to the input date
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        
        // Subtract 3 weeks from the updated date
        updatedDate = updatedDate.minusWeeks(3);
        
        // Display the final result
        System.out.println("Original Date: " + date);
        System.out.println("Updated Date: " + updatedDate);
    }
}
