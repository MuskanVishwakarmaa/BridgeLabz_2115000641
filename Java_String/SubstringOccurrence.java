import java.util.Scanner;
public class SubstringOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();
        System.out.print("Enter the substring: ");
        String substring = sc.nextLine();
        int count = 0;
        int index = 0;
        while (index <= mainString.length() - substring.length()) {
            boolean matchFound = true;
            for (int i = 0; i < substring.length(); i++) {
                if (mainString.charAt(index + i) != substring.charAt(i)) {
                    matchFound = false;
                    break;
                }
            }
            if (matchFound) {
                count++;
                index += substring.length();
            } else {
                index++;
            }
        }
        System.out.println("The substring occurs " + count + " times.");
        sc.close();
    }
}

