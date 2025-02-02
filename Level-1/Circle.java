import java.util.Scanner;
class Circle{
	//Attributes
	private double radius;

	//Default Constructor
	Circle(){
		this(1.0); //calling the parameterized constructor with default value 1.0
	}

	//parameterized constructor with user-provided radius
	Circle(double radius){
		this.radius = radius;
	}

	//method to calculate area
	static double calculateArea(double radius){
		return Math.PI*Math.pow(radius, 2);
	}

	//method to display result
	void displayResult(){
		double area = calculateArea(this.radius);
		System.out.println("Area of circle is " + area);
	}

	//main method
	public static void main(String args[]){
		Circle defaultCircle = new Circle();
		defaultCircle.displayResult();

		Scanner sc = new Scanner(System.in);
		System.out.println("The area above is default. Please enter radius for your preferred area");
		double radius = sc.nextDouble();

		Circle usercircle = new Circle(radius);
		usercircle.displayResult();

		sc.close();
	}
}
