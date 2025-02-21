import java.util.Scanner;
public class NestedTryCatch{
    public static void main(String[] args){

        int[] numbers = {10, 20, 30, 40, 50};

        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter the index of the array element: ");
            int index = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            try {
                int element = numbers[index];
                try {
                    int result = element / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException ae) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("Invalid array index!");
            }
        }
    }
}