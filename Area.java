import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float Pi = 3.14;

        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();

        int sum = Pi * num1;
        System.out.println("Area = " + sum);

    }
}