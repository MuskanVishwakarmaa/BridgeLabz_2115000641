import java.util.*;
public class RotateList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Taking user input for list size
        System.out.print("Enter the number of elements in the list: ");
        int n = input.nextInt();


        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }


        // Taking user input for rotation count
        System.out.print("Enter the number of positions to rotate: ");
        int k = input.nextInt();


        rotateList(list, k);
        System.out.println("Rotated List: " + list);
    }


    public static <T> void rotateList(List<T> list, int k) {
        int n = list.size();
        if (n == 0 || k % n == 0) return;


        k = k % n;
        reverse(list, 0, k - 1);
        reverse(list, k, n - 1);
        reverse(list, 0, n - 1);
    }


    private static <T> void reverse(List<T> list, int left, int right) {
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}