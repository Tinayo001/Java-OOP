public class Circle {
    private double radius;  // property

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method
    public double doubleRadius() {
        return this.radius * 2;
    }

    public static void main(String[] args) {
        Circle c = new Circle(3.147);  // create an object
        double result = c.doubleRadius();  // call method on object
        System.out.println("The double of the radius is " + result);
    }
}

