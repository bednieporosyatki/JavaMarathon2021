package day9.Task2;

public class Rectangle extends Figure {
    private double width;
    private double height;

//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(2,2,"red");
//        System.out.println(rectangle.area());
//        System.out.println(rectangle.perimeter());
//    }

    public Rectangle(double width, double height, String color) {
        super(color); // родительские поля и методы идут в начале  -Всегда!!!
        this.width = width;
        this.height = height;

    }

    @Override
    public double area() {
        double area = width * height;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = (width + height) * 2;
        return perimeter;
    }
}
