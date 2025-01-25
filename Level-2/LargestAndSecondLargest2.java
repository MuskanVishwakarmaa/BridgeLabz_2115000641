import java.util.*;


class LargestAndSecondLargest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong(); // Use long instead of int
        int maxDigit = 10; // Initial maximum size for the array
        int[] digits = new int[maxDigit];
        int index = 0;


        // Extract digits and store them in the array
        while (number != 0) {
            // If the array is full, increase its size by 10
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit]; // Create a new larger array
                // Manually copy the elements from digits to temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i]; // Manually copy each element
                }
                digits = temp; // Assign temp to digits
            }
            digits[index++] = (int)(number % 10); // Store the last digit
            number = number / 10; // Remove the last digit from the number
        }


        // Find the largest and second-largest digits
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest before largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }


        // Display the largest and second-largest digits
        System.out.println("The largest digit is: " + largest);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest digit is: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit.");
        }
    }
}
