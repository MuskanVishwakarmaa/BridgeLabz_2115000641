import java.util.*;
class BMI {
    public static double[][] calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightInMeters = personData[i][1] / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            personData[i][2] = bmi;
        }
        return personData;
    }
    public static String[] determineBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi < 18.4) {
                status[i] = "underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "normal";
            } else if (bmi >= 25 && bmi <= 39.9) {
                status[i] = "overweight";
            } else {
                status[i] = "obese";
            }
        }
        return status;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] personData = new double[10][3]; // 10 persons, 3 columns (weight, height, BMI)
        String[] bmiStatus = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();
        }
        personData = calculateBMI(personData);
        bmiStatus = determineBMIStatus(personData);
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " cm");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + bmiStatus[i]);
            System.out.println();
        }
    }
}
