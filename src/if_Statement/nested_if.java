package if_Statement;
import java.util.Scanner;
public class nested_if {
    public static void main(String[] args) {
        int reqsal = 30000;
        int yr = 2;

        // Input1
        System.out.println("Salary: ");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();

        // inout 2

        System.out.println("years: ");
        int years = scanner.nextInt();
        scanner.close();


        // condtion
        if (salary >= reqsal) {
            if (years >= yr) {
                System.out.println(" You get the loone");

                }
            else {
                System.out.println("you need some years more");
            }
        }

        else {
            System.out.println("Noooooooo");
        }
    }


}
