import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time: ");
        double time = sc.nextDouble();

        double si = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + si +
                " for Principal " + principal +
                ", Rate " + rate +
                " and Time " + time);
    }
}