import java.util.Scanner;

public class UsernameValidation {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$"; 

        try (Scanner sc = new Scanner(System.in)) { 
            System.out.print("Enter Username: ");
            String userName = sc.nextLine();

            System.out.println(userName.matches(regex) ? "Valid" : "Invalid");
        }
    }
}