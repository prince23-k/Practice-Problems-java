import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base, height;

        // Taking input
        System.out.print("Enter base in cm: ");
        base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert cm² to in² (1 inch = 2.54 cm → square it)
        double areaInches = areaCm / (2.54 * 2.54);

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaInches +
                           " and sq cm is " + areaCm);

        input.close();
    }
}