import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter the time period in years: ");
        double time = input.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}
