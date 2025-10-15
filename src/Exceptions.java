
public class Exceptions {
    public static void main(String[] args) {
        try {
            int A[] = {10, 20, 0, 14, 17};
            int c = A[0]/ A[2];
            System.out.println("The answer after division is " + c);
        } catch (ArithmeticException e) {
            System.out.println("You cant divide by zero");
        }

    }
}
