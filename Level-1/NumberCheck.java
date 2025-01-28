import java.util.Scanner;
public class NumberCheck{
	public static int numChecker(int n){
		if(n>0){
			return 1;
		}
		if(n<0){
			return -1;
		}
		else{
			return 0;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int result = numChecker(n);
		System.out.println(result);
	}
}
