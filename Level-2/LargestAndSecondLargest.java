import java.util.*;
class LargestAndSecondLargest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int maxDigit = 10; // Maximum size for the array
        int[] digits = new int[maxDigit];
        int index = 0;
        // Extract digits and store them in the array
        while (number!=0 && index<maxDigit){
            digits[index] = number%10;
            number = number/10;
            index++;
        }
        // Find the largest and second-largest digits
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<index; i++){
            if(digits[i]>largest){
                secondLargest = largest; // Update second largest before largest
                largest = digits[i]; // Update largest
            } else if(digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }
        // Display the largest and second largest digits
        System.out.println("The largest digit is: " + largest);
        if(secondLargest!=Integer.MIN_VALUE){
            System.out.println("The second largest digit is: " + secondLargest);
        } else{
            System.out.println("There is no second largest digit.");
        }
    }
}
