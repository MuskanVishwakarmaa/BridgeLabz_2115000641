import java.util.Scanner;
public class Factors{
	public static int[] findFactors(int number){
		int count = 0;
		for(int i=1; i<=number; i++){
			if(number%i==0){
				count++;
			}
		}
		int[] factors = new int [count];
		int index = 0;
		for(int i=1; i<=number; i++){
			if(number%i==0){
				factors[index] = i;
				index++;
			}
		}
		return factors;
	}

	//method to find the sum of factors
	public static int findSum(int[] factors){
		int sum = 0;
		for(int factor:factors){
			sum+=factor;
		}
		return sum;
	}

	//method to find the product of factors
	public static int findProduct(int[] factors){
		int product = 1;
		for(int factor:factors){
			product*=factor;
		}
		return product;
	}

	//method to find the sum of the square of the factors
	public static double findSumOfSquare(int[] factors){
		double sumOfSquare = 0;
		for(int factor:factors){
			sumOfSquare+= Math.pow(factor,2);
		}
		return sumOfSquare;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		int[] factors = findFactors(number);
		System.out.print("Factors of " + number + " are: ");
		for(int factor:factors){
			System.out.print(factor + " ");
		}
		System.out.println();
		int sum = findSum(factors);
		System.out.println("Sum of the factors are: " + sum);
		int product = findProduct(factors);
		System.out.println("Product of the factors are: " + product);
		double square = findSumOfSquare(factors);
		System.out.println("Sum of Squares of the factors are: " + square);
	}
}
