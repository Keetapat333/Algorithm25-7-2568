import java.util.Scanner;

public class AreaSquareTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter high: ");
        double high = scanner.nextDouble();
        // หารแบบ1/2ไม่ได้ต้อง 1.0 
        double triangle = (1.0/2.0) * base * high;
        System.out.println("Triangle = " + triangle);

        System.out.print("Enter side1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = scanner.nextDouble();
        double square = side1 * side2;
        System.out.println("Square = "+square);
    }
}