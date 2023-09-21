package Classes_Objects;

public class HomeArea {
    public static void main(String[] args) {


        /***
         * Rectange 1
         */
        // Create instance for rectanger class

        Rect_area room1 = new Rect_area();
        room1.setWid(25);
        room1.setLen(50);
        double areea1 = room1.Carea();
        /***
         * Rectange 2
         */
        Rect_area room2 = new Rect_area(30,60);
        double area2 = room2.Carea();


        double totalarea = area2+areea1;
        System.out.println("Area of both rooms "+ totalarea);
    }

}
