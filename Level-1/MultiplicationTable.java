import java.util.Scanner;
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Getting user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();


        int[] table = new int[10]; // Array to store multiplication table results


        // Calculating and storing multiplication table results
        for (int i=1; i <= 10; i++){
            table[i-1] = number*i;
        }


        // Displaying the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i-1]);
        }
    }
}
