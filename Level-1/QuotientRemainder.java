import java.util.Scanner;
public class QuotientRemainder{
	public static int[] findQuotientRemainder(int number, int divisor){
		int quotient = number/divisor;
		int remainder = number%divisor;
		return new int[]{quotient,remainder};
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		System.out.print("Enter the divisor: ");
		int divisor = sc.nextInt();
		if(divisor==0){
			System.out.println("Divisor cannot be zero");
		}
		else{
			int result[] = findQuotientRemainder(number, divisor);
			int quotient = result[0];
			int remainder = result[1];
			System.out.println("The Quotient is " + quotient + " and the remainder is " + remainder);
		}
	}
}
