import java.util.Random;

public class FootballTeamHeights {

    // Method to find sum of all heights
    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate mean height
    public static double meanHeight(int[] heights) {
        return (double) sumHeights(heights) / heights.length;
    }

    // Method to find shortest height
    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] heights = new int[11]; // 11 players

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // 0-100 + 150 => 150-250
        }

        // Display heights of players
        System.out.print("Heights of players (in cm): ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        // Find and display shortest, tallest, and mean heights
        System.out.println("Shortest height: " + shortestHeight(heights) + " cm");
        System.out.println("Tallest height: " + tallestHeight(heights) + " cm");
        System.out.printf("Mean height: %.2f cm%n", meanHeight(heights));
    }
}