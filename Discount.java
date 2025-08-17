
import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Price: ");
        int xPrice = scanner.nextInt();
        System.out.print("Enter number to buy: ");
        int xBuy = scanner.nextInt();
        System.out.print("Enter discount: ");
        double xDiscount = scanner.nextDouble();
        double sumDiscount = xDiscount / 100.0;

        int total = xPrice * xBuy;
        System.out.println("Total cost = " + total + " Baht");

        double discountAmount = total * sumDiscount;
        System.out.println("discountAmount = " + discountAmount + " Baht");

        double netPay = total - discountAmount;
        System.out.println("Net Pay = " + netPay + " Baht");
    }
}
