import java.util.*;
class YoungestAndTallest {
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }
    public static int findTallest(int[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];
        System.out.println("Enter the ages and heights of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            System.out.print(friends[i] + "'s age: ");
            ages[i] = input.nextInt();
            System.out.print(friends[i] + "'s height (in cm): ");
            heights[i] = input.nextInt();
        }
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);
        System.out.println("\nResults:");
        System.out.println("The youngest friend is " + friends[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");
    }
}
