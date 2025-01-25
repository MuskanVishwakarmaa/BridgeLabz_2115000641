import java.util.*;
class Frequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];
        // Process each digit of the number
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number = number / 10;
        }
        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }
    }
}


