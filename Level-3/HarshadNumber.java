import java.util.Scanner;
public class HarshadNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		int original_number = number;
		int sum = 0;
		int rem = 0;
		while(original_number>0){
			rem = original_number%10;
			original_number/=10;
			sum += rem;
		}
		if(number%sum==0){
			System.out.println("Harshad Number");
		}
		else{
			System.out.println("Not a Harshad Number");
		}
		sc.close();
	}
}
