interface My {
void show();
}
class Outer1 {
    public void display() {
        // Anonymous class implementing interface My
        My obj = new My() {
            @Override
            public void show() {
                System.out.println("Hello from anonymous class!");
            }
        };
        // Call the method
        obj.show();
    }
}

public class LocalOuter {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        o.display();
    }
}

