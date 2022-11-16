public class Main {
    public static void main(String[] args) {


        Shape triangle=new Triangle("Tringle",3.5,2.5,3.5);
        System.out.println(triangle.getPerimeter());
        Trapezoid trapezoid=new Trapezoid("Trapezoid",2.5,3.5,1.5,1.5);
        System.out.println(trapezoid.getPerimeter());
        Circle circle=new Circle("Circle",4.5);
        System.out.println(circle.getPerimeter());
        Rhombus rhombus=new Rhombus("Rhombus",3.8);
        System.out.println(rhombus.getPerimeter());
        Rectangle rectangle=new Rectangle("Rectangle",5.8,4.8);
        System.out.println(rectangle.getPerimeter());
    }
}