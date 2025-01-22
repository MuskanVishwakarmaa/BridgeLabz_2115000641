import java.util.Scanner;
public class SideOfSquare{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Perimeter: ");
		double perimeter = sc.nextDouble();
		double length = perimeter/4;
		System.out.println("The length of the side is " + length + " whose perimeter is " + perimeter);
	}
}
