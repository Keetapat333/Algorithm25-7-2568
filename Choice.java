import java.util.Scanner;

public class Choice {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Input number 1 is Area ");
    System.out.println("Input number 2 is BMI ");
    System.out.print("Enter you number : ");
    int number = scanner.nextInt();

    if (number == 1) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter high: ");
        double high = scanner.nextDouble();
        // หารแบบ1/2ไม่ได้ต้อง 1.0 
        double triangle = (1.0/2.0) * base * high;
        System.out.println("Triangle = " + triangle);

    } else if (number == 2) {
        System.out.print("Enter your weight kilograms:");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters:");
        double height = scanner.nextDouble();

        double resultBMI = weight/ (height * height);
        System.out.println("BMI for weight = " + weight+ "kg" + " and height"+ height +"meters"+"Your BMI for weight = " + 
        resultBMI + "bmi .");
    } else  {
        System.out.println("Please enter only the numbers 1 , 2");
    }
  }
}