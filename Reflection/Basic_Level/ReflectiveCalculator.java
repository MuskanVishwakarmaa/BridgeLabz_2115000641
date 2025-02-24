import java.lang.reflect.Method;
import java.util.Scanner;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class ReflectiveCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Calculator calculator = new Calculator();
            Class<?> clazz = calculator.getClass();

            Method multiplyMethod = clazz.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true);

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int result = (int) multiplyMethod.invoke(calculator, num1, num2);
            System.out.println("Multiplication Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}