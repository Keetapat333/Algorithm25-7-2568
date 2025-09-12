import java.util.Scanner;
 public class NoteChange_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter You Money: ");
        int youMoney = scanner.nextInt();

        System.out.print("Enter name product 1#: ");
        String product1 = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter amout product 1#: ");
        int amoutProduct1 = scanner.nextInt();
        System.out.print("Enter price product 1#: ");
        int priceProduct1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name product2#: ");
        String product2 = scanner.nextLine();
        System.out.print("Enter amout product 2#: ");
        int amoutProduct2 = scanner.nextInt();
        System.out.print("Enter price product 2#: ");
        int priceProduct2 = scanner.nextInt();
        scanner.nextLine();

        int amoutSumProduct1 = amoutProduct1 * priceProduct1;
        System.out.println("Amout prouduct#1: "+amoutProduct1+" * "+priceProduct1+" = "+amoutSumProduct1+" bath");
        int amoutSumProduct2 = amoutProduct2 * priceProduct2;
        System.out.println("Amout prouduct#2: "+amoutProduct2+" * "+priceProduct2+" = "+amoutSumProduct2+" bath");

        int sumProductPrice = amoutSumProduct1 + amoutSumProduct2;
        System.out.println("Total Price Product: "+sumProductPrice+" baht");

        int change = youMoney - sumProductPrice;
        System.out.println("Change is : "+change+" baht");

        if(youMoney < sumProductPrice) {
            System.out.println("Not enough money");
        } else {
        int fiveHundred = change / 500;
        int changeFiveHundred = change % 500;
        System.out.println("Five-hundred note: "+fiveHundred+" note(s)");

        int hundred = changeFiveHundred / 100;
        int changeHundred = changeFiveHundred % 100;
        System.out.println("Hundred note: "+hundred+" note(s)");

        int fifty = changeHundred / 50;
        int changeFifty = changeHundred % 50;
        System.out.println("Fifty note: "+fifty+" note(s)");

        int twenty = changeFifty / 20;
        int changeTwenty = changeFifty % 20;
        System.out.println("Twenty note: "+twenty+" note(s)");

        int ten = changeTwenty / 10;
        int changeTen = changeTwenty % 10;
        System.out.println("Ten coin: "+ten+" note(s)");

        int five = changeTen / 5;
        int changeFive = changeTen % 5;
        System.out.println("Five coin: "+five+" note(s)");

        int two = changeFive / 2;
        int changetwo = changeFive % 2;
        System.out.println("Two coin: "+two+" note(s)");

        int one = changetwo / 1;
        System.out.println("One coin: "+one+" note(s)");
        }

    }
 }