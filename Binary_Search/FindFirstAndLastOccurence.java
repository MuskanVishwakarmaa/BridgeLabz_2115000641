public class FindFirstAndLastOccurence {
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Continue searching on the left side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // Continue searching on the right side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        
        int firstOccurrence = findFirstOccurrence(sortedArray, target);
        int lastOccurrence = findLastOccurrence(sortedArray, target);
        
        System.out.println("First occurrence of " + target + ": " + firstOccurrence);
        System.out.println("Last occurrence of " + target + ": " + lastOccurrence);
    }
}