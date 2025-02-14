class SortAge {
    public static void countingSort(int arr[]) {
        int minAge = 10, maxAge = 18;
        int range = maxAge - minAge + 1;

        // Count the frequency of each age
        int count[] = new int[range];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - minAge]++;  // Store count at (age - 10)
        }

        // Sorting
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                arr[index++] = i + minAge;  // Restore the actual age
                count[i]--;
            }
        }
    }
}

public class CountingSort {
    // Method to print student ages
    public static void printAge(int StudentAge[]) {
        for (int age : StudentAge) {
            System.out.print(age + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String args[]) {
        int StudentAge[] = {12, 15, 11, 18, 10, 16, 14, 13, 17};

        // Calling sorting function
        SortAge.countingSort(StudentAge);

        // Print sorted ages
        printAge(StudentAge);
    }
}
