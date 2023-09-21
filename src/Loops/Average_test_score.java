package Loops;

import java.util.Scanner;

public class Average_test_score {
    public static void main(String[] args) {

        // Variables
        int NumberOfStudents = 24;
        int NumberofTest = 4;
        Scanner scanner = new Scanner(System.in);

        //Process all students -- Find the avrage of all the test for each student

        for(int i= 0; i<NumberOfStudents; i++) {
            double total = 0;
            for(int j=0; j<NumberofTest; j++) {
                System.out.println("Enter the score for test #"+ (j+1));
                double score= scanner.nextDouble();
                total =  total+score;
            }
            double avg = total/NumberofTest;
            System.out.println("The test Avg for student #" + (i+1)+ "is "+ avg);
        }
    }
}
