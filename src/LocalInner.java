class Outer {
    static int y = 20; // static variable
    int x = 10;        // instance variable

    // Inner class defined inside Outer
    class Inner {
        void display() {
            System.out.println("display : " + y);
            System.out.println("display : " + x);
        }
    }
}

public class LocalInner {
    public static void main(String[] args) {
        // First create an Outer object
        Outer outer = new Outer();
        // Then use it to create an Inner object
        Outer.Inner inner = outer.new Inner();

        // Call display()
        inner.display();
    }
}

