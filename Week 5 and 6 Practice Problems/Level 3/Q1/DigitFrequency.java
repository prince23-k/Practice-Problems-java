import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();

        int temp = number;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int index = 0;
        temp = number;

        // Store digits in array
        while (temp != 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }

        // Frequency array (0–9)
        int[] frequency = new int[10];

        // Count frequency
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        input.close();
    }
}