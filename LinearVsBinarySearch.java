import java.util.*;

class LinearSearch {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; 

            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
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

public class LinearVsBinarySearch {
    public static void main(String[] args) {
        int[] datasetSizes = {1_000, 10_000, 1_000_000}; // Given dataset sizes

        for (int size : datasetSizes) {
            int[] dataset = DataGenerator.generateRandomArray(size);
            int target = dataset[new Random().nextInt(dataset.length)];

            // Measure Linear Search Time
            long startLinear = System.nanoTime();
            int linearIndex = LinearSearch.linearSearch(dataset, target);
            long endLinear = System.nanoTime();
            double linearTime = (endLinear - startLinear) / 1_000_000.0; 

            // Measure Sorting Time
            long startSort = System.nanoTime();
            Arrays.sort(dataset);
            long endSort = System.nanoTime();
            double sortingTime = (endSort - startSort) / 1_000_000.0; 

            // Measure Binary Search Time
            long startBinary = System.nanoTime();
            int binaryIndex = BinarySearch.binarySearch(dataset, target);
            long endBinary = System.nanoTime();
            double binaryTime = (endBinary - startBinary) / 1_000_000.0; 

            // Print Results
            System.out.println("Dataset Size: " + size);
            System.out.printf("Linear Search took: %.6f ms %n", linearTime);
            System.out.printf("Sorting took: %.6f ms%n", sortingTime);
            System.out.printf("Binary Search took: %.6f ms %n", binaryTime);
            System.out.println("--------------------------------------------------");
        }
    }
}
