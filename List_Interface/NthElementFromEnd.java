import java.util.*;
public class NthElementFromEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        LinkedList<String> list = new LinkedList<>();
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(input.nextLine());
        }


        System.out.print("Enter N (Nth element from end): ");
        int N = input.nextInt();


        String result = findNthFromEnd(list, N);
        if (result != null) {
            System.out.println("Nth element from the end: " + result);
        } else {
            System.out.println("Invalid N: Out of range");
        }
    }


    public static String findNthFromEnd(LinkedList<String> list, int N) {
        ListIterator<String> lead = list.listIterator();
        ListIterator<String> follow = list.listIterator();


        for (int i = 0; i < N; i++) {
            if (lead.hasNext()) {
                lead.next();
            } else {
                return null;
            }
        }


        while (lead.hasNext()) {
            lead.next();
            follow.next();
        }


        return follow.next();
    }
}

