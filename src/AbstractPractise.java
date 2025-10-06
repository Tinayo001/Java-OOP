abstract class Shape {
    abstract void perimeter();
    abstract void area();
}

class Circle1 extends Shape {
    private double radius;

    Circle1(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void perimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The circle's perimeter is: " + perimeter);
    }

    @Override
    void area() {
        double area = Math.PI * (radius * radius);
        System.out.println("The circle's area is: " + area);
    }
}

class Rectangle1 extends Shape {
    private double length;
    private double width;

    Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void perimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("The rectangle's perimeter is: " + perimeter);
    }

    @Override
    void area() {
        double area = length * width;
        System.out.println("The rectangle's area is: " + area);
    }
}

public class AbstractPractise {
    public static void main(String[] args) {
        Shape shape1 = new Circle1(3.5);
        shape1.perimeter();
        shape1.area();

        Shape shape2 = new Rectangle1(4.5, 5.6);
        shape2.perimeter();
        shape2.area();
    }
}

