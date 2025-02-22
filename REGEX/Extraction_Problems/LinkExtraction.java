import java.util.Scanner;
import java.util.regex.*;

public class LinkExtraction{
	public static void main(String args[]){
        String regex = "https?://(?:www\\.)?[a-zA-Z0-9.-]+(?:/[^\s]*)?";
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter links: ");
			String link = sc.nextLine();
			
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(link);
			
			// Find and print all links, ensuring no trailing punctuation
            while (matcher.find()) {
                String url = matcher.group();
                
                // Remove unwanted trailing characters like punctuation or quotes
                url = url.replaceAll("[\".]*$", "");
                System.out.println(url);
            }
		}
	}
}