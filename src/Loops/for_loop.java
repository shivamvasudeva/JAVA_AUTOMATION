package Loops;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        System.out.println(" Enter num of items");
        Scanner scanner = new Scanner(System.in);
        int items= scanner.nextInt();
        double total = 0;

        //loop
        for (int i = 0; i < items; i++) {
            System.out.println("cost of item: " + (i+1));
            double cost= scanner.nextDouble();
            total = total+cost;
        }
        System.out.println("totla cost is $" +total);
        scanner.close();
    }
}
