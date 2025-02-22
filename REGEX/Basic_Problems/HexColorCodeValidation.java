import java.util.Scanner;

public class HexColorCodeValidation{
	public static void main(String args[]){
		String regex = "^[#][0-9A-Fa-f]{6}$";
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Hex color code: ");
			String code = sc.nextLine();
			
			System.out.println(code.matches(regex) ? "Valid" : "Invalid.");
		}
	}
}