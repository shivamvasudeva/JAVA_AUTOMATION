package Classes_Objects;
import java.util.Scanner;
public class HomeAreaRedo {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        HomeAreaRedo calculator = new HomeAreaRedo();
        Rect_area kitchen = calculator.getRoom();
        Rect_area bathroom = calculator.getRoom();

        double area = calculator.CalTArea(kitchen, bathroom);
        System.out.println("Here is the area: "+ area);
        calculator.scanner.close();
    }

    public Rect_area getRoom() {

        System.out.println("Enter Leng");
        double length = scanner.nextDouble();

        System.out.println("Enter Width");
        double width = scanner.nextDouble();
        return new Rect_area(length, width);

    }

    public double CalTArea(Rect_area rec1, Rect_area rec2) {
        return rec1.Carea() + rec2.Carea();
    }
}

