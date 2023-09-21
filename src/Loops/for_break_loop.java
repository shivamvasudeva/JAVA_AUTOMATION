package Loops;
import java.util.Scanner;
public class for_break_loop {
    public static void main(String[] args)
    {
        System.out.println("Enter text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();
        boolean letterfound = false;
        // search letter x
        for (int i=0; i< text.length(); i++) {
            char currentletter = text.charAt(i);
            if (currentletter == 'A'|| currentletter == 'a')
            {
                letterfound = true;
                break;
             }
        }
        if (letterfound) {
            System.out.println("Here is a letter A");
        }
        else {
            System.out.println("Htext dont have A");
        }


    }
}
