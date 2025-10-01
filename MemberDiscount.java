
import java.util.Scanner;

public class MemberDiscount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter membership level (Silver, Gold, Platinum): ");
        String levelMember = scanner.nextLine();

        System.out.print("Enter total purchase amout: ");
        double total = scanner.nextDouble();

        if (levelMember.equals("Silver")) {
            double discount = 5.0 / 100.0;
            double resultDiscount = total * discount;
            double finalDiscount = total - resultDiscount;
            System.out.println("--- Receipt ---");
            System.out.println("Member level: " + levelMember);
            System.out.println("Total purchase: " + total);
            System.out.println("Discount: " + resultDiscount);
            System.out.println("Final price: " + finalDiscount);
        } else if (levelMember.equals("Gold")) {
            double discount = 10.0 / 100.0;
            double resultDiscount = total * discount;
            double finalDiscount = total - resultDiscount;
            System.out.println("--- Receipt ---");
            System.out.println("Member level: " + levelMember);
            System.out.println("Total purchase: " + total);
            System.out.println("Discount: " + resultDiscount);
            System.out.println("Final price: " + finalDiscount);
        } else if (levelMember.equals("Platinum")) {
            double discount = 15.0 / 100.0;
            double resultDiscount = total * discount;
            double finalDiscount = total - resultDiscount;
            System.out.println("--- Receipt ---");
            System.out.println("Member level: " + levelMember);
            System.out.println("Total purchase: " + total);
            System.out.println("Discount: " + resultDiscount);
            System.out.println("Final price: " + finalDiscount);
        } else {
            double discount = 0 / 100.0;
            double resultDiscount = total * discount;
            double finalDiscount = total - resultDiscount;
            System.out.println("--- Receipt ---");
            System.out.println("Member level: " + levelMember);
            System.out.println("Total purchase: " + total);
            System.out.println("Discount: " + resultDiscount);
            System.out.println("Final price: " + finalDiscount);
        }

    }
}
