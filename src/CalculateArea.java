import java.sql.SQLOutput;

class NegativeDimensionException extends Exception {
    public String toString() {

        return "Dimensions of a Rectangle cannot be negative!";
    }
}
public class CalculateArea {
    static int calculateArea(int a, int b) throws NegativeDimensionException {
        if (a < 0 || b < 0) {
            throw new NegativeDimensionException();
        }
        return a * b;

    }
    static void method1() throws NegativeDimensionException {
        System.out.println("The area is " + calculateArea(10, -5));
    }
    public static void main(String[] args) {
        try {
            method1();
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        }

    }
}
