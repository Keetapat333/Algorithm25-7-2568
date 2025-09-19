import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter student name: ");
     String name = scanner.nextLine();
    
     System.out.print("score (0-100): ");
     int score = scanner.nextInt();
     char grade;
    if(score>=0 && score<=100){
        if(score>=80){
            grade = 'A';
        } else if (score>=70) {
            grade = 'B';
        }else if (score>=60) {
            grade = 'C';
        }else if (score>=50) {
            grade = 'D';
        }else {
            grade = 'E';
        }
            System.out.println("---Result---");
            System.out.println("Name : "+name);
            System.out.println("Score: "+score);
            System.out.println("Grade: "+grade);
    }else{
        System.out.print("Wrong Score");
    }
            // System.out.println("---Result---");
            // System.out.println("Name : "+name);
            // System.out.println("Score: "+score);
            // System.out.println("Grade: "+grade);

    }
}