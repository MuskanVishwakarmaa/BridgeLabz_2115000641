import java.util.regex.*;
import java.util.Scanner;

public class CapitalWordExtraction{
	public static void main(String[] args){
		String regex = "\\b[A-Z][a-z]*\\b";
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Sentence: ");
			String sentence = sc.nextLine();
			
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(sentence);
			
			while(matcher.find()){
				System.out.println(matcher.group());
			}
		}
		
	}
}