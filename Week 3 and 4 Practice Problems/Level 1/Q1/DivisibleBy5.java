import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();

        boolean isDivisible = (number % 5 == 0);

        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        input.close();
    }
}