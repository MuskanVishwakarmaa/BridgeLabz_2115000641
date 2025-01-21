/* Write a program to calculate the perimeter of a rectangle. Take the length and width as inputs and use the formula:
Perimeter = 2 * (length + width). */

import java.util.Scanner;
public class PerimeterOfRectangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		double l = sc.nextDouble();
		System.out.println("Enter width: ");
		double w = sc.nextDouble();
		System.out.println("Perimeter of a Rectangle is " + (2* (l + w)));
	}
}