import java.util.Scanner;
public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char charToRemove = sc.next().charAt(0);
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != charToRemove) {
                result += input.charAt(i);
            }
        }
        System.out.println("Modified String: " + result);
        sc.close();
    }
}
