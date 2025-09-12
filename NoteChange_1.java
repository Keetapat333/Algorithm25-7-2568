import java.util.Scanner;

public class NoteChange_1 {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter You Money: ");
        int youMoney = scanner.nextInt();

        System.out.print("Enter amout to pay: ");
        int amoutToPay = scanner.nextInt();

        int change = youMoney - amoutToPay;
        System.out.println("Change is : "+change+" baht");

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
