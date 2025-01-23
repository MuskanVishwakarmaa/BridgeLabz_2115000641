import java.util.Scanner;
public class Armstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int sum = 0;
		int original_number = number;
		while(original_number!=0){
			int remainder = original_number%10;
			double cube = Math.pow(remainder,3);
			sum+=cube;
			original_number=original_number/10;			
		}
		if(sum==number){
                	System.out.println("Armstrong");
                }
                else{
                	System.out.println("Not a Armstrong");
                }
		sc.close();

	}
}
