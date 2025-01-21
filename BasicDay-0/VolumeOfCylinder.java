/* Write a program to calculate the volume of a cylinder. Take the radius and height as inputs and use the formula:
Volume = π * radius^2 * height. */

import java.util.Scanner;
public class VolumeOfCylinder{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		double r = sc.nextDouble();
		System.out.println("Enter Height: ");
		double h = sc.nextDouble();
		double volume = Math.PI * Math.pow(r,2) * h;
		System.out.println("Volume of a Cylinder is "+ volume);
	}
}