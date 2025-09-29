public class Rectangle {
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }
    public double area() {
        double result = length * height;
        return result;
    }
    public double perimeter() {
        double perimeter = (length + height) * 2;
        return perimeter;
    }
    public boolean isSquare() {
        if (length == height) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3.5, 5);
        double result = r1.area();
        System.out.println("The area of the rectangle is " + result);

        double perimeter = r1.perimeter();
        System.out.println("The perimeter of the rectangle is " + perimeter);

        boolean isSquare = r1.isSquare();
        System.out.println("Is the rectangle square? " + isSquare);

    }
}
