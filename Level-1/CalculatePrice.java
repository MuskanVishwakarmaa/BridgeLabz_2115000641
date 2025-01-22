import java.util.Scanner;
public class CalculatePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit price of the item in INR: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter the quantity of the item: ");
        int quantity = sc.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + String.format("%.2f", totalPrice) + " if the quantity is " + quantity + " and unit price is INR " + String.format("%.2f", unitPrice) + ".");
    }
}
