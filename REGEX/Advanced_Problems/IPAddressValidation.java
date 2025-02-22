import java.util.Scanner;

public class IPAddressValidation {
    public static void main(String args[]) {
        // Regex to match a valid IPv4 address
        String regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter IPv4 Address: ");
            String address = sc.nextLine();
            
            // Validate if the input matches the regex pattern
            System.out.println(address.matches(regex) ? "Valid" : "Invalid");
        }
    }
}
