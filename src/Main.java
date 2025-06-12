// require scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //define variables
        double price;
        double shippingCost;
        double totalPrice;
        final double SHIPPING_RATE = 0.02;
        final double FREE_SHIPPING_CUTOFF = 100;
        String trash;

        // create a scanner in to read from the console
        Scanner in = new Scanner(System.in);

        // input the price of the item
        System.out.print("Enter the price of the item: ");

        if (in.hasNextDouble()) {
            price = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println( "Invalid input " + trash + ". Please enter a valid number.");
            return;
        }

        // determine if the price is $100 or more
        if (price >= FREE_SHIPPING_CUTOFF) {
            // when the price is equal to or greater than $100, the shippping cost is 0
            shippingCost = 0;
        } else {
            // when the price is less than $100, shipping cost is 2% of price
            shippingCost = price * SHIPPING_RATE;
        }

        // calculate totalPrice
        totalPrice = price + shippingCost;

        // output the shipping cost and total price
        System.out.println("Item price: $" + price);
        System.out.println("Shipping cost: $" + shippingCost);
        System.out.println("Total price: $" + totalPrice);
    }
}
