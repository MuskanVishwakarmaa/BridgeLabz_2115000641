import java.util.Scanner;
public class BMI{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in kg: ");
		double weight = sc.nextDouble();
		System.out.println("Enter height in cm: ");
		double height = sc.nextDouble();
		double heightM = height/100;
		double bmi = weight/(heightM*heightM);
		if(bmi<=18.4){
			System.out.println("Person is Underweight");
		}
		else if(bmi>=18.5 || bmi<=24.9){
			System.out.println("Person is Normal");
		}
		else if(bmi>=25.0 || bmi<=39.9){
			System.out.println("person is Overweight");
		}
		else if(bmi>=40.0){
			System.out.println("Person is Obese");
		}
	}
}
