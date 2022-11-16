public class Triangle extends Shape{

    private double length;
    private double width;
    private double midium;


    public double getLength() {
        return length;
    }

    public Triangle(String name, double length, double width,double midium) {
        super(name);
        this.length = length;
        this.width = width;
        this.midium=midium;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getMidium() {
        return midium;
    }

    public void setMidium(double midium) {
        this.midium = midium;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "length=" + length +
                ", width=" + width +
                ", midium=" + midium +
                '}';
    }



    @Override
    public double getPerimeter() {
        return length+width+midium;
    }
}



