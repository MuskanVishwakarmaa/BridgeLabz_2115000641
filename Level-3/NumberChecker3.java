import java.util.*;
class NumberChecker3 {
    public static int countDigits(int number) {
        int count = 0;
        number = Math.abs(number);
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    public static int[] getDigitsArray(int number) {
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        number = Math.abs(number);
        int index = numDigits - 1;
        while (number > 0) {
            digits[index--] = number % 10;
            number /= 10;
        }
        return digits;
    }
    public static int[] reverseArray(int[] digits) {
        int length = digits.length;
        int[] reversed = new int[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = digits[length - 1 - i];
        }
        return reversed;
    }
    public static boolean arraysAreEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);
        return arraysAreEqual(digits, reversed);
    }
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Count of Digits: " + countDigits(number));
        int[] digits = getDigitsArray(number);
        System.out.print("Digits Array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        int[] reversed = reverseArray(digits);
        System.out.print("Reversed Array: ");
        for (int digit : reversed) {
            System.out.print(digit + " ");
        }
        System.out.println();
        System.out.println("Is Palindrome: " + isPalindrome(number));
        System.out.println("Is Duck Number: " + isDuckNumber(number));
    }
}
