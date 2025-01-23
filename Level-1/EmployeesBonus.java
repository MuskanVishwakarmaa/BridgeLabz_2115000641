import java.util.Scanner;
public class EmployeesBonus{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();
		System.out.println("Enter year of service: ");
		int year = sc.nextInt();
		if (year>5){
			double bonus = salary*0.05;
			System.out.println("You are eligible for the bonus");
			System.out.println("Your bonus amount is " + bonus);
		}
		else{
			System.out.println("You are not eligible for the bonus");
		}
		sc.close();
	}
}
