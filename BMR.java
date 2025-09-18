import java.util.Scanner;

public class BMR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your gender (M/F): ");
        String gender = scanner.nextLine();

        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (cm): ");
        double height = scanner.nextDouble();

        System.out.print("Enter your age (years): ");
        int age = scanner.nextInt();

        double bmr;

        if (gender.equalsIgnoreCase("M")) {
            bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
            System.out.println("Your BMR (Male) is: " + bmr + " kcal/day");
        } else if (gender.equalsIgnoreCase("F")) {
            bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
            System.out.println("Your BMR (Female) is: " + bmr + " kcal/day");
        } else {
            System.out.println("Invalid gender entered. Please enter M or F.");
        }
    }
}