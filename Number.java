import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();

        System.out.println(" number1 = " + number1 + " and number2 = " + number2);
        System.out.println("Swapping ..........");

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println(" number1 = " + number1 + " and number2 = " + number2);
    }
}
