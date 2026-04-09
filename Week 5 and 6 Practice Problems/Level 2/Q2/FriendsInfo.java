import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);

            System.out.print("Age: ");
            ages[i] = input.nextInt();

            System.out.print("Height: ");
            heights[i] = input.nextDouble();
        }

        // Find youngest
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find tallest
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output
        System.out.println("\nYoungest friend is " + names[youngestIndex]);
        System.out.println("Tallest friend is " + names[tallestIndex]);

        input.close();
    }
}