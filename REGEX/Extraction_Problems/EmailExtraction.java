import java.util.Scanner;
import java.util.regex.*;

public class EmailExtraction{
	public static void main(String args[]){
		String regex = "[a-z0-9_.]+@[a-z0-9.-]+\\.[a-z]{2,}";
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Email: ");
			String email = sc.nextLine();
			
			// Compile the regex and create a matcher
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);

            // Find all matches and print them
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
		}
	}
}