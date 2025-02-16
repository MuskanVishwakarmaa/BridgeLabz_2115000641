import java.io.*;

class WordCount{
    public static void main(String[] args) throws Exception{
        String filePath = "sample.txt";
        String targetWord = "is";
        int count = 0;

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null){
            String[] words = line.split(" ");
            for (String word : words){
                if (word.equalsIgnoreCase(targetWord)){
                    count++;
                }
            }
        }

        br.close();
        fr.close();

        System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");
    }
}
