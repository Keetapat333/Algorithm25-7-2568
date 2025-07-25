import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Money");
        double Money = scanner.nextDouble();
        // อยากให้หา%ต้องใช้เป็น 10.0 / 100.0 หรือไม่ก็ใช้ตัวแปรให้เป็น 0.1 ไปเลย
        double Tax = 10.0 / 100.0;
        double result = Tax * Money;

        System.out.println("Sumtax = " + result);

    }
}