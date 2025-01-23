import java.util.Scanner;
public class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double first = sc.nextDouble();
		System.out.println("Enter the second number: ");
		double second = sc.nextDouble();
		System.out.println("Enter the number of operation to be performed: ");
		int choice = sc.nextInt();
		System.out.println("Please enter the operation to be performed (e.g., +, -, *, /): ");
		String operation = sc.next();
		for(int i=1; i<=choice; i++){
			switch(operation){
				case "+":
					System.out.println("Addition of two number is " + (first+second));
					break;
				case "-":
					System.out.println("Subtraction of two number is " + (first-second));
					break;
				case "*":
					System.out.println("Multiplication of two number is " + (first*second));
					break;
				case "/":
					System.out.println("Division of two number is " + (first/second));
					break;
				default:
					System.out.println("Invalid Operator!");
					break;
			}
		}
		sc.close();
	}
}
