import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float Pi = 3.14f;

        System.out.print("Enter num1: ");
        float num1 = scanner.nextInt();

        float sum = Pi * num1;
        System.out.println("Area = " + sum);

    }
}