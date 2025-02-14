class SortMarks {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
					
					//swapping with 3rd variable
                    //int temp = arr[j];
                    //arr[j] = arr[j + 1];
                    //arr[j + 1] = temp;
					
					//swapping without 3rd variable
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
                }
            }
        }
    }
}

// Main class
public class BubbleSort {
	
	//method for printing the student marks
    public static void printMarks(int StudentMark[]) {
        for (int i = 0; i < StudentMark.length; i++) {
            System.out.print(StudentMark[i] + " ");
        }
        System.out.println();
    }

	//main method
    public static void main(String args[]) {
        int StudentMark[] = {90, 50, 19, 45, 10, 80, 25};

        // Calling sorting function from SortMarks
        SortMarks.bubbleSort(StudentMark);

        // Print sorted marks
        printMarks(StudentMark);
    }
}
