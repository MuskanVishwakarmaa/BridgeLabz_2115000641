import java.util.*;

class NumberChecker5 {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubeOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) return false;
        int sum = sumOfFactors(number) - number;  
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        if (number <= 0) return false;
        int sum = sumOfFactors(number) - number;  
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        if (number <= 0) return false;
        int sum = sumOfFactors(number) - number; 
        return sum < number;
    }

    public static boolean isStrongNumber(int number) {
        if (number <= 0) return false;
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Factors of " + number + ": ");
        int[] factors = findFactors(number);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest factor of " + number + ": " + greatestFactor(number));
        System.out.println("Sum of factors of " + number + ": " + sumOfFactors(number));
        System.out.println("Product of factors of " + number + ": " + productOfFactors(number));
        System.out.println("Product of cubes of factors of " + number + ": " + productOfCubeOfFactors(number));

        System.out.println(number + " is a perfect number: " + isPerfectNumber(number));
        System.out.println(number + " is an abundant number: " + isAbundantNumber(number));
        System.out.println(number + " is a deficient number: " + isDeficientNumber(number));
        System.out.println(number + " is a strong number: " + isStrongNumber(number));
    }
}
