package Methods;
import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        yourName(name);
    }
    public static void yourName(String name) {
        System.out.println("hi "+ name);
    }
}
