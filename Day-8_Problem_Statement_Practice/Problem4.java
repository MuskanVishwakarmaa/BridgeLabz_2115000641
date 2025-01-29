import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Problem4{
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner sc = new Scanner(System.in);
        
        // Date input format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // Taking two date inputs from the user
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateInput = sc.nextLine();
        
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateInput = sc.nextLine();
        
        // Parse the input strings into LocalDate objects
        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);
        
        // Compare the two dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date is the same as the second date.");
        }
        
        sc.close();
    }
}
