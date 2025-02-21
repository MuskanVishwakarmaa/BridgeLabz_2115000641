import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        // Set up BufferedReader to read user input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            // Asking for user name
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            
            // Asking for user age
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine()); // Read and convert age to integer
            
            // Asking for favorite programming language
            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();
            
            // Prepare data to write into file
            String userData = "Name: " + name + "\nAge: " + age + "\nFavorite Language: " + language;
            
            // Write data to a file using FileWriter
            FileWriter writer = new FileWriter("user_info.txt");
            writer.write(userData);
            writer.close();
            
            System.out.println("Data has been saved to user_info.txt.");
            
        } catch (IOException e) {
            System.out.println("An error occurred while reading input or writing to file.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for age. Please enter a valid number.");
        }
    }
}
