import java.util.Scanner;
class OddAndEvenArrays{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        //Taking user input
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
       
        //Checking if the input is a natural number (greater than 0)
        if (number<=0){
            System.out.println("Error: Please enter a natural number (greater than 0).");
            return; // Exit program
        }


        //Creating arrays for odd and even numbers
        int[] evenNumbers = new int[number/2+1];
        int[] oddNumbers = new int[number/2+1];


        //Index variables for odd and even numbers
        int evenIndex = 0, oddIndex = 0;


        // Looping through 1 to the entered number
        for (int i=1; i<=number; i++) {
            if (i%2 == 0){
                evenNumbers[evenIndex++] = i; // Storing even number
            } else{
                oddNumbers[oddIndex++] = i; // Storing odd number
            }
        }


        // Printing even numbers
        System.out.print("\nEven numbers: ");
        for (int i=0; i<evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }


        // Printing odd numbers
        System.out.print("\nOdd numbers: ");
        for (int i=0; i<oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}
