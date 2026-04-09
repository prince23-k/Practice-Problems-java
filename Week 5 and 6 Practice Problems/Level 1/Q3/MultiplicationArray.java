import java.util.Scanner;

public class MultiplicationArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();

        int[] table = new int[10];

        // Store multiplication results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display results
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        input.close();
    }
}