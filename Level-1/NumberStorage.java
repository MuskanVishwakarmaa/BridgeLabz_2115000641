import java.util.Scanner;
class NumberStorage{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10]; // Array to store up to 10 numbers
        int index = 0; // Index for storing array
        double total = 0.0; // Variable to store the sum


        // Infinite loop to take user input
        while(true){
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();


            // Stop if the user enters 0 or a negative number
            if(num <= 0){
                break;
            }


            // Stop if the array is full
            if(index == 10){
                break;
            }


            // Store the number in the array and increment index
            numbers[index] = num;
            index++;
        }


        // Display all entered numbers
        System.out.println("\nEntered Numbers:");
        for(int i=0; i<index; i++) {
            total+= numbers[i]; // Summing the values
        }


        // Displaying the total sum
        System.out.println("\nTotal sum of numbers: " + total);
    }
}
