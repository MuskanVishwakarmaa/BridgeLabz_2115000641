import java.util.*;

public class RemoveDuplicates{
	
	//Method to remove duplicates from a string
    public static String removeDuplicates(String input){
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for(char ch : input.toCharArray()){
            if(!seen.contains(ch)){
                sb.append(ch);
                seen.add(ch);
            }
        }
        return sb.toString();
    }

	//Main method
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("String without duplicates: " +removeDuplicates(input));
        scanner.close();
    }
}
