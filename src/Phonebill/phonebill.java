package Phonebill;

public class phonebill {
    private int id;
    private int min;
    private int minused;
    private double basecost;


    public phonebill() {
        id = 0;
        basecost = 50;
        min = 1000;
        minused = 100002;
    }
    public phonebill(int id, int min, int minused, double basecost) {
        this.id =id;
        setId(id);
        this.min = min;
        setMin(min);
        this.minused = minused;
        setMinused(minused);
        this.basecost = basecost;
        setBasecost(basecost);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }  public int getMinused() {
        return minused;
    }
    public void setMinused(int minused) {
        this.minused = minused;
    }

    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public double getBasecost() {
        return basecost;
    }
    public void setBasecost(double basecost) {
        this.basecost = min;
    }

    //cal overage min cost
    public double caloverrage() {
        if (minused <= min) {
            return 0;
        }
        double ovr = 0.25;
        double ovrMin = minused - min;
        return ovrMin * ovr;
    }

    // calculate tax
    public double calTax(){
    double taxRate = 0.15;
    return taxRate* (basecost+caloverrage());
            }
public  double totalbill() {
        return basecost+calTax() + caloverrage();
}
public void printall() {
    System.out.println("ID:" +id);
    System.out.println("Base rate $"+basecost);
    System.out.println("Overagefees:" +String.format("%.2f",caloverrage()));
    System.out.println("Total $"+ totalbill());
}
}
