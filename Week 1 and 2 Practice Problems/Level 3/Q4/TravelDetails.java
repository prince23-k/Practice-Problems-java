import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("From City: ");
        String fromCity = sc.nextLine();

        System.out.print("Via City: ");
        String viaCity = sc.nextLine();

        System.out.print("To City: ");
        String toCity = sc.nextLine();

        System.out.print("Distance from " + fromCity + " to " + viaCity + ": ");
        double fromToVia = sc.nextDouble();

        System.out.print("Distance from " + viaCity + " to " + toCity + ": ");
        double viaToFinal = sc.nextDouble();

        System.out.print("Time from " + fromCity + " to " + viaCity + " (minutes): ");
        double time1 = sc.nextDouble();

        System.out.print("Time from " + viaCity + " to " + toCity + " (minutes): ");
        double time2 = sc.nextDouble();

        double totalDistance = fromToVia + viaToFinal;
        double totalTime = time1 + time2;

        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistance +
                " km and the Total Time taken is " + totalTime + " minutes");
    }
}
