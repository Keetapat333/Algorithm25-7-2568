import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter num2: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter num3: ");
        double num3 = scanner.nextDouble();
        System.out.print("Enter num4: ");
        double num4 = scanner.nextDouble();
        System.out.print("Enter num5: ");
        double num5 = scanner.nextDouble();

        double sum = num1 + num2 + num3 + num4 + num5;
        double result = sum/5;
        System.out.println("Average num1-num5 = "+result);

    }
}