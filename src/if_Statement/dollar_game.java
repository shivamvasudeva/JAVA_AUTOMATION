package if_Statement;

import java.util.Scanner;

public class Logical_Op {
    public static void main(String[] args) {
        System.out.println("Enter dimes");
        Scanner scanner = new Scanner(System.in);
        int dimes= scanner.nextInt();
        System.out.println("Enter qurters");
        int qut= scanner.nextInt();
        int total = 100;

        // value of coins dime and quarter
        double value_dime = dimes * 10;
        double value_quarter = qut * 25;

        double final_value = value_dime + value_quarter;

        if (final_value > total)  {
            double more = final_value - total;
            System.out.println("YOu are" + more + " cents above $1");
        }
        else if (final_value < total) {
            double less = total - final_value;
            System.out.println("YOu are" + less + "cents below $1");
        }
        else {
            System.out.println("You have exactly $1");
        }


    }
}
