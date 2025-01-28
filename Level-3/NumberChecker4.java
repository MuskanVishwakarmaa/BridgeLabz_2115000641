import java.util.*;
class NumberChecker4 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        while (square > 0) {
            if (square % 10 != number % 10) {
                return false;
            }
            square /= 10;
            number /= 10;
        }
        return true;
    }
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Is " + number + " a prime number? " + isPrime(number));
        System.out.println("Is " + number + " a neon number? " + isNeon(number));
        System.out.println("Is " + number + " a spy number? " + isSpy(number));
        System.out.println("Is " + number + " an automorphic number? " + isAutomorphic(number));
        System.out.println("Is " + number + " a buzz number? " + isBuzz(number));
    }
}
