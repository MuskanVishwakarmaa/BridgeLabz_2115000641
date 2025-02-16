public class SearchNumber {
    
    public static int findFirstNegative(int[] arr) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is negative
            if (arr[i] < 0) {
                return i;  // Return the index of the first negative number
            }
        }
        // If no negative number is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, -1, 5, 4, -2};  // Example input array
        int result = findFirstNegative(arr);

        if (result != -1) {
            System.out.println("The first negative number is at index: " + result);
        } else {
            System.out.println("No negative number found.");
        }
    }
}
