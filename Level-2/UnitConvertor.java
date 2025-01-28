import java.util.Scanner;
public class UnitConvertor{
	public static double convertKmToMiles(double km){
		double km2miles = 0.621371;
		return km*km2miles;
	}
	public static double convertMilesToKm(double miles){
                double miles2km = 1.60934;
                return miles*miles2km;
        }
	public static double convertMetersToFeet(double meters){
                double meters2feet = 3.28084;
                return meters*meters2feet;
        }
	public static double convertFeetToMeters(double feet){
                double feet2meters = 0.3048;
                return feet*feet2meters;
        }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("Choose a conversion option");
			System.out.println("1. Kilometers to Miles");
			System.out.println("2. Miles to Kilometers");
			System.out.println("3. Meters to Feet");
			System.out.println("4. Feet to Meters");
			choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.print("Enter km: ");
					double km = sc.nextDouble();
					double a = convertKmToMiles(km);
					System.out.println(km + "KM is " + a + "miles");
					break;
				case 2:
					System.out.print("Enter miles: ");
					double miles = sc.nextDouble();
					double b = convertMilesToKm(miles);
					System.out.println(miles + "miles is " + b + "KM");
					break;
				case 3:
					System.out.print("Enter meters: ");
					double meters = sc.nextDouble();
					double c = convertMetersToFeet(meters);
					System.out.println(meters + "meters is " + c + "Feet");
					break;
				case 4:
					System.out.print("Enter feet: ");
					double feet = sc.nextDouble();
					double d = convertFeetToMeters(feet);
					System.out.println(feet + "feet is " + d + "meters");
					break;
				case 5:
					System.out.println("Exiting the program. tata!");
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
		while (choice != 5);
		sc.close();
	}
}
