/*Write a program that takes two numbers as input from the user and prints their sum.*/

import java.util.Scanner;
public class AddTwoNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int b = sc.nextInt();
		System.out.println("The sum of two numbers is " + (a+b));
	}
}