import java.util.*;
public class ReverseList {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<String> ll1 = new ArrayList<>(Arrays.asList("Muskan", "Shreya"));


        reverseList(ll);
        reverseList(ll1);
        System.out.println(ll);
        System.out.println(ll1);


        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(9,8,7,6,5,4,3,2,1));
        reverseLinkedList(linkedList);
        System.out.println(linkedList);
    }


    public static <T> void reverseList(List<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }


    public static <T> void reverseLinkedList(LinkedList<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}