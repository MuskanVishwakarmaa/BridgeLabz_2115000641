import java.util.Scanner;
public class NaturalNumbers{
	public static int sumOfNaturalNumber(int n){
		int sum = 0;
		for(int i=1; i<=n; i++){
			sum+=i;
		}
		return sum;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a natural number: ");
		int n = sc.nextInt();
		int total = sumOfNaturalNumber(n);
		System.out.println("Sum of natural number is " + total);
	}
}
