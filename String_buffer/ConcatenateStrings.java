import java.util.Scanner;

public class ConcatenateStrings{
	
	//method to concatenate strings
    public static String concatenateStrings(String[] words){
        StringBuffer sb = new StringBuffer();

        for (String word : words){
            sb.append(word);
        }

        return sb.toString();
    }

	//Main Method
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[n];
        System.out.println("Enter the strings:");
        for (int i=0; i<n; i++){
            words[i] = scanner.nextLine();
        }

        System.out.println("Concatenated string: " + concatenateStrings(words));
        scanner.close();
    }
}
