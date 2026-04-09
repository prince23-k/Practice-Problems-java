import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distanceInFeet;

        // Taking input
        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double yards = distanceInFeet / 3;

        // Convert yards to miles (1 mile = 1760 yards)
        double miles = yards / 1760;

        // Output
        System.out.println("The distance in yards is " + yards +
                           " while the distance in miles is " + miles);

        input.close();
    }
}