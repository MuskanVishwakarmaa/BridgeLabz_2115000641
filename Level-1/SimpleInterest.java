import java.util.Scanner;
public class SimpleInterest{
	public static double CalculateSimpleInterest(double principal, double rate, double time){
		return (principal*rate*time)/100;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principal: ");
		double principal = sc.nextDouble();
		System.out.print("Enter rate: ");
		double rate = sc.nextDouble();
		System.out.print("Enter time in years: ");
		double time = sc.nextDouble();
		double si = CalculateSimpleInterest(principal, rate, time);
		System.out.println("The Simple Interest is " + si + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
	}
}

