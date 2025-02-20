import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();


        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }


        List<Integer> uniqueList = removeDuplicates(list);
        System.out.println("List after removing duplicates: " + uniqueList);
    }


    public static List<Integer> removeDuplicates(List<Integer> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}