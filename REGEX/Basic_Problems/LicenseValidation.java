import java.util.Scanner;

public class LicenseValidation{
	public static void main(String args[]){
		String regex = "^[A-Z]{2}[0-9]{4}$";
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Plate Number: ");
			String licenseNumber = sc.nextLine();
			
			System.out.println(licenseNumber.matches(regex)? "Valid" : "Invalid");
		}
	}
}