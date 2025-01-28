import java.util.Scanner;
public class Trigonometry{
	public static double[] calculateTrigonometricFunctions(double angle){
		double radian = angle*Math.PI/180.0;
		double sine = Math.sin(radian);
		double cosine = Math.cos(radian);
		double tangent = Math.tan(radian);
		return new double[]{sine, cosine, tangent};
	}
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the angle in degree: ");
		double angle = sc.nextDouble();
		double result[] = calculateTrigonometricFunctions(angle);
		double sine = result[0];
		double cosine = result[1];
		double tangent = result[2];
		System.out.println("Value of Sine = " + sine + "\nValue of Cosine = " + cosine + "\nValue of Tangent = " + tangent);
	}
}
