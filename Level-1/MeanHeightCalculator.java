import java.util.Scanner;
class MeanHeightCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       
        double[] heights = new double[11]; // Array to store the heights of 11 players
        double sum = 0.0; // Variable to store the sum of heights
       
        // Taking input for heights
        System.out.println("Enter the heights of 11 football players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = input.nextDouble();
            sum+= heights[i]; // Adding height to sum
        }


        //Calculating mean height
        double mean = sum / 11;


        //Displaying the mean height
        System.out.println("\nThe mean height of the football team is: " + mean + " cm");
    }
}
