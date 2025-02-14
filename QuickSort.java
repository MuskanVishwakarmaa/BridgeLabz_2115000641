import java.util.Arrays;
public class QuickSort {
    
	//partition function
	public static int partition(int arr[], int low, int high){
		int pivot = arr[high]; //last element as pivot
		int i = low-1; //index of smaller element
		
		for(int j=low; j<high; j++){
			if(arr[j]<pivot){
				i++;
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		//swap pivot with the element at i+1
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
	
	//sorting function
	public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
			int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
	// Main method
    public static void main(String[] args) {
        int productPrices[] = {1200, 450, 3000, 700, 1500};
        System.out.println("Original Prices: " + Arrays.toString(productPrices));

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("Sorted Prices: " + Arrays.toString(productPrices));
    }
}
