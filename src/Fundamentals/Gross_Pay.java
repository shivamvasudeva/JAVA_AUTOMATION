package Fundamentals;
import java.util.Scanner;

public class Gross_Pay {
    public static void main (String arg[]) {
        // + Get hours
        System.out.println("Enter hrs: ");
        Scanner scanner = new Scanner(System.in);
        int hrs= scanner.nextInt();
        // + Get Pay
        System.out.println("Enter pay: ");
        double money= scanner.nextDouble();
        // + Multiply hr and $
       double howmuch = hrs * money;
        // + Display
        System.out.print("total $" + howmuch);

    }
}
