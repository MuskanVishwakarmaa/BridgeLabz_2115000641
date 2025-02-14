import java.util.Arrays;
class SelectionSort {
    
    // Selection Sort function
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first element is the minimum

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Main method to test sorting
    public static void main(String[] args) {
        int examScores[] = {85, 60, 95, 70, 80};
        System.out.println("Original Scores: " + Arrays.toString(examScores));
        selectionSort(examScores);
        System.out.println("Sorted Scores: " + Arrays.toString(examScores));
    }
}