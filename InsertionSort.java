class SortEmpIDs{
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int k = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>k){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = k;
        }
    }
}

//main class
public class InsertionSort {
	
	//method to print employee ID
    public static void printID(int EmpID[]) {
        for (int i = 0; i < EmpID.length; i++) {
            System.out.print(EmpID[i] + " ");
        }
        System.out.println();
    }
	
	//main method 
    public static void main(String args[]){
        int EmpID[] = {123, 654, 358, 865, 598, 567, 901};
        SortEmpIDs.insertionSort(EmpID);
        printID(EmpID);
    }
}
