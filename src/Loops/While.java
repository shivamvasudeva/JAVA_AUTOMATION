package Loops;
import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        // variables
        int rate = 15;
        double Maxhours = 40;

        // Input
        System.out.println(" Enter hours");
        Scanner scanner = new Scanner(System.in);
        double hours= scanner.nextDouble();

// validate input: number of hours
        while (hours > Maxhours || hours < 1) {
            System.out.println("Invalid value, Try again");
            hours = scanner.nextDouble();
        }
scanner.close();
        //cal gross
        double pay = rate * hours;
        System.out.println("you will be paid $"+pay);
    }
}
