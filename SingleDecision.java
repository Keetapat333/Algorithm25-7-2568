import java.util.Scanner;

public class SingleDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter Number: ");
        // int number = scanner.nextInt();

        // if (number > 0) {
        //     System.out.println("จำนวนเต็มบวก");
        // }
        // System.out.println("จบโปรแกรม");
        
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        if (number %2 == 0) {
            System.out.println("Number "+number+" is Even");
        } else {
            System.out.println("Number "+number+" is Odd");
        }
        System.out.println("จบโปรแกรม");

    }
}