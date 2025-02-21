import java.util.*;

public class UncheckedException{
    public static void main(String[] args){

        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();
            
            int result = numerator / denominator; 
            System.out.println("Result: " + result);
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        } catch(InputMismatchException e){
            System.out.println("InputMismatchException: Please enter numeric values.");
        }
    }
}