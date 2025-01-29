import java.util.Scanner;
public class FibonacciGenerator{
	public static void generateFibonacci(int n){
		int first = 0;
		int second = 1;
		for(int i=0; i<n; i++){
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
		System.out.println();
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		if(n<=0){
			System.out.println("Enter positive number");
		}
		else{
			generateFibonacci(n);
		}
	}
}
