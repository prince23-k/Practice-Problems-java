import java.util.Scanner;

public class TriangularRun {

    // Method to calculate perimeter of triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate number of rounds needed
    public static double calculateRounds(double perimeter, double targetDistance) {
        return targetDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sides of the triangle
        System.out.print("Enter side 1 of the triangle (meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangle (meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangle (meters): ");
        double side3 = sc.nextDouble();

        // Perimeter of the triangle
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Target distance in meters (5 km = 5000 meters)
        double targetDistance = 5000;

        // Calculate number of rounds
        double rounds = calculateRounds(perimeter, targetDistance);

        // Display result
        System.out.println("The athlete must complete approximately " 
                            + Math.ceil(rounds) + " rounds to cover 5 km.");

        sc.close();
    }
}