
import java.util.Scanner;

public class Tempstatus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        int temp = scanner.nextInt();

        if (temp < 20) {
            System.out.println("Temperature: " + temp + " °C");
            System.out.println("Status: Cold");
        } else if (temp >= 20 && temp <= 35) {
            System.out.println("Temperature: " + temp + " °C");
            System.out.println("Status: Normal");
        } else {
            System.out.println("Temperature: " + temp + " °C");
            System.out.println("Status: Hot");
        }

    }
}
