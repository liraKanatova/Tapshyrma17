public class Rhombus extends Shape{
    private double a;


    public Rhombus(String name, double a) {
        super(name);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "a=" + a +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 4*a;
    }
}
