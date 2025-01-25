import java.util.*;
class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons in the team: ");
        int numPersons = input.nextInt();
        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            weight[i] = input.nextDouble();
            System.out.print("Enter height (cm): ");
            height[i] = input.nextDouble();
            // Convert height to meters
            double heightInMeters = height[i] / 100;
            // Calculate BMI
            bmi[i] = weight[i] / (heightInMeters * heightInMeters);
            // Determine weight status
            if (bmi[i] < 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        // Display the details for each person
        System.out.println("\nDetails of all persons:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + height[i] + " cm");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Weight Status: " + status[i]);
            System.out.println();
        }
    }
}
