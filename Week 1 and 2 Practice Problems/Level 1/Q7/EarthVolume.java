public class EarthVolume {
    public static void main(String[] args) {

        double radiusKm = 6378;

        // Volume formula
        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        // Convert km³ to miles³ (1 km = 0.621371 miles)
        double volumeMiles = volumeKm * Math.pow(0.621371, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                           " and cubic miles is " + volumeMiles);
    }
}