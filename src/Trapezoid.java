public class Trapezoid extends Shape {
    public double a;
    public double b;
    public double c;
    public double d;

    public Trapezoid(String name, double a, double b, double c, double d) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }



    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    @Override
    public double getPerimeter() {
        return a+b+c+d;
    }
}
