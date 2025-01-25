import java.util.Scanner;
class FactorsFinder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Taking user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();


        if (number<=0){
            System.out.println("Error: Please enter a positive number.");
            return;
        }


        int maxIndex = 10; // Initial size of the array
        int[] factors = new int[maxIndex]; // Array to store factors
        int index = 0; // Index for storing factors


        // Finding factors and storing them in an array
        for (int i=1; i<=number; i++){
            if (number%i == 0){ // Check if 'i' is a factor
                //If array is full, double its size
                if (index == maxIndex){
        System.out.println("Need factors array to store more elements");
                    maxIndex*= 2; // Double the size of the array
                    int[] temp = new int[maxIndex]; //Creating a new temporary array
                    // Copy old factors to new temporary array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; //Assign temp array to factors
                }
                factors[index++] = i; //Store factor in array and increment index
            }
        }


        // Displaying factors
        System.out.print("Factors of " + number + " are: ");
        for (int i=0; i<index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
