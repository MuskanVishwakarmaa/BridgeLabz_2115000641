public class StringVsBuilderVsBuffer {
    public static void main(String[] args) {
        int[] operations = {1_000, 10_000, 1_000_000}; // Given operation counts
        String word = "test";

        for (int N : operations) {
            System.out.println("Operations Count: " + N);

            // Measure String performance (Skip for 1,000,000 as it's infeasible)
            double stringTime = -1;
            if (N <= 10_000) {
                long startString = System.nanoTime();
                String str = "";
                for (int i = 0; i < N; i++) {
                    str += word;
                }
                long endString = System.nanoTime();
                stringTime = (endString - startString) / 1_000_000.0;
                System.out.printf("String concatenation took: %.6f ms%n", stringTime);
            } else {
                System.out.println("String concatenation is infeasible for this operation count.");
            }

            // Measure StringBuilder performance
            long startStringBuilder = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append(word);
            }
            long endStringBuilder = System.nanoTime();
            double stringBuilderTime = (endStringBuilder - startStringBuilder) / 1_000_000.0;
            System.out.printf("StringBuilder concatenation took: %.6f ms%n", stringBuilderTime);

            // Measure StringBuffer performance
            long startStringBuffer = System.nanoTime();
            StringBuffer sbf = new StringBuffer();
            for (int i = 0; i < N; i++) {
                sbf.append(word);
            }
            long endStringBuffer = System.nanoTime();
            double stringBufferTime = (endStringBuffer - startStringBuffer) / 1_000_000.0;
            System.out.printf("StringBuffer concatenation took: %.6f ms%n", stringBufferTime);

            System.out.println("--------------------------------------------------");
        }
    }
}
