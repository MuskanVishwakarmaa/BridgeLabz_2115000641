import java.util.Scanner;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char result = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: '" + result + "'");
        sc.close();
    }
    public static char findMostFrequentCharacter(String str) {
        char mostFrequentChar = str.charAt(0);
        int maxFrequency = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }
            if (count > maxFrequency) {
                maxFrequency = count;
                mostFrequentChar = currentChar;
            }
        }
        return mostFrequentChar;
    }
}
