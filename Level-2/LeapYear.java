import java.util.Scanner;
public class LeapYear{
	public static boolean checkLeapYear(int year){
		if(year>=1582){
			if((year%4==0 && year%100!=0) || year%400==0){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			System.out.println("Year must be >=1582");
			return false;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year(>=1582): ");
		int year = sc.nextInt();
		if(year<1582){
			System.out.println("Enter year >=1582");
		}
		else{
			boolean isLeap = checkLeapYear(year);
			if(isLeap){
				System.out.println(year + " is a Leap Year");
			}
			else{
				System.out.println(year + " is not a Leap Year");
			}
		}
	}
}
