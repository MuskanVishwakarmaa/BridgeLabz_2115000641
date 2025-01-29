import java.util.Scanner;
public class Max3Numbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd number: ");
		int c = sc.nextInt();
		int maxValue = Math.max(Math.max(a,b),c);
		System.out.println("Maximum number among 3 numbers is: " + maxValue);
	}
}
