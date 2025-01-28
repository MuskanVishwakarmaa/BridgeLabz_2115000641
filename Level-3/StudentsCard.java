import java.util.Random;
import java.util.Scanner;

public class StudentsCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the number of students from the user
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random scores for students
        int[][] scores = generateRandomScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScoreCard(scores, results);
    }

    // Method to generate random 2-digit scores for PCM for students
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 columns for Physics, Chemistry, and Math

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + random.nextInt(90); // Random 2-digit scores (10-99)
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // Columns for Total, Average, and Percentage

        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("\n===============================================================");
        System.out.println("                           Scorecard                           ");
        System.out.println("===============================================================");
        System.out.println("Student | Physics | Chemistry | Math | Total | Average | Percentage");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println("   " + (i + 1) + "   |   " + scores[i][0] + "   |    " + scores[i][1] + "    |  " + scores[i][2] + " |  " +
                               (int) results[i][0] + "  |  " + results[i][1] + "  |   " + results[i][2] + "%");
        }
        System.out.println("===============================================================");
    }
}
