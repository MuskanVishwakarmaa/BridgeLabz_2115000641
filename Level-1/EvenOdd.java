import java.util.Scanner;
public class EvenOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter natural Number: ");
		int num = sc.nextInt();
		if(num<=0){
			System.out.println("Please enter natural number");
		}
		else{
			for(int i=1; i<=num; i++){
				if(i%2==0){
					System.out.println(i + " is even number");
				}
				else{
					System.out.println(i + " is odd number");
				}
			}
		}
		sc.close();
	}
}
