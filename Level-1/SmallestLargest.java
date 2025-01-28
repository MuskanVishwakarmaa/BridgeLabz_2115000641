import java.util.Scanner;
public class SmallestLargest{
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int small = number1;
		int large = number1;
		//find smallest
		if(number2<small){
			small = number2;
		}
		if(number3<small){
			small = number3;
		}

		//find largest
		if(number2>large){
			large = number2;
		}
		if(number3>large){
			large = number3;
		}
		return new int[]{small, large};
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int number1 = sc.nextInt();
		System.out.print("Enter second number: ");
                int number2 = sc.nextInt();
		System.out.print("Enter third number: ");
                int number3 = sc.nextInt();
		int result[] = findSmallestAndLargest(number1, number2, number3);
		int small = result[0];
		int large = result[1];
		System.out.println("The smallest number is " + small + "\nThe largest number is " + large);
	}
}
