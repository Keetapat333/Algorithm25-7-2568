import java.util.Scanner;
 
public class Makepayment {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name Product#1 = ");
        String product1 = scanner.nextLine();
        System.out.println("Product #1 name: "+product1);
        System.out.print("Enter price Product#1 = ");
        double productprice1 = scanner.nextDouble();
        System.out.println("Product #1 price: "+productprice1);
        scanner.nextLine();

        System.out.print("Enter name Product#2 = ");
        String product2 = scanner.nextLine();
        System.out.println("Product #2 name: "+product2);
        System.out.print("Enter price Product#2 = ");
        double productprice2 = scanner.nextDouble();
        System.out.println("Product #2 name: "+productprice2);
        scanner.nextLine();

        System.out.print("Enter name Product#3 = ");
        String product3 = scanner.nextLine();
        System.out.println("Product #3 name: " +product3);
        System.out.print("Enter price Product#3 = ");
        double productprice3 = scanner.nextDouble();
        System.out.println("Product #3 name: "+productprice3);
        scanner.nextLine();
        
        double sum =productprice1+productprice2+productprice3;

        System.out.print("Customer paid money :");
        double customerPaid = scanner.nextDouble();
        System.out.println("-----Receipt-----");

        System.out.println("product1: "+productprice1);
        System.out.println("product2: "+productprice2);
        System.out.println("product3: "+productprice3);

        System.out.println("Total price before tax: "+sum+" baht");
        
        double vat = sum * 0.07;
        System.out.println("VAT = "+vat+" baht");

        double sumVat = sum + vat;
        System.out.println("Net price "+sumVat+" baht");

        System.out.println("Totol paid "+customerPaid+" baht");
        
        double change = customerPaid - sumVat;
        System.out.println("Change = " +change+" baht");
    }
}