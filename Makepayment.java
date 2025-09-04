import java.util.Scanner;
 
public class Makepayment {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product 1 name: ");
        String product1 = scanner.nextLine();
        // System.out.println("Product #1 name: "+product1);
        System.out.print("Enter Product 1 price: ");
        double productprice1 = scanner.nextDouble();
        // System.out.println("Product #1 price: "+productprice1);
        System.out.print("Enter quantity for product 1 : ");
        int quantityProduct1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name Product 2 : ");
        String product2 = scanner.nextLine();
        // System.out.println("Product #2 name: "+product2);
        System.out.print("Enter price Product 2 : ");
        double productprice2 = scanner.nextDouble();
        // System.out.println("Product #2 name: "+productprice2);
        System.out.print("Enter quantity for product 2 : ");
        int quantityProduct2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name Product 3 : ");
        String product3 = scanner.nextLine();
        // System.out.println("Product #3 name: " +product3);
        System.out.print("Enter price Product 3 : ");
        double productprice3 = scanner.nextDouble();
        // System.out.println("Product #3 name: "+productprice3);
        System.out.print("Enter quantity for product 3 : ");
        int quantityProduct3 = scanner.nextInt();
        scanner.nextLine();
        
        // double sum =productprice1+productprice2+productprice3;

        System.out.print("Customer paid money :");
        double customerPaid = scanner.nextDouble();
        System.out.println("");
        System.out.println("-----Receipt-----");

        double sumProduct1 = productprice1*quantityProduct1;
        System.out.println(product1+": "+productprice1+" X "+quantityProduct1+" = "+sumProduct1+" Baht");
        double sumProduct2 = productprice2*quantityProduct2;
        System.out.println(product2+": "+productprice2+" X "+quantityProduct2+" = "+sumProduct2+" Baht");
        double sumProduct3 = productprice3*quantityProduct3;
        System.out.println(product3+": "+productprice3+" X "+quantityProduct3+" = "+sumProduct3+" Baht");

        double Subtotal = sumProduct1+sumProduct2+sumProduct3;
        System.err.println("Subtotal: "+Subtotal+" Baht");

        // System.out.println("Total price before tax: "+sum+" baht");
        
        double vat = Subtotal * 0.07;
        System.out.println("VAT 7%: "+vat+" baht");

        double sumVat = Subtotal + vat;
        System.out.println("Total including VAT: "+sumVat+" baht");

        System.out.println("Amount paid: "+customerPaid+" baht");
        
        double change = customerPaid - sumVat;
        System.out.println("Change: " +change+" baht");
    }
}