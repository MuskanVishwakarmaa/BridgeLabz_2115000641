import java.util.Scanner;
public class LeapYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year (>= 1582): ");
		int year = sc.nextInt();
		if(year<1582){
			System.out.println("The year must be 1582 or later");
		}
		else{
			//using multiple if-else
			if(year%4==0){
				if(year%100==0){
					if(year%400==0){
						System.out.println(year + " is a leap year");
					}
					else{
						System.out.println(year + " is not a leap year");
					}
				}
				else{
					System.out.println(year + " is a leap year");
				}
			}
			else{
				System.out.println(year + " is not a leap year");
			}
			//using logical operator
			if((year%4==0 && year%100!=0) || (year%400==0)){
				System.out.println(year + " is a leap year(logical operator)");
			}
			else{
				System.out.println(year + " is not a leap year(logical operator)");
			}
		}
		sc.close();
	}
}
