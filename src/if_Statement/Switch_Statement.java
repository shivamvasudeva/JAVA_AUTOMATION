package if_Statement;

import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
String message;
        switch (grade) {
            case "A","a":
                message = "Great job";
                break;
            case "B":
                message = "Good job";
                break;
            case "C":
                message = "OK job";
                break;
            case "D":
                message = "Not job";
                break;
            case "F":
                message = "Worst job";
                break;
            default:
                message= "Error";
                break;
        }
        System.out.println(message);


    }

}
