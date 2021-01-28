package day9.Task2;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

//    public static void main(String[] args) {
//        Triangle triangle = new Triangle(3.0,3.0,3.0,"Orange");
//
//        System.out.println(triangle.area());
//        System.out.println(triangle.perimeter());
//    }


    public Triangle(double a, double b, double c, String color) {
        this.a = a;
        this.b = b;
        this.c = c;
        super.setColor(color);
    }

    @Override
    public double area() {

        double p1 = (a + b + c) / 2.0;
        double area = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
        return area;
    }

    @Override
    public double perimeter() {
        double perimetr = a + b + c;
        return perimetr;
    }
}
