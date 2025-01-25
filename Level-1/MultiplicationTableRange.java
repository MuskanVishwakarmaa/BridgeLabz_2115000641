import java.util.Scanner;
class MultiplicationTableRange{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        // Getting user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();


        int[] multiplicationResult = new int[4]; //Array to store results from 6 to 9


        //Calculating and storing multiplication results
        for (int i=6; i<=9; i++) {
            multiplicationResult[i-6] = number * i; //Storing result in array
        }


        // Displaying the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
    }
}
