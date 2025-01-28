import java.util.*;
class EuclideanDistance {
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2];
        double slope = (y2 - y1) / (x2 - x1);  // m = (y2 - y1) / (x2 - x1)
        double yIntercept = y1 - (slope * x1); // b = y1 - m * x1
        equation[0] = slope;
        equation[1] = yIntercept;
        return equation;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter coordinates of the first point (x1, y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter coordinates of the second point (x2, y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the points: " + distance);
        double[] equation = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + equation[0] + "x + " + equation[1]);
    }
}
