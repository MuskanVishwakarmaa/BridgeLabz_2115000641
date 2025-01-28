import java.util.Scanner;
public class HandShakes{
	public static int MaxHandShakes(int n){
		if (n<2){
			return 0;
		}
		return ((n*(n-1))/2);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Students: ");
		int n = sc.nextInt();
		int total = MaxHandShakes(n);
		System.out.println("Total number of Handshakes are " + total);
	}
}
