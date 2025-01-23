import java.util.Scanner;
public class DigitCounter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int count = 0;
		if(number==0){
			count = 1;
		}
		else{
			while(number!=0){
				number = number/10;
				count++;
			}
		}
		System.out.println("Total number of digits = " + count);
		sc.close();
	}

}
