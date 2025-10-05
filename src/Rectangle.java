public class Rectangle {
    private double length;
    private double height;

    // No-arg constructor so we can use setters later
    public Rectangle() {
        this.length = 1;  // default safe values
        this.height = 1;
    }

    // Constructor with parameters if we want to set directly
    public Rectangle(double length, double height) {
        setLength(length);   // use setters for validation
        setHeight(height);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be greater than 0");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Height must be greater than 0");
        }
    }

    public double area() {
        return length * height;
    }

    public double perimeter() {
        return 2 * (length + height);
    }

    public boolean isSquare() {
        return length == height;
    }

    public static void main(String[] args) {
        // ✅ Create empty rectangle then use setters
        Rectangle r1 = new Rectangle();
        r1.setHeight(16.5);
        r1.setLength(12.4);

        System.out.println("Length: " + r1.getLength());
        System.out.println("Height: " + r1.getHeight());
        System.out.println("The area of the rectangle is " + r1.area());
        System.out.println("The perimeter of the rectangle is " + r1.perimeter());
        System.out.println("Is it a square? " + r1.isSquare());
    }
}

