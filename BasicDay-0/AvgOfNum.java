/* Write a program that takes three numbers as input from the user and prints  their average.  
*/

import java.util.Scanner;
public class AvgOfNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd number: ");
		int num3 = sc.nextInt();
		System.out.println("Average of three number is " + ((num1+num2+num3)/3));
	}
}