/* Write a program that takes two numbers as input: a base and an exponent, and prints the result of base raised to the exponent (without using loops or conditionals). */

import java.util.Scanner;
public class PowerCalculation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base: ");
		double b = sc.nextDouble();
		System.out.println("Enter power: ");
		double p = sc.nextDouble();
		System.out.println("Exponent Value is " + (Math.pow(b,p)));
	}
}