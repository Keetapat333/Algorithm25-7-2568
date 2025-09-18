import java.util.Scanner;

public class Product2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of the product (per unit): ");
        double price = sc.nextDouble();

        System.out.print("Enter the quantity of the product: ");
        int quantity = sc.nextInt();

        double total = price * quantity;

        if (quantity > 10) {
            System.out.println("You get a 10% discount!");
            total = total * 0.9;
        }

        System.out.println("Total price: %.1f Baht\n"+ total);
    }
}



