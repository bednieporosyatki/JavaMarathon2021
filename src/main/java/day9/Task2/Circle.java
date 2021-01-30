package day9.Task2;

public class Circle extends Figure {
    private double radius;

//    public static void main(String[] args) {
//        Circle circle = new Circle(3,"red");
//        System.out.println(circle.area());
//        System.out.println(circle.perimeter());
//    }


    public double getRadius() {
        return radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
       this.radius=radius;
        double area = Math.PI * (radius * radius);
        return area;
    }

    @Override
    public double perimeter() {
        this.radius=radius;
        double circumference=Math.PI * 2*radius;
        return circumference;
    }
}
