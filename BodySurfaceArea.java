import java.util.Scanner;

public class BodySurfaceArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Wide:");
        int wide = scanner.nextInt();
        System.out.print("Enter Long:");
        int longs = scanner.nextInt();

       int area = (wide * longs) / 360;
       System.out.println("body surface area = "+area);
    }
}