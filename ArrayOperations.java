import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer[] array = {10, 20, 30, 40, 50};
        
        System.out.print("Enter index to retrieve value: ");
        int index = scanner.nextInt();
        scanner.close();
        
        try {
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}