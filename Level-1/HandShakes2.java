import java.util.Scanner;
public class HandShakes2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of students: ");
		int n = sc.nextInt();
		int total = ((n*(n-1))/2);
		System.out.println("Total number of Handshakes are " + total);
	}
}
