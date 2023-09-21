package Loops;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;
        do {
            System.out.println(" Enter number 1");
            double num1 = scanner.nextDouble();
            System.out.println(" Enter number 2");
            double num2 = scanner.nextDouble();
            double sum = num1 + num2;
            System.out.println("the sum is " + sum);
            System.out.println("would you want to run again: ");
            again = scanner.nextBoolean();

        } while(again);
        scanner.close();

    }
}
