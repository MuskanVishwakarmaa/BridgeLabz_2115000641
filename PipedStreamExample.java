import java.io.*;

class WriterThread extends Thread {
    private PipedOutputStream pipedOutputStream;

    public WriterThread(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        String data = "My name is Muskan";
        try {
            // Write data to the piped output stream
            pipedOutputStream.write(data.getBytes());
            pipedOutputStream.close();
            System.out.println("Writer thread finished writing.");
        } catch (IOException e) {
            System.out.println("IOException in Writer Thread: " + e.getMessage());
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream pipedInputStream;

    public ReaderThread(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        try {
            // Read data from the piped input stream
            byte[] buffer = new byte[1024];
            int bytesRead = pipedInputStream.read(buffer);
            String data = new String(buffer, 0, bytesRead);
            System.out.println("Reader thread received: " + data);
            pipedInputStream.close();
        } catch (IOException e) {
            System.out.println("IOException in Reader Thread: " + e.getMessage());
        }
    }
}

public class PipedStreamExample {
    public static void main(String[] args) {
        // Create piped streams for inter-thread communication
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream();

        try {
            // Connect the input stream to the output stream
            pipedInputStream.connect(pipedOutputStream);

            // Create and start the writer and reader threads
            WriterThread writerThread = new WriterThread(pipedOutputStream);
            ReaderThread readerThread = new ReaderThread(pipedInputStream);
            
            writerThread.start();
            readerThread.start();
            
            // Wait for both threads to finish
            writerThread.join();
            readerThread.join();

        } catch (IOException | InterruptedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
