import java.io.*;

public class BufferedFileCopy {
    public static void main(String args[]) {
        String source2 = "largefile.dat"; 
        String destinationFileBuffered = "copy_buffered.dat";
        String destinationFileUnbuffered = "copy_unbuffered.dat";

        // Check if source file exists
        File srcFile = new File(source2);
        if (!srcFile.exists()) {
            System.out.println("Error: Source file does not exist.");
            return; // Exit if file is missing
        }

        // Copy using buffered streams
        long bufferedTime = copyUsingBufferedStreams(source2, destinationFileBuffered);
        System.out.println("Buffered Copy Time: " + bufferedTime + " ns");

        // Copy using unbuffered streams
        long unbufferedTime = copyUsingUnbufferedStreams(source2, destinationFileUnbuffered);
        System.out.println("Unbuffered Copy Time: " + unbufferedTime + " ns");

        // Compare Performance
        if (bufferedTime > 0) {
            double speedup = (double) unbufferedTime / bufferedTime;
            System.out.println("Buffered Streams are " + String.format("%.2f", speedup) + " times faster than Unbuffered Streams.");
        } else {
            System.out.println("Error: Buffered time is zero, check file sizes.");
        }
    }

    // Copy file using Buffered Streams
    public static long copyUsingBufferedStreams(String source2, String destination2) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source2));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination2))) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }

    // Copy file using Unbuffered Streams
    public static long copyUsingUnbufferedStreams(String source2, String destination2) {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source2);
             FileOutputStream fos = new FileOutputStream(destination2)) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }
}
