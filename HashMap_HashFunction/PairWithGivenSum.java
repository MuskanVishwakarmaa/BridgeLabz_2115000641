import java.util.*;

public class PairWithGivenSum{
    public static boolean hasPairWithSum(int[] arr, int target){
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : arr){
            int complement = target - num;
            if (seenNumbers.contains(complement)){
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                return true;
            }
            seenNumbers.add(num);
        }

        System.out.println("No pair found.");
        return false;
    }

    public static void main(String[] args){
        int[] arr = {8, 4, 2, 7, 1, 3, 9};
        int target = 10;

        hasPairWithSum(arr, target);
    }
}
