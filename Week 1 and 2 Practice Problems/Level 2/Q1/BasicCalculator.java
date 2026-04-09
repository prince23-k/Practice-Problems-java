import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number1, number2;

        // Taking input
        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        // Operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;

        // Handle division safely
        double division;
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            division = 0;
            System.out.println("Division by zero is not allowed.");
        }

        // Output
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", "
                + multiplication + ", and " + division);

        input.close();
    }
}