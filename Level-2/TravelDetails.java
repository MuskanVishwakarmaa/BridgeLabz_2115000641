import java.util.Scanner;
public class TravelDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter the city you are starting from: ");
        String fromCity = input.nextLine();
        System.out.print("Enter the via city: ");
        String viaCity = input.nextLine();
        System.out.print("Enter your destination city: ");
        String toCity = input.nextLine();
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = input.nextDouble();
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = input.nextDouble();
        System.out.print("Enter the total time taken for the journey in hours: ");
        double timeTaken = input.nextDouble();
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;
        System.out.println("\nTravel Details for " + name + ":");
        System.out.println("You are traveling from " + fromCity + " to " + toCity + " via " + viaCity + ".");
        System.out.println("The total distance is " + totalDistance + " miles.");
        System.out.println("The average speed during the trip is " + averageSpeed + " miles per hour.");
    }
}

