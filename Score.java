import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your midterm score: ");
        int scoreMidterm = scanner.nextInt();

        System.out.print("Enter your final score: ");
        int scoreFinal = scanner.nextInt();

        int resultScore = scoreMidterm + scoreFinal;

        if(resultScore >= 50) {
            System.out.println("your total score is "+resultScore+" . The result is Pass!!");
        } else {
            System.out.println("your total score is "+resultScore+" . The result is Fail!!");
        }
        
    }
}