import java.util.*;
class StudentGrades2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Get the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();


        // Create a 2D array to store marks (rows represent students, columns represent subjects)
        int[][] marks = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, and Maths
        double[] percentages = new double[numStudents]; // Percentages
        String[] grades = new String[numStudents]; // Grades
        String[] remarks = new String[numStudents]; // Remarks


        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));


            // Get marks for Physics, Chemistry, and Maths
            for (int j = 0; j < 3; j++) {
                do {
                    if (j == 0) {
                        System.out.print("Enter marks for Physics: ");
                    } else if (j == 1) {
                        System.out.print("Enter marks for Chemistry: ");
                    } else {
                        System.out.print("Enter marks for Maths: ");
                    }


                    marks[i][j] = input.nextInt();


                    if (marks[i][j] < 0) {
                        System.out.println("Marks cannot be negative. Please enter positive values.");
                    }


                } while (marks[i][j] < 0); // Ensure marks are non-negative
            }


            // Calculate percentage
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 3.0); // Average marks


            // Assign grades based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i] = "R";
                remarks[i] = "Remedial Standards";
            }
        }


        // Display the results for each student
        System.out.println("\nStudent Results:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics Marks: " + marks[i][0]);
            System.out.println("Chemistry Marks: " + marks[i][1]);
            System.out.println("Maths Marks: " + marks[i][2]);
            System.out.println("Average Marks: " + percentages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println("Remarks: " + remarks[i]);
        }
    }
}
