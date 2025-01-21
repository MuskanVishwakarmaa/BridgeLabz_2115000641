/* Write a program that takes the distance in kilometers as input from the user and converts it into miles using the formula:  
Miles = Kilometers * 0.621371. */

import java.util.Scanner;
public class KmToMiles{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in km: ");
		double km = sc.nextDouble();
		System.out.println("Distance in miles is " + (km * 0.621371));
	}
}