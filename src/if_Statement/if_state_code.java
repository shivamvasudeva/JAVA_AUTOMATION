package if_Statement;

import java.util.Scanner;

public class if_state_code {
    public static void main(String[] args) {

        // Inirialize known value
        int sal = 10000000000;
        int bonus = 250;


        // Get value for the unknown
        System.out.println("no. of sale: ");
        Scanner sale =  new Scanner(System.in);
        int sales = sale.nextInt();
        sale.close();

        //quick detpur for the bonus eners
        if (sales >= 10) {
            sal = sal + bonus;
        }

        //output
        System.out.println("Salary is: " + sal);

    }
}
