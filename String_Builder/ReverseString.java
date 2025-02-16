import java.util.Scanner;

public class ReverseString{
	
	//Method to reverse the string
    public static String reverseString(String input){
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

	//Main method
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Reversed string: " + reverseString(input));
        scanner.close();
    }
}
