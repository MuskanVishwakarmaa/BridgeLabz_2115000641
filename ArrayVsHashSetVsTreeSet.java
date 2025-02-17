import java.util.HashSet;
import java.util.TreeSet;
import java.util.Random;

public class ArrayVsHashSetVsTreeSet {

    public static void main(String[] args) {
        // Dataset sizes for comparison as per the given analysis
        int[] datasetSizes = {1_000, 100_000, 1_000_000};

        for (int size : datasetSizes) {
            System.out.println("Dataset Size: " + size);
            compareSearchTimes(size);
            System.out.println();
        }
    }

    public static void compareSearchTimes(int size) {
        // Generate a random array of numbers
        int[] array = generateRandomArray(size);

        // Convert array to HashSet and TreeSet
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int num : array) {
            hashSet.add(num);
            treeSet.add(num);
        }

        // Pick a random element to search for
        int target = array[new Random().nextInt(size)];

        // Measure time for Array Search (Linear Search O(N))
        long startArray = System.nanoTime();
        arraySearch(array, target);
        long endArray = System.nanoTime();
        long arrayTime = endArray - startArray;
        
        // Measure time for HashSet Search (O(1))
        long startHashSet = System.nanoTime();
        hashSetSearch(hashSet, target);
        long endHashSet = System.nanoTime();
        long hashSetTime = endHashSet - startHashSet;

        // Measure time for TreeSet Search (O(log N))
        long startTreeSet = System.nanoTime();
        treeSetSearch(treeSet, target);
        long endTreeSet = System.nanoTime();
        long treeSetTime = endTreeSet - startTreeSet;

        // Print the results
        System.out.println("Array Search took: " + arrayTime / 1_000_000.0 + " ms");
        System.out.println("HashSet Search took: " + hashSetTime / 1_000_000.0 + " ms");
        System.out.println("TreeSet Search took: " + treeSetTime / 1_000_000.0 + " ms");
    }

    // Linear search for Array (O(N))
    public static boolean arraySearch(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // Search in HashSet (O(1) average)
    public static boolean hashSetSearch(HashSet<Integer> hashSet, int target) {
        return hashSet.contains(target);
    }

    // Search in TreeSet (O(log N))
    public static boolean treeSetSearch(TreeSet<Integer> treeSet, int target) {
        return treeSet.contains(target);
    }

    // Generate a random array with unique elements
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];

        // Ensuring unique elements in the array
        for (int i = 0; i < size; i++) {
            int randNum;
            // Ensure no duplicates by checking if number already exists
            do {
                randNum = rand.nextInt(size);
            } while (contains(array, randNum, i));
            array[i] = randNum;
        }
        return array;
    }

    // Helper method to check if the array already contains the element up to the current index
    private static boolean contains(int[] array, int num, int end) {
        for (int i = 0; i < end; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }
}
