import java.util.Scanner;
public class NaturalNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		int sum=0;
		if(number>=0){
			sum+=number*(number+1)/2;
			System.out.println("The sum of " + number + " natural numbers is " + sum);
		}
		else{
			System.out.println("The number " + number + " is not a natural number");
		}
	}
}
