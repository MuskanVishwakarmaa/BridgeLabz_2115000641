import java.util.Scanner;
public class SpringSeason{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month(1-12) ");
		int month = sc.nextInt();
		System.out.println("Enter day(1-31) ");
		int day = sc.nextInt();
		boolean isSpring = (month==3 && day>=20 && day<=31) ||
				   (month==4 && day>=1 && day<=30) ||
				   (month==5 && day>=1 && day<=31) ||
				   (month==6 && day>=1 && day<=20);
		if(isSpring){
			System.out.println("Its a Spring Season");
		}
		else{
			System.out.println("Not a Spring Season");
		}sc.close();
	}
}
