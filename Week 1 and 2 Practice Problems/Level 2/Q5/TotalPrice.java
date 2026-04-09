import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double unitPrice;
        int quantity;

        // Taking input
        System.out.print("Enter unit price: ");
        unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity " + quantity +
                           " and unit price is INR " + unitPrice);

        input.close();
    }
}