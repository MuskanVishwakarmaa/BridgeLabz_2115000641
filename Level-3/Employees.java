import java.util.Random;
public class Employees{
    public static void main(String[] args) {
        // Generate employee data
        int[][] employeeData = generateEmployeeData(10);

        // Calculate new salaries and bonuses
        int[][] updatedData = calculateBonusAndNewSalary(employeeData);

        // Display summary
        displaySummary(employeeData, updatedData);
    }

    // Generate random salaries and years of service
    public static int[][] generateEmployeeData(int count) {
        Random random = new Random();
        int[][] data = new int[count][2]; // [Salary, Years of Service]

        for (int i = 0; i < count; i++) {
            data[i][0] = 20000 + random.nextInt(80001); // Random salary between 20000-100000
            data[i][1] = random.nextInt(11); // Random years of service between 0-10
        }

        return data;
    }

    // Calculate bonus and new salary for employees
    public static int[][] calculateBonusAndNewSalary(int[][] employeeData) {
        int[][] updatedData = new int[employeeData.length][2]; // [New Salary, Bonus]

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];

            // Determine bonus percentage
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            int bonus = (int) (salary * bonusPercentage);

            // Calculate new salary
            updatedData[i][0] = salary + bonus;
            updatedData[i][1] = bonus;
        }

        return updatedData;
    }

    // Display the summary of employee data
    public static void displaySummary(int[][] employeeData, int[][] updatedData) {
        int totalOldSalary = 0;
        int totalBonus = 0;
        int totalNewSalary = 0;

        System.out.println("Emp#\tOld Salary\tYears\tBonus\tNew Salary");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            int bonus = updatedData[i][1];
            int newSalary = updatedData[i][0];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.println((i + 1) + "\t" + oldSalary + "\t\t" + years + "\t" + bonus + "\t" + newSalary);
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Total\t" + totalOldSalary + "\t\t\t" + totalBonus + "\t" + totalNewSalary);
    }
}

