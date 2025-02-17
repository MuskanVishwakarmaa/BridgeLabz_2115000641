import java.util.Random;
import java.util.Arrays;

class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}

class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            arr[k++] = (leftArr[i] <= rightArr[j]) ? leftArr[i++] : rightArr[j++];
        }
        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }
}

class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

class DataGenerator {
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size);
        }
        return arr;
    }
}

public class BubbleVsMergeVsQuickSort {
    public static void main(String args[]) {
        int[] datasetSizes = {1_000, 10_000, 1_000_000}; // Given dataset sizes

        for (int size : datasetSizes) {
            int[] dataset1 = DataGenerator.generateRandomArray(size);
            int[] dataset2 = Arrays.copyOf(dataset1, dataset1.length);
            int[] dataset3 = Arrays.copyOf(dataset1, dataset1.length);

            // Measure Bubble Sort Time (Skip for 1,000,000 since it's infeasible)
            double bubbleTime = -1; // Default for large data
            if (size <= 10_000) {
                long startBubble = System.nanoTime();
                BubbleSort.bubbleSort(dataset1);
                long endBubble = System.nanoTime();
                bubbleTime = (endBubble - startBubble) / 1_000_000.0;
            }

            // Measure Merge Sort Time
            long startMerge = System.nanoTime();
            MergeSort.mergeSort(dataset2, 0, dataset2.length - 1);
            long endMerge = System.nanoTime();
            double mergeTime = (endMerge - startMerge) / 1_000_000.0;

            // Measure Quick Sort Time
            long startQuick = System.nanoTime();
            QuickSort.quickSort(dataset3, 0, dataset3.length - 1);
            long endQuick = System.nanoTime();
            double quickTime = (endQuick - startQuick) / 1_000_000.0;

            // Print Results
            System.out.println("Dataset Size: " + size);
            if (bubbleTime != -1)
                System.out.printf("Bubble Sort took: %.6f ms%n", bubbleTime);
            else
                System.out.println("Bubble Sort is infeasible for this dataset size.");
            System.out.printf("Merge Sort took: %.6f ms%n", mergeTime);
            System.out.printf("Quick Sort took: %.6f ms%n", quickTime);
            System.out.println("--------------------------------------------------");
        }
    }
}
