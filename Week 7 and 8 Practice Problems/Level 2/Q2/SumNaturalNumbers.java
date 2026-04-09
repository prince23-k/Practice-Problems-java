import java.util.Scanner;

public class SumNaturalNumbers {

    // Method to calculate sum using recursion
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1; // Base case
        }
        return n + sumRecursive(n - 1); // Recursive call
    }

    // Method to calculate sum using formula
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a positive natural number.");
        } else {
            // Calculate sums
            int sumRec = sumRecursive(n);
            int sumForm = sumFormula(n);

            // Display results
            System.out.println("Sum of first " + n + " natural numbers using recursion: " + sumRec);
            System.out.println("Sum of first " + n + " natural numbers using formula: " + sumForm);

            // Compare the results
            if (sumRec == sumForm) {
                System.out.println("Both methods give the same result. ");
            } else {
                System.out.println("The results do not match. ");
            }
        }

        sc.close();
    }
}