import java.util.Scanner;
public class HeightConversion{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your height in CM: ");
		double heightCM = sc.nextDouble();
		double heightInch = heightCM/2.54;
		double heightFoot = heightInch/12;
		System.out.println("Your Height in cm is " + heightCM + " while in feet is " + String.format("%.1f",heightFoot) + ", and inches is " + String.format("%.1f",heightInch));
	}
}
