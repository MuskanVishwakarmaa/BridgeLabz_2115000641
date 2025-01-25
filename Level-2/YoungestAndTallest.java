import java.util.*;
class YoungestAndTallest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Arrays to store age and height for 3 friends
        int[] age = new int[3];
        double[] height = new double[3];
        // Taking input for age and height of 3 friends
        System.out.println("Enter the details for Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++){
            System.out.print("Enter age for friend " + (i + 1) + ": ");
            age[i] = input.nextInt();
            System.out.print("Enter height for friend " + (i + 1) + ": ");
            height[i] = input.nextDouble();
        }
        int youngestIndex = 0;
        int tallestIndex = 0;
        // Loop through the arrays to find the youngest and tallest
        for (int i=1; i<3; i++){
            if (age[i]<age[youngestIndex]){
                youngestIndex = i; // Update youngest if the current friend is younger
            }
            if (height[i]>height[tallestIndex]){
                tallestIndex = i; // Update tallest if the current friend is taller
            }
        }
        // Display the youngest and tallest friend's details
        String[] friends = {"Amar", "Akbar", "Anthony"};
        System.out.println("\nThe youngest friend is " + friends[youngestIndex] + " with age " + age[youngestIndex]);
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + height[tallestIndex] + " meters");
    }
}
