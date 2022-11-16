public class Circle extends Shape{

    private double r;


    public Circle(String name, double r) {
        super(name);
        this.r = r;

    }

    public double getA() {
        return r;
    }

    public void setA(double a) {
        this.r = r;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "a=" + r +
                '}';
    }

    @Override
    public double getPerimeter() {
        return  Math.PI*2*r;
    }
}

