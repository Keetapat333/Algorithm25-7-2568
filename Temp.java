import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Fahrenheit:");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5.0/9) * (fahrenheit-32);
        System.out.println("Celsius = " +celsius);
    }
}