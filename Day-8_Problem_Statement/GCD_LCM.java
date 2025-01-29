import java.util.Scanner;

public class GCD_LCM{

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static int[] getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();
        return new int[]{num1, num2};
    }


    public static void displayResults(int num1, int num2, int gcd, int lcm) {
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static void main(String[] args) {
        int[] numbers = getUserInput();
        int num1 = numbers[0], num2 = numbers[1];
        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);
        displayResults(num1, num2, gcd, lcm);
    }
}



