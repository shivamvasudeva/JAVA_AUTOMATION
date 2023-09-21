package if_Statement;

import java.util.Scanner;

public class if_else_if {
    public static void main(String[] args) {
        //Get Test score from user
        System.out.println("What is your score: ");
        Scanner scanner = new Scanner(System.in);
        double score= scanner.nextDouble();
        //Determine the letter A, B, C ,D, F
        char grade;
        if (score < 60) {
            grade = 'F';
        }
        else if (score <70) {
            grade = 'D';
        }
        else if (score <80) {
            grade = 'C';
        }
        else if (score <90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        System.out.println("Your Grade is " + grade);
    }
}
