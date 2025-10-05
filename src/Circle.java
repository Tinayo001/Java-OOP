class Circle {
    public double radius;  // property

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Instance methods
    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter(); // calls the instance method
    }
}
class Cylinder extends Circle {
    public double height;

    // Constructor for Cylinder
    public Cylinder(double radius, double height) {
        super(radius); // call parent (Circle) constructor
        this.height = height;
    }

    public double volume() {
        return area() * height;  // base area * height
    }
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());

        Cylinder cylinder = new Cylinder(7, 10);
        System.out.println("Cylinder base area: " + cylinder.area());
        System.out.println("Cylinder volume: " + cylinder.volume());
    }
}

