/* Write a program to calculate simple interest using the formula:
Simple Interest = (Principal * Rate * Time) / 100.
Take Principal, Rate, and Time as inputs from the user. */

import java.util.Scanner;
public class SimpleInterest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal: ");
		double principle = sc.nextDouble();
		System.out.println("Enter Rate: ");
		double rate = sc.nextDouble();
		System.out.println("Enter Time: ");
		double time = sc.nextDouble();
		double si = ((principle * rate * time)/100);
		System.out.println("Simple Interest is " + si);
	}
}