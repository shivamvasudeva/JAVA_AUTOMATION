package Classes_Objects;

public class Rect_area {
   private double len;
   private double wid;

    //Constructor
    public Rect_area() {
        len = 0;
        wid = 0;
    }

    // type 2 constructor
    public Rect_area(double length,  double width) {
        this.len = length;
        setLen(length);
        this.wid = width;
        setWid(width);
    }
    // Get-set-length
    public double getLen() {
        return len;
    }
    public void setLen(double l) {
        this.len = l;
    }
   // Get-set-width
   public double getWid() {
        return wid;
    }

    public void setWid(double w) {
        this.wid = w;
    }
    public double Cparameter() {
        return (2*len) + (2*wid);
    }
    public double Carea() {
        return len*wid;
    }
}
