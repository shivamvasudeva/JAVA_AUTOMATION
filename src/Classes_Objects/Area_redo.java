package Classes_Objects;

import java.util.Scanner;

public class Area_redo {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Area_redo calculator = new Area_redo();
        Rect_area kitchen = calculator.getroom();
        Rect_area bath = calculator.getroom();

        double area = calculator.CalTArea(kitchen,bath);
        System.out.println("The area is "+ area);
        calculator.scanner.close();
    }

    public Rect_area getroom() {

        System.out.println("Enter the Len of the room");
        double length = scanner.nextDouble();
        System.out.println("Enter the Width of the room");
        double width = scanner.nextDouble();

        return new Rect_area(length,width);
    }
    public double CalTArea(Rect_area rec1, Rect_area rec2 ) {
        return  rec1.Carea() + rec2.Carea();
    }
}
