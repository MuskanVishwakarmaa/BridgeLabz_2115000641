import java.util.*;
class EmployeeBonus{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Define arrays for 10 employees' salary and years of service
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        // Define arrays for bonus, new salary, and total variables
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        // Loop to take input for salary and years of service for 10 employees
        for (int i=0; i<10; i++){
            while(true){
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = input.nextDouble();
                if(salary[i]<=0){
                    System.out.println("Invalid salary. Please enter a positive number.");
                    continue;
                }
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i]= input.nextInt();
                if(yearsOfService[i]<0){
                    System.out.println("Invalid years of service. Please enter a valid number.");
                    continue;
                }
                break; // Exit loop if valid input is entered
            }
            //Calculate bonus and new salary based on years of service
            if(yearsOfService[i]>5){
                bonus[i] = salary[i]*0.05; //5% bonus for employees with more than 5 years of service
            } else {
                bonus[i] = salary[i]*0.02; //2% bonus for employees with less than or equal to 5 years of service
            }
            newSalary[i] = salary[i] + bonus[i]; //New salary after bonus
            //Calculate total old salary, total bonus, and total new salary
            totalOldSalary+= salary[i];
            totalBonus+= bonus[i];
            totalNewSalary+= newSalary[i];
        }
        // Print the total bonus, total old salary, and total new salary
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
