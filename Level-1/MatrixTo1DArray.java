import java.util.Scanner;
class MatrixTo1DArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        // Taking user input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();


        // Creating a 2D array (matrix) with the given rows and columns
        int[][] matrix = new int[rows][columns];


        // User input to fill the 2D array
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }


        // Creating a 1D array to store the elements of the 2D array
        int[] array = new int[rows*columns];
        int index = 0;


        // Copying elements from 2D array to 1D array
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                array[index++] = matrix[i][j]; // Copy element and increment index
            }
        }


        // Displaying the 1D array
        System.out.print("Elements in the 1D array: ");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
