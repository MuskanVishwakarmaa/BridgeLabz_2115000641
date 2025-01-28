import java.util.Scanner;
public class SpringSeason {
    public static boolean seasonChecker(int month, int day) {
        if ((month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) ||
            (month == 6 && day >= 1 && day <= 20)) {
            return true; // It's spring season
        }
        return false; // Not spring season
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter Day: ");
        int day = sc.nextInt();
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid input! Please enter a valid month (1-12) and day (1-31).");
        } else {
            boolean isSpring = seasonChecker(month, day);
            if (isSpring) {
                System.out.println("It's a Spring Season.");
            } else {
                System.out.println("Not a Spring Season.");
            }
        }
    }
}

