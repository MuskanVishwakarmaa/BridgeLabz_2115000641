import java.util.*;
class BMI2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons in the team: ");
        int numPersons = input.nextInt();
        double[][] personData = new double[numPersons][3]; // 2D array to store height, weight, and BMI
        String[] weightStatus = new String[numPersons]; // Array to store weight status
        for (int i = 0; i < numPersons; i++) {
            double weight, height;
            // Input for weight, ensuring positive values
            do {
                System.out.println("Enter details for person " + (i + 1) + ":");
                System.out.print("Enter weight (kg): ");
                weight = input.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (weight <= 0);
            // Input for height, ensuring positive values
            do {
                System.out.print("Enter height (cm): ");
                height = input.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            } while (height <= 0);
            // Store the weight and height in the 2D array
            personData[i][0] = weight;
            personData[i][1] = height;
            // Calculate BMI
            double heightInMeters = height / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            personData[i][2] = bmi;
            // Determine weight status
            if (bmi < 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        // Display the details for each person
        System.out.println("\nDetails of all persons:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][1] + " cm");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
        }
    }
}
