import java.util.Scanner;
public class BasicCalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		float add = num1+num2;
		float sub = num1-num2;
		float mul = num1*num2;
		float div = num1/num2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + String.format("%.1f",num1) + " and " + String.format("%.1f",num2) + " is " +  String.format("%.1f",add) + ", " +  String.format("%.1f",sub) + ", " +  String.format("%.1f",mul) + ", " +  String.format("%.1f",div));
	}
}
