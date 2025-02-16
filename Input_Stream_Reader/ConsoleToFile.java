import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args)throws IOException {
        String filePath = "output.txt"; // Output file

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        FileWriter fw = new FileWriter(filePath);
        
        System.out.println("Enter text (type 'exit' to stop):");
        String line;
        while (!(line = br.readLine()).equalsIgnoreCase("exit")){
            fw.write(line + "\n");
        }
        
        br.close();
        isr.close();
        fw.close();
    }
}