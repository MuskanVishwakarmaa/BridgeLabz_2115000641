public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKM = 6378;
        double radiusMILES = radiusKM * 0.621371;
        double volInKm = (4.0 / 3) * Math.PI * Math.pow(radiusKM, 3);
        double volInMiles = (4.0 / 3) * Math.PI * Math.pow(radiusMILES, 3);
        System.out.println("The volume of Earth in cubic kilometers is " + String.format("%.2f", volInKm) + " and cubic miles is " + String.format("%.2f", volInMiles));
    }
}

