import java.util.Scanner;
public class Distance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.println("The distance is " + String.format("%.2f", distanceInYards) + " yards and " + String.format("%.2f", distanceInMiles) + " miles for the given " + distanceInFeet + " feet.");
    }
}
