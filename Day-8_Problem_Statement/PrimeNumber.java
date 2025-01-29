import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println(num + " is NOT a Prime Number");
            return; // Exit program early for non-prime cases
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println(num + " is NOT a Prime Number");
                return; // Exit immediately if a divisor is found
            }
        }
        System.out.println(num + " is a Prime Number");
    }
}
