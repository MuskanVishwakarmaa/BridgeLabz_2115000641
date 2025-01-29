import java.util.Scanner;
public class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.print("Enter 1st number: ");
               		int a = sc.nextInt();
       	        	System.out.print("Enter 2nd number: ");
                	int b = sc.nextInt();

			System.out.println("Choose operation to be performed=>");
			System.out.println("Choose '1' for addition");
			System.out.println("Choose '2' for subtraction");
			System.out.println("Choose '3' for multiplication");
			System.out.println("Choose '4' for division");

			choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Addition of 2 numbers is " + (a+b));
					break;

				case 2:
					System.out.println("Subtraction of 2 numbers is " + (a-b));
					break;

				case 3:
					System.out.println("Multiplication of 2 numbers is " + (a*b));
					break;

				case 4:
					System.out.println("Division of 2 numbers is " + (a/b));
					break;

				default:
					System.out.println("Invalid choice!!");
					break;
			}
		}
		while(choice!=5);
		sc.close();
	}
}
