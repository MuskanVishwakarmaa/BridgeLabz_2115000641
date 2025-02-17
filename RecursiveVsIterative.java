public class RecursiveVsIterative {
    public static void main(String[] args) {
        // Test for Fibonacci of 10, 30, 50
        testFibonacci(10);
        testFibonacci(30);
        testFibonacci(50);
    }
    
    // Method to test both Recursive and Iterative Fibonacci
    public static void testFibonacci(int n) {
        System.out.println("Testing Fibonacci for n = " + n);

        // Measure time for Recursive
        long startRecursive = System.nanoTime();
        fibonacciRecursive(n);
        long endRecursive = System.nanoTime();
        System.out.println("Recursive Computation took: " + ((endRecursive - startRecursive) / 1_000_000) + " ms");

        // Measure time for Iterative
        long startIterative = System.nanoTime();
        fibonacciIterative(n);
        long endIterative = System.nanoTime();
        System.out.println("Iterative Computation took: " + ((endIterative - startIterative) / 1_000_000) + " ms");
        System.out.println();
    }

    // Method for Recursive Fibonacci
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Method for Iterative Fibonacci
    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
