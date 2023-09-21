package Methods;

import java.util.Scanner;

public class CreditCheck {
    static int reqSalary = 2500;
    static int reqCredit = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Calling method of taking user input
       double salary= getSalary();
       int creditscore = getCreditScore();

        //Check if the user if qualified
       boolean qualified = isUserQualified(creditscore, salary);
        scanner.close();

        //Notify the user
        notifyUser(qualified);
    }


//initialie variable we dont know

    //Method 1
    public static double getSalary() {
        System.out.println("Enter your Salary");
        double salary = scanner.nextDouble();
        return salary;
    }
// method 2
    public static int getCreditScore() {
        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
    // method 3
    public static boolean isUserQualified(int creditScore, double salary) {
        if (creditScore >= reqCredit && salary >= reqSalary) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void notifyUser(boolean isQualified) {
        if(isQualified) {
            System.out.println("You got Approved!!!!!");
        }
        else {
            System.out.println("Improve your salary and credit score");
        }
    }
}

