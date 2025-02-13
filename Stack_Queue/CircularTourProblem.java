class PetrolPump {
    int petrol;
    int distance;
    PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

public class CircularTourProblem {
    public static int findStartingPoint(PetrolPump[] pumps) {
        int start = 0, totalPetrol = 0, totalDistance = 0;
        int balance = 0, deficit = 0;
        for (int i = 0; i < pumps.length; i++) {
            totalPetrol += pumps[i].petrol;
            totalDistance += pumps[i].distance;
            balance += pumps[i].petrol - pumps[i].distance;
            if (balance < 0) {
                deficit += balance; // Store the negative balance
                start = i + 1;  // Move start to the next pump
                balance = 0;  // Reset balance
            }
        }
        return (totalPetrol >= totalDistance) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };

        int start = findStartingPoint(pumps);
        if (start == -1) {
            System.out.println("No valid starting point found.");
        } else {
            System.out.println("Start at petrol pump index: " + start);
        }
    }
}
