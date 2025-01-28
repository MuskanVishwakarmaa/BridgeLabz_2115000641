import java.util.Scanner;
public class Athlete{
	public static int totalRounds(int side1, int side2, int side3){
		int perimeter = side1+side2+side3;
		int distanceMeters = 5000; //convert km to meters
		return distanceMeters/perimeter;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first side of a triangle: ");
		int side1 = sc.nextInt();
		System.out.print("Enter the second side of a triangle: ");
                int side2 = sc.nextInt();
		System.out.print("Enter the third side of a triangle: ");
                int side3 = sc.nextInt();
		if(side1+side2>side3 && side2+side3>side1 && side1+side3>side2){
			int rounds = totalRounds(side1, side2, side3);
			System.out.println("User needs " + rounds + " rounds to complete 5km run");
		}
		else{
			System.out.println("The entered sides do not form a valid triangle");
		}
	}
}
