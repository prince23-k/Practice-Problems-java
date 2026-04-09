import java.util.Scanner;

public class DiscountInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fee;
        double discountPercent;

        // Taking user input
        System.out.print("Enter the fee: ");
        fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();

        // Calculations
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Output
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}