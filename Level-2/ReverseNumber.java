import java.util.*;
class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Find the number of digits
        int tempNumber = number;
        int count = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }
        // Create an array to store digits
        int[] digits = new int[count];
        // Extract digits and store in the digits array
        tempNumber = number;
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }
        // Display the digits in reverse order
        System.out.println("The digits in reverse order are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }
    }
}
