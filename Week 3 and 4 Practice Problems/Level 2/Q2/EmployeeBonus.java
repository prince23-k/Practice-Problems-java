import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salary;
        int years;

        System.out.print("Enter salary: ");
        salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        years = input.nextInt();

        double bonus = 0;

        if (years > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("The bonus amount is " + bonus);

        input.close();
    }
}