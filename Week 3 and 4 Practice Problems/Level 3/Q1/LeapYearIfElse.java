import java.util.Scanner;

public class LeapYearIfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year;
        System.out.print("Enter a year: ");
        year = input.nextInt();

        if (year < 1582) {
            System.out.println("Year should be >= 1582 (Gregorian Calendar)");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Year is a Leap Year");
                    } else {
                        System.out.println("Year is not a Leap Year");
                    }
                } else {
                    System.out.println("Year is a Leap Year");
                }
            } else {
                System.out.println("Year is not a Leap Year");
            }
        }

        input.close();
    }
}