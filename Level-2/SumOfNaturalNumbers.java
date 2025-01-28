import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to check if the input is a natural number
    public static boolean isNaturalNumber(int n) {
        return n > 0;
    }

    // Method to find the sum of n natural numbers using recursion
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + recursiveSum(n - 1);
        }
    }

    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if input is a natural number
        if (!isNaturalNumber(n)) {
            System.out.println("Input is not a natural number. Exiting...");
            scanner.close();
            return;
        }

        // Compute the sum using recursion
        int recSum = recursiveSum(n);

        // Compute the sum using the formula
        int formulaSumResult = formulaSum(n);

        // Compare and print the results
        if (recSum == formulaSumResult) {
            System.out.println("The sum of the first " + n + " natural numbers is correctly computed as " + recSum + ".");
        } else {
            System.out.println("There is a discrepancy in the sum computations.");
        }

        scanner.close();
    }
}
