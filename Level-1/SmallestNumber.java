import java.util.Scanner;
public class SmallestNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd number: ");
                int num2 = sc.nextInt();
		System.out.println("Enter the 3rd number: ");
                int num3 = sc.nextInt();
		if (num1<num2 && num1<num3){
			System.out.println("Is the first number the smallest? YES");
		}
		else{
			System.out.println("Is the first number the smallest? NO");
		}
	}
}
