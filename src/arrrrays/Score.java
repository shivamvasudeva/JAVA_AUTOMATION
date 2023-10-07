package arrrrays;

import java.util.Scanner;

/*
1.Create a program where a user can enter as many grads they want
2. Avrage of grades
3. Max Score
4. Min Score
 */
public class Score {
    // Intialize the array
    private static int grades[];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Ask the user how many grads they want to add
        System.out.println("Enter the number of grades you want to add: ");
        grades= new int [scanner.nextInt()];
        getGrades();
        System.out.println("Avg: " + String.format("%2f",avgscore()));
        System.out.println("Maxx Score: " + MaxScore());
        System.out.println("Min Score: " + MinScore());

    }
    public static void getGrades() {
        for(int i=0; i<grades.length; i++) {
            System.out.println("Enter Grade # "+ (i+1));
            grades[i]= scanner.nextInt();
        }
    }
    public static int sumofgrades() {
        int sum = 0;
        for(int grade: grades) {
            sum = sum+ grade;
        }
        return sum;
    }
    public static double avgscore() {
        return sumofgrades()/grades.length;
    }
    public static int MaxScore() {
        int maxx = grades[0];
        for (int grade: grades) {
            if (grade > maxx) {
                maxx = grade;
            }
        }
        return maxx;
    }
    public static int MinScore() {
        int minn = grades[0];
        for (int grade:  grades) {
            if (grade < minn) {
                minn = grade;
            }
        }
        return minn;
    }
}
