/* Write a program that takes the temperature in Celsius as input and converts it to Fahrenheit using the formula: 
Fahrenheit = (Celsius * 9/5) + 32. */

import java.util.Scanner;
public class CelsiusToFahrenheit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in celsius: ");
		int celsius = sc.nextInt();
		System.out.println("Temperature in Fahrenheit is " + (celsius * 9/5 + 32));
	}
}