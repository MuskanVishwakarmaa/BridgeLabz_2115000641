import java.util.*;
class FootballTeamHeights {
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // Random height between 150 and 250 cm
        }
        return heights;
    }
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            shortest = Math.min(shortest, height);
        }
        return shortest;
    }
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            tallest = Math.max(tallest, height);
        }
        return tallest;
    }
    public static void main(String[] args) {
        int teamSize = 11;
        int[] heights = generateRandomHeights(teamSize);
        System.out.println("Heights of players (in cm): " + Arrays.toString(heights));
        System.out.println("Mean height: " + findMean(heights) + " cm");
        System.out.println("Shortest height: " + findShortestHeight(heights) + " cm");
        System.out.println("Tallest height: " + findTallestHeight(heights) + " cm");
    }
}
