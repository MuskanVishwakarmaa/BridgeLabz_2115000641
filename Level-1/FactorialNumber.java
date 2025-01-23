import java.util.Scanner;
public class FactorialNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		int num = sc.nextInt();
		if(num<0){
			System.out.println("Please enter a positive number");
		}
		else{
			long factorial = 1;
			int i = 1;
			while(i<=num){
				factorial *= i;
				i++;
			}
			System.out.println("The factorial of " + num + " is: " + factorial);
		}
		sc.close();
	}
}
