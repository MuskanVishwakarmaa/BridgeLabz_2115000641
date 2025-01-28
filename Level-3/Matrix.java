import java.util.Random;

public class Matrix{

    public static void main(String[] args) {
        int[][] matrixA = createRandomMatrix(3, 3);
        int[][] matrixB = createRandomMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        System.out.println("Addition of A and B:");
        displayMatrix(addMatrices(matrixA, matrixB));

        System.out.println("Subtraction of A and B:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        System.out.println("Multiplication of A and B:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));

        System.out.println("Transpose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA));

        System.out.println("Determinant of Matrix A: " + determinant(matrixA));

        System.out.println("Inverse of Matrix A:");
        try {
            displayMatrix(inverse(matrixA));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random values between 0-9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int common = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Method to calculate the determinant of a matrix
    public static int determinant(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            return determinant2x2(matrix);
        } else if (matrix.length == 3 && matrix[0].length == 3) {
            return determinant3x3(matrix);
        } else {
            throw new IllegalArgumentException("Only 2x2 and 3x3 matrices are supported.");
        }
    }

    // Determinant of 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Determinant of 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a matrix
    public static double[][] inverse(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            return inverse2x2(matrix);
        } else if (matrix.length == 3 && matrix[0].length == 3) {
            return inverse3x3(matrix);
        } else {
            throw new IllegalArgumentException("Only 2x2 and 3x3 matrices are supported.");
        }
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) throw new ArithmeticException("Matrix is singular and cannot be inverted.");

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;

        return inverse;
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) throw new ArithmeticException("Matrix is singular and cannot be inverted.");

        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = getMinor(matrix, i, j);
                inverse[j][i] = (determinant2x2(minor) / (double) det) * (((i + j) % 2 == 0) ? 1 : -1);
            }
        }
        return inverse;
    }

    // Helper method to get minor of a matrix
    public static int[][] getMinor(int[][] matrix, int row, int col) {
        int[][] minor = new int[2][2];
        int minorRow = 0;
        for (int i = 0; i < 3; i++) {
            if (i == row) continue;
            int minorCol = 0;
            for (int j = 0; j < 3; j++) {
                if (j == col) continue;
                minor[minorRow][minorCol] = matrix[i][j];
                minorCol++;
            }
            minorRow++;
        }
        return minor;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to display a double matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
        System.out.println();
    }
}
