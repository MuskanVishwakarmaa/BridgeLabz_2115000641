import java.util.Scanner;
public class UnitConvertor2{
        public static double convertYardsToFeet(double yards){
                double yards2feet = 3;
                return yards*yards2feet;
        }
        public static double convertFeetToYards(double feet){
                double feet2yards = 0.33;
                return feet*feet2yards;
        }
        public static double convertMetersToInches(double meters){
                double meters2inches = 39.37;
                return meters*meters2inches;
        }
        public static double convertInchesToMeters(double inches){
                double inches2meters = 0.0254;
                return inches*inches2meters;
        }
	public static double convertInchesToCM(double inch){
                double inch2cm = 0.0254;
                return inch*inch2cm;
        }

        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int choice;
                do{
                        System.out.println("Choose a conversion option");
                        System.out.println("1. Yards to feet");
                        System.out.println("2. Feet to Yards");
                        System.out.println("3. Meters to Inches");
                        System.out.println("4. Inches to Meters");
			System.out.println("5. Inches to Centimeters");
                        choice = sc.nextInt();
                        switch(choice){
                                case 1:
                                        System.out.print("Enter yards: ");
                                        double yards = sc.nextDouble();
                                        double a = convertYardsToFeet(yards);
                                        System.out.println(yards + "Yards is " + a + "Feet");
                                        break;
                                case 2:
                                        System.out.print("Enter feet: ");
                                        double feet = sc.nextDouble();
                                        double b = convertFeetToYards(feet);
                                        System.out.println(feet + "Feet is " + b + "Yards");
                                        break;
                                case 3:
                                        System.out.print("Enter meters: ");
                                        double meters = sc.nextDouble();
                                        double c = convertMetersToInches(meters);
                                        System.out.println(meters + "meters is " + c + "Inches");
                                        break;
                                case 4:
                                        System.out.print("Enter inches: ");
                                        double inches = sc.nextDouble();
                                        double d = convertInchesToMeters(inches);
                                        System.out.println(inches + "Inch is " + d + "Meters");
                                        break;
				case 5:
					System.out.print("Enter inches: ");
					double inch = sc.nextDouble();
					double e = convertInchesToCM(inch);
					System.out.println(inch + "Inch is " + e + "Centimeters");
					break;
                                case 6:
                                        System.out.println("Exiting the program. tata!");
                                        break;
                                default:
                                        System.out.println("Invalid choice");
                        }
                }
                while (choice != 6);
                sc.close();
        }
}
