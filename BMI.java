import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight kilograms:");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters:");
        double height = scanner.nextDouble();

        double resultBMI = weight/ (height * height);
        System.out.println("BMI for weight = " + weight+ "kg" + " and height"+ height +"meters"+"Your BMI for weight = " + 
        resultBMI + "bmi .");
    }
}