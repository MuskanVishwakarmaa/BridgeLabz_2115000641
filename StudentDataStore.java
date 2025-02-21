import java.io.*;

public class StudentDataStore {
    public static void main(String[] args) {
        String filePath = "student_details.dat";

        // Sample student data
        int rollNumber = 641;
        String name = "Muskan Vishwakarma";
        double gpa = 3.75;

        try {
            // Write student details to binary file
            writeStudentData(filePath, rollNumber, name, gpa);
            
            // Retrieve and display student details from binary file
            readStudentData(filePath);
        } catch (IOException e) {
            System.out.println("Error during file operations: " + e.getMessage());
        }
    }

    // Method to write student details to a binary file
    public static void writeStudentData(String filePath, int rollNumber, String name, double gpa) throws IOException {
        // Use DataOutputStream to write primitive data to the file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            // Writing student details to the binary file
            dos.writeInt(rollNumber);  // Write roll number as an integer
            dos.writeUTF(name);        // Write name as a UTF string
            dos.writeDouble(gpa);      // Write GPA as a double

            System.out.println("Student data written to file.");
        }
        // dos.close() is automatically called here due to try-with-resources
    }

    // Method to read student details from a binary file
    public static void readStudentData(String filePath) throws IOException {
        // Use DataInputStream to read primitive data from the file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            // Reading and displaying student details
            int rollNumber = dis.readInt();    // Read roll number (int)
            String name = dis.readUTF();       // Read name (UTF string)
            double gpa = dis.readDouble();     // Read GPA (double)

            // Display the student details
            System.out.println("Student Details:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        }
        // dis.close() is automatically called here due to try-with-resources
    }
}
