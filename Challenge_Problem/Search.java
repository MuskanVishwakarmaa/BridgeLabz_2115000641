import java.util.Arrays;

public class Search {

    // Function to find the first missing positive integer using Linear Search
    public static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Mark all numbers outside the range [1, n] as n+1 (out of range value)
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        // Step 2: Mark numbers as negative based on their value
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n && nums[num - 1] > 0) {
                nums[num - 1] = -nums[num - 1];
            }
        }

        // Step 3: Find the first positive index
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        // If no missing positive number found, return n + 1
        return n + 1;
    }

    // Function to perform Binary Search to find the index of the target number
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // Step 1: Sort the array before applying binary search
        Arrays.sort(nums);

        // Step 2: Apply Binary Search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found, return its index
            }
            if (nums[mid] < target) {
                left = mid + 1; // Narrow the search to the right half
            } else {
                right = mid - 1; // Narrow the search to the left half
            }
        }

        // Step 3: If the target is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int target = 4;

        // Find the first missing positive integer
        int missingPositive = findFirstMissingPositive(nums);
        System.out.println("First missing positive integer: " + missingPositive);

        // Find the index of the target using Binary Search
        int targetIndex = binarySearch(nums, target);
        if (targetIndex != -1) {
            System.out.println("Index of target " + target + ": " + targetIndex);
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}
