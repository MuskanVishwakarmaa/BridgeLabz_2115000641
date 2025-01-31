import java.util.Scanner;
public class AreaOfCircle{
	//fields
	private double radius;

	//Constructor
	public AreaOfCircle(double radius){
		this.radius = radius;
	}

	//Method to calculate area
	public double area(){
		return Math.PI*(radius*radius);
	}

	//Method to calculate circumference
	public double circumference(){
		return Math.PI*radius*2;
	}

	//method to display result
	public void display(){
		System.out.println("Area of circle: " + area());
		System.out.println("Circumference of circle: " + circumference());
	}

	//main method
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		float radius = sc.nextFloat();

		//object
		AreaOfCircle circle = new AreaOfCircle(radius);
		circle.display();
		sc.close();
	}
}
