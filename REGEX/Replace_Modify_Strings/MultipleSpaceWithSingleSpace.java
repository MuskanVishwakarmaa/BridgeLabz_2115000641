import java.util.Scanner;
import java.util.regex.*;

public class MultipleSpaceWithSingleSpace{
	public static void main(String args[]){
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Sentence: ");
			
			String sentence = sc.nextLine();
			String newSentence = sentence.replaceAll("\\s+", " ");
			
			System.out.print("Original Sentence: " + sentence);
			System.out.print("\nFormatted Sntence: " + newSentence);
		}
	}
}