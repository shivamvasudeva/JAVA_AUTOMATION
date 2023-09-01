package if_Statement;

import java.util.Scanner;

public class if_else_code {
    public static void main(String[] args) {
        // Quotea
        int quota = 10;

        // get sales
        System.out.println("Sales done: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        // condtion
        if (sales > quota) {
            System.out.println("WOW you are doing an amaizng job");
        }
        else {
            System.out.println(" You need to do somthing about it");
        }

        //print out

    }
}
