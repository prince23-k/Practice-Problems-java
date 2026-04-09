import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum handshakes using combination formula
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate maximum handshakes
        int maxHandshakes = calculateHandshakes(numberOfStudents);

        // Display the result
        System.out.println("The maximum number of possible handshakes among " 
                            + numberOfStudents + " students is " + maxHandshakes);

        sc.close();
    }
}
